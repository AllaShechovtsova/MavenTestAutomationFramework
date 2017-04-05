package framework;

import java.io.BufferedReader;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestEnvironment {
	//public static final String DATA_FILE = "C://Users//Sergii//git//AllaRepo//MavenTestAutomationFramework//TestAutomationFramework//src//main//java//ini//Framework.ini";
	public static final String DATA_FILE = "C://Users//TEMP//git//MavenTestAutomationFramework//MavenTestAutomationFramework//TestAutomationFramework//src//main//java//ini//Framework_home.ini";
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	public String dataBaseConnectionString="";
	
	public static String  dataBaseUserName="";
	public String dataBasePassword="";
	public String pathToEnvironmentCreationScripts="";
	public String pathToTestCaseDocument="";
	public String pathToReportingFolder="";

	private String getValueFromFile(String fileName, String keyWord) {

		String value = "";
		String line = "";
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
if (keyWord.length()<line.length()) {
				if (line.substring(0, keyWord.length()).equals(keyWord)) {
					value = line.substring(keyWord.length() + 1, line.length());
				}
}
			}
			bufferedReader.close();
			return value;

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
			return value;
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			return value;
		}
}
			

	public void initialiseEnvironmentVariables() throws IOException {
		dataBaseConnectionString=getValueFromFile(DATA_FILE, "dataBaseConnectionString" );
		 dataBaseUserName=getValueFromFile(DATA_FILE, "dataBaseUserName" );
		 dataBasePassword=getValueFromFile(DATA_FILE, "dataBasePassword" );
		 pathToEnvironmentCreationScripts=getValueFromFile(DATA_FILE, "pathToEnvironmentCreationScripts" );
		 pathToTestCaseDocument=getValueFromFile(DATA_FILE, "pathToTestCaseDocument" );
		 pathToReportingFolder=getValueFromFile(DATA_FILE, "pathToReportingFolder" );
	
		
	}
	
	public void createEnvironment() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException  {
		   //1. open text file with scrips
		  //2. read line by line
		  //3. open connection database
		  //4.exsecute query from line
		  
		    
		  
		  String sqlStatement = "";
		  Connection conn = null;
		  Statement stmt = null; 
		  Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection("jdbc:mysql://localhost", "root","root" );
		  File f = new File(pathToEnvironmentCreationScripts);

		        BufferedReader b = new BufferedReader(new FileReader(f));
		      

		        

		        while ((sqlStatement = b.readLine()) != null) {
		         stmt = conn.createStatement(); 
		         stmt.executeUpdate(sqlStatement);
		         
		         
		         
		        }
	}

	public void anotherHelpRunTests() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		//1.open text file with sql queries
		//2.open blank exsel work book,create sheet and create structure like a file TestCases.xlsx
		//3.put all sql queries from text file to exsel
		//4.execute every query and write result to exsel in form of 1001;2001;3001;
		Connection conn = null;
		  Statement stmt = null; 
		  Class.forName("com.mysql.jdbc.Driver");
		  //conn = DriverManager.getConnection(dataBaseConnectionString, dataBaseUserName,dataBasePassword );
		  conn = DriverManager.getConnection("jdbc:mysql://localhost", dataBaseUserName,dataBasePassword );
		  stmt = conn.createStatement();
		  String sql = "SELECT flightNumber FROM `testclub`.`flight` WHERE departureAirport='London' AND arrivalAirport='Munich' AND averageTicketPrice<100 AND availableSeats>4";
	       ResultSet rs = stmt.executeQuery(sql);
	       while(rs.next()){
	           //Retrieve by column name
	           int flightNumber  = rs.getInt("flightNumber");
	          
	           //Display values
	           System.out.print(flightNumber+";");
	         
	        }
	        rs.close();
		
		
	}

	public void sendTestReports() {
		// TODO Auto-generated method stub

	}

}




/*Debug
	public static void main(String[] args) throws IOException{
		TestEnvironment myInstance= new TestEnvironment();
		
		System.out.println(myInstance.getValueFromFile(DATA_FILE,"pathToEnvironmentCreationScripts"));
	 }
End debug	*/
