package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile(String path, String SheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}
	
	public int findRowNumber(String filePath, String SheetName) throws Exception {
		int totalRowNumber=1;
		
		FileInputStream ExcelFile = new FileInputStream(filePath);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int startRow=1;
		int startCol=1;
		int totalRows;
		
		return totalRowNumber;
	}
	
	public int findColNumber(String filePath, String SheetName) throws Exception {
		int totalColNumber=1;
		return totalColNumber;
	}
	
	public static Object[][] getTableArray(String filePath, String SheetName) throws Exception {
		String[][] tabArray = null;
		
		try {
			FileInputStream ExcelFile = new FileInputStream(filePath);
			
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			
			int startRow=1;
			int startCol=1;
			int ci=0,cj=0;
			int totalRows=2;
			int totalCols=2;
			tabArray = new String[totalRows][totalCols];
			
			for(int i=startRow;i<=totalRows;i++,ci++) {
				cj=0;
				for(int j=startCol;j<=totalCols;j++,cj++) {
					tabArray[ci][cj]=getCellData(i,j);
					System.out.println(tabArray[ci][cj]);
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("Could not read the excel sheet");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the excel sheet");
		}
		return (tabArray);
	}
	
	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			String cellData=Cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}
	
}