import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelreader {

    XSSFWorkbook wb;
    public excelreader(){
        File src = new File("C:/My work/aBC_config/excel/data.xlsx");

        try {
            FileInputStream fis= new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public String getdata(String sheetname, int row, int column)
    {
        return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
    }
}
