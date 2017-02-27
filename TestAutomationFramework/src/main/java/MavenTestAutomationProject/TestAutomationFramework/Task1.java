package MavenTestAutomationProject.TestAutomationFramework;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
 
public class Task1 {
	
	
	 
	    public static void main(String[] args) throws Exception {
	        InputStream in = new FileInputStream("/temp/databaseTables");
	        
	        HSSFWorkbook wb = new HSSFWorkbook();
	 
	        ExcelExtractor extractor = new ExcelExtractor(wb);
	        extractor.setIncludeSheetNames(true);
	        String text = extractor.getText();
	 
	        System.out.println();
	 
	    }
	}

