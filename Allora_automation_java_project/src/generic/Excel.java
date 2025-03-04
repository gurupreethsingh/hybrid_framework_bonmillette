
package generic;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class Excel implements AutomationConstants {

    /**
     * Reads data from an Excel file based on sheet name, row number, and cell number.
     *
     * @param sheetName  Name of the Excel sheet.
     * @param rowNumber  Row index (starting from 0).
     * @param cellNumber Column index (starting from 0).
     * @return The data from the specified cell as an Object (String, Number, Boolean, etc.).
     */
    public static Object getData(String sheetName, int rowNumber, int cellNumber) {
        FileInputStream fis = null;
        Workbook workbook = null;
        Object value = null;

        try {
            // Load the Excel file
            File file = new File(excelSheetPath);
            fis = new FileInputStream(file);
            workbook = WorkbookFactory.create(fis);

            // Get the requested cell
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.err.println("❌ Error: Sheet '" + sheetName + "' not found in the Excel file.");
                return null;
            }

            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                System.err.println("❌ Error: Row " + rowNumber + " is empty in the sheet '" + sheetName + "'.");
                return null;
            }

            Cell cell = row.getCell(cellNumber);
            if (cell == null) {
                System.err.println("❌ Error: Cell [" + rowNumber + "," + cellNumber + "] is empty in sheet '" + sheetName + "'.");
                return null;
            }

            // Get cell type and retrieve the value accordingly
            CellType cellType = cell.getCellType();

            switch (cellType) {
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
        } catch (Exception ex) {
            System.err.println("❌ Error: Unable to read data from Excel.");
            ex.printStackTrace();
        } finally {
            try {
                if (workbook != null) workbook.close();
                if (fis != null) fis.close();
            } catch (Exception e) {
                System.err.println("⚠️ Warning: Failed to close Excel file.");
                e.printStackTrace();
            }
        }

        return value;
    }
}
