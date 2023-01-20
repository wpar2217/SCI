package integrationExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apple {


public static void main(String[] args) throws Exception {

	File excelfile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Dec6th\\src\\test\\resources\\Test.xlsx");
	FileInputStream f1 = new FileInputStream(excelfile);
	XSSFWorkbook workbook = new XSSFWorkbook(f1);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowscount = sheet.getPhysicalNumberOfRows();
	int columnscount = sheet.getRow(0).getLastCellNum();
	String[][] data = new String[rowscount - 1][columnscount];
	for (int i = 0; i < rowscount - 1; i++) {
		for (int j = 0; j < columnscount; j++) {
			DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
		}
		System.out.println();
	}
	workbook.close();
	f1.close();
	for (String[] dataArr : data) {
		System.out.println(Arrays.toString(dataArr));
	}
}
}
