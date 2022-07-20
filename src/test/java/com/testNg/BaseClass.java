package com.testNg;

import java.awt.AWTException;
import java.awt.List;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class BaseClass {
	public static WebDriver driver;
	Actions actions;
//1.	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	//2.
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	//3.
	public static void maximize() {
		driver.manage().window().maximize();
	}//4.
	public void type(WebElement element,String text) {
		element.sendKeys(text);
		
	}//5.
	public void click(WebElement element) {
		element.click();
	}//6.
	public String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
	public WebElement findElementByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element ;
		
	}
	public WebElement findElementByClassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
		
	}
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
		
	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAtrribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public String getAttribute(WebElement element,String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}
	public void selectOptionByText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectOptionByAttribute(WebElement element,String value) {
		Select sec=new Select(element);
		sec.selectByValue(value);
	}
	public void selectByindex(WebElement element,int index) {
		Select sec=new Select(element);
		sec.selectByIndex(index);
	}
	public void typeJs(String data,WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
	}
	public void jsClick(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",element);
	}
	public void launchUrlByNavigation(String url) {
		driver.navigate().to(url);
	}
	public static void staticWait(int milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}
	public void moveToElement(WebElement element) {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
	}
	public void contextClick(WebElement element) {
		Actions as=new Actions(driver);
		as.contextClick(element).perform();
		
	}
	public void doubleClick(WebElement element) {
		Actions as=new Actions(driver);
		as.doubleClick(element).perform();
	}
	public void dragAndDrop(WebElement element1,WebElement element2) {
		Actions action=new Actions(driver);
		action.dragAndDrop(element1, element2);
	}
	private void keyPress() throws AWTException {
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
	}
	public void keyRelease() throws AWTException {
		Robot rr=new Robot();
		rr.keyRelease(KeyEvent.VK_DOWN);
	}

		
	
	public Alert switchtoAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public void alertAccept() {
		Alert t = driver.switchTo().alert();
		t.accept();
		
	}
	public void dismiss() {
		Alert d = driver.switchTo().alert();
		d.dismiss();
	}
	public Set<String> windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public java.util. List<WebElement> findElements(String ssr) {
		java.util.List<WebElement> findElements = driver.findElements(By.cssSelector(ssr));
		return findElements;
	}
	public int lengthoftring(String value) {
		int length = value.length();
		return length;

	}
	public void closeWindow() {
		driver.close();
		
	}
	public static void quiitWindow() {
		driver.quit();
	}
	public int frameCount(String tagName) {
		java.util.List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		int a=0;
		for (int i = 0; i <findElements.size(); i++) {
			a++;
			
		}
		return a;
		
	}
	public void textClear(WebElement element) {
		element.clear();
		
	}
	public void navigation() {
		driver.navigate().refresh();
	}
	public void Backward() {
		driver.navigate().back();
	}
	public void pageForward() {
		driver.navigate().forward();
	}
	public void clickdouble(WebElement element) {
		Actions ac=new Actions(driver);
		ac.doubleClick(element).perform();
		
	}
	public void keysOn(WebElement element,Keys s) {

		actions.keyDown(s).perform();
		
	}
	public void keysOff(WebElement element,Keys k) {
		actions.keyUp(k).perform();
	}
	public String  AlertText(Alert alert) {
		String text = alert.getText();
		return text;
		
		
	}
	public void dropDown(WebElement element) {
		Select ss=new Select(element);
	}
	public String getData(String sheetname,int rownum,int cellnum) throws IOException {
		String res=null;
		File file=new File("C:\\Users\\Pravin R\\eclipse-workspace\\Practise\\data\\testtransfer.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		
		case STRING:
			res = cell.getStringCellValue();
			
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			}
			else {double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			BigDecimal valueOf = BigDecimal.valueOf(l);
			res = valueOf.toString();
				
			}
			
           break;
		default:
			break;
		}
		return res;
		
		
	}
	// update value in cell
	public void updateData(String sheetname,int rownum,int cellnum,String oldData,String newData) throws IOException, InvalidFormatException {
		File file=new File("C:\\Users\\Pravin R\\eclipse-workspace\\FrameWork\\datas\\testdata.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
			
		}
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
		
		
	}
	//insert value in cell
	public static void writeData(String pathFile,String sheetName,int rownum,int cellnum,String data) throws IOException {
		File file=new File(pathFile);
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell createCell = row.createCell(cellnum);
		createCell.setCellValue(data);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	
	
	
	
	
	}


