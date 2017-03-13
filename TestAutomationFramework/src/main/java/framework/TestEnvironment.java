package framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEnvironment {
	public static final String DATA_FILE = "C://Users//44-135//new_workspace//maven.1488027539228//TestAutomationFramework//src//main//java//ini//Framework.ini";
	public String dataBaseConnectionString="";
	public void setDataBaseConnectionString(String dataBaseConnectionString) {
		this.dataBaseConnectionString = dataBaseConnectionString;
	}

	public void setDataBaseUserName(String dataBaseUserName) {
		this.dataBaseUserName = dataBaseUserName;
	}

	public void setDataBasePassword(String dataBasePassword) {
		this.dataBasePassword = dataBasePassword;
	}

	public void setPathToEnvironmentCreationScripts(String pathToEnvironmentCreationScripts) {
		this.pathToEnvironmentCreationScripts = pathToEnvironmentCreationScripts;
	}

	public void setPathToTestCaseDocument(String pathToTestCaseDocument) {
		this.pathToTestCaseDocument = pathToTestCaseDocument;
	}

	public void setPathToReportingFolder(String pathToReportingFolder) {
		this.pathToReportingFolder = pathToReportingFolder;
	}
	public static String  dataBaseUserName="";
	public String dataBasePassword="";
	public String pathToEnvironmentCreationScripts="";
	public String pathToTestCaseDocument="";
	public String pathToReportingFolder="";
private String getValueFromFile (String fileName, String attributeName) throws IOException{
	ArrayList <String> stringArray = new ArrayList<String>();
	String value="";
	
	
	//Open ini file
	//Go throgh all rows
	//Find row, which starts from attributeName
	//Return the content after '=' sign 
	
	
	
	File inputFile = new File(fileName);
	FileInputStream fis = new FileInputStream(inputFile);
 
	//Construct BufferedReader from InputStreamReader
	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
 
	String line = null;
	
	
	while ((line = br.readLine()) != null) {
		
		if(line.length()!=0){	
			stringArray.add(line);
			
		}
	}
	for(int i=0; i<stringArray.size();i++){
		
		
			{char oneChar = ((CharSequence) stringArray).charAt(i);
			if ((int)oneChar ==72 ){
				
		 value=value.substring(i+1,value.length()-1);
	return value;
			}}}
	return line;}
			

	public void initialiseEnvironmentVariables() throws IOException {
		dataBaseConnectionString=getValueFromFile(DATA_FILE, "dataBaseConnectionString" );
		 dataBaseUserName=getValueFromFile(DATA_FILE, " dataBaseUserName" );
		 dataBasePassword=getValueFromFile(DATA_FILE, "dataBasePassword" );
		 pathToEnvironmentCreationScripts=getValueFromFile(DATA_FILE, "pathToEnvironmentCreationScripts" );
		 pathToTestCaseDocument=getValueFromFile(DATA_FILE, "pathToTestCaseDocument" );
		 pathToReportingFolder=getValueFromFile(DATA_FILE, "pathToReportingFolder" );
		
	}

	public void createEnvironment() {
		// TODO Auto-generated method stub

	}

	public void runTests() {
		// TODO Auto-generated method stub

	}

	public void sendTestReports() {
		// TODO Auto-generated method stub

	}
//Debug
	public static void main(String[] args) throws IOException{
		TestEnvironment myInstance= new TestEnvironment();
		
		System.out.println(myInstance.getValueFromFile(DATA_FILE,dataBaseUserName));
	 }
//End debug	
}
