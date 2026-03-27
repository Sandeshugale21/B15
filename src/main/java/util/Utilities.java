package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public static String readProperty(String key) {
		File file = new File("src/test/resources/master.properties");
		Properties properties = null;

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
/*
	public static Map<Integer, List<Object>> readExcel(String sheetName) {
		File file = new File("src/test/resources/registrationdetails.xlsx");
		HashMap<Integer, List<Object>> userData = new HashMap<Integer, List<Object>>();
		List<Object> rowData = new ArrayList<Object>();

		FileInputStream fileInputStream;
		XSSFWorkbook xssfWorkbook = null;
		try {
			fileInputStream = new FileInputStream(file);
			xssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
			int lastRowNumber = xssfSheet.getLastRowNum();

			for (int i = 1; i <= lastRowNumber; i++) {
				XSSFRow xssfRow = xssfSheet.getRow(i);
				int lastCellNumber = xssfRow.getLastCellNum();
				rowData.clear();
				for (int j = 0; j < lastCellNumber; j++) {

					XSSFCell xssfCell = xssfRow.getCell(j);

					if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
						rowData.add(xssfCell.getStringCellValue());
					}
					if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						rowData.add(xssfCell.getNumericCellValue());
					}
					if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
						rowData.add(xssfCell.getRawValue());
					}
					if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
						rowData.add(xssfCell.getBooleanCellValue());
					}
				}

				userData.put(i, rowData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				xssfWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return userData;
	}

	public static void selectValueFromDropdown(WebElement dropdownElement, String dropDownValueToBeSelected) {
		Select select = new Select(dropdownElement);
		select.selectByVisibleText(dropDownValueToBeSelected);

	}  	*/
	
	
	public static void waitForElementToBeVisible(WebDriver driver, Long timeout, WebElement element) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(timeout	)).ignoring(TimeoutException.class)
		.pollingEvery(Duration.ofMillis(10)).until(ExpectedConditions.visibilityOf(element));
	}

}
