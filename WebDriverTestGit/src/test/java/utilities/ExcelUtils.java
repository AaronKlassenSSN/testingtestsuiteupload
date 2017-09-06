package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
	
	public static Object[][] getTableArray(String filePath, String SheetName) throws Exception {
		String[][] tabArray = null;
		try {
			FileInputStream ExcelFile = new FileInputStream(filePath);
			
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			String cellData="";
			int startRow=1;
			int startCol=1;
			int ci=0,cj=0;
			int totalRows=ExcelWSheet.getLastRowNum();
			int totalCols=ExcelWSheet.getRow(1).getLastCellNum() - 1;
			tabArray = new String[totalRows][totalCols];
			for(int i=startRow;i<=totalRows;i++,ci++) {
				cj=0;
				for(int j=startCol;j<=totalCols;j++,cj++) {
					tabArray[ci][cj]=getCellData(i,j);
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
			String cellData=Cell.toString();
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}
	
}