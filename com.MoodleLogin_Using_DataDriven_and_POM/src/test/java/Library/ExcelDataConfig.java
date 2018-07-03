package Library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataConfig {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	
	public ExcelDataConfig(String Excelpath)
	{
		try {
			File src=new File(Excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public  String readdata(int SheetNo, int RowNo, int CellNo)
	{
		sheet=wb.getSheetAt(SheetNo);
		String Cellname=sheet.getRow(RowNo).getCell(CellNo).getStringCellValue();
		System.out.println(Cellname);
		return Cellname;
	
	}
	
	public int rowcount(int sheetIndex)
	{
		int Totalrows=wb.getSheetAt(sheetIndex).getLastRowNum();
		
		Totalrows=Totalrows+1;
		return Totalrows;
	}
	

}
