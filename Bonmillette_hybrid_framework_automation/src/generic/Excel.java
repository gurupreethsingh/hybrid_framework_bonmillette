package generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutomationConstants
{
	
	public static Object getData(String sheetname, int rownumber, int cellnumber)
	{
		Object value = null;
		try
		{
			File f = new File(excelSheetPath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(sheetname).getRow(rownumber).getCell(cellnumber);
			CellType cellType = cell.getCellType();
			
	 switch(cellType) {
            case STRING:
                value = cell.getStringCellValue();
                break;
                
            case NUMERIC:
                value = cell.getNumericCellValue();
                break;
                
            case BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
                
            case FORMULA:
                value = cell.getCellFormula();
                break;
                
            case BLANK:
                value = "";
                break;
                
            default:
                value = null;
        }
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		 return value;
	}

}
