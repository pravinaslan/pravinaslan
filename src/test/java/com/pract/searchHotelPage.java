package com.pract;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testNg.BaseClass;

public class searchHotelPage extends BaseClass {
	public searchHotelPage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckindate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckoutdate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerroom;
	
	@FindBy(id="child_room")
	private WebElement dDnchildrenInRoom;
	
	@FindBy(id="Submit")
	private WebElement btnsearch;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getTxtCheckindate() {
		return txtCheckindate;
	}

	public WebElement getTxtCheckoutdate() {
		return txtCheckoutdate;
	}

	public WebElement getdDnAdultsPerroom() {
		return dDnAdultsPerroom;
	}

	public WebElement getdDnchildrenInRoom() {
		return dDnchildrenInRoom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	
	public void searchHotels(String locaton,String hotels,String roomType,String noOfRooms,String checkindate,String checkoutdate, String adultsperRoom,String chuldrensperRoom) {
		selectOptionByText(getdDnlocation(), locaton);
		selectOptionByText(getdDnhotels(), hotels);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByText(getdDnRoomNos(), noOfRooms);
		textClear(getTxtCheckindate());
		textClear(getTxtCheckoutdate());
		type(getTxtCheckindate(),checkindate);
		type(getTxtCheckoutdate(), checkoutdate);
		selectOptionByText(getdDnAdultsPerroom(), adultsperRoom);
		selectOptionByText(getdDnchildrenInRoom(), chuldrensperRoom);
		click(getBtnsearch());
		
		
	}
	

}
