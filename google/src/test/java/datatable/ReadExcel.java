package datatable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	//public static String path ;
	private  static HSSFWorkbook wb;
	private static HSSFSheet sheet;
	
	
	public static void getExcelSheet(String path,int index) throws IOException {
		FileInputStream file = new FileInputStream(new File(path));
		wb = new HSSFWorkbook(file);
		sheet = wb.getSheetAt(index);
		
	}
	
	public static String getCellData(int rowNum ,int colNum ) {
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
	}
	
	public static void setCellData(String path ,String result , int rownum , int colnum) throws IOException {
		 FileInputStream file = new FileInputStream(new File(path));
		    wb = new HSSFWorkbook(file);
		    sheet = wb.getSheetAt(0);
			sheet.getRow(rownum).createCell(colnum).setCellValue(result);
         
			FileOutputStream out = new FileOutputStream(new File(path));
			wb.write(out);
			out.close();
	}
}
