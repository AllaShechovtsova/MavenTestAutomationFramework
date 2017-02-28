package framework;

public class TestEnvironment {
	public static final String DATA_FILE = "C://Users//Пользователь//git//AllaMavenTestAutomationFramework//TestAutomationFramework//src//main//java//ini//Framework.ini";
	public String dataBaseConnectionString="";
	public String  dataBaseUserName="";
	public String dataBasePassword="";
	public String pathToEnvironmentCreationScripts="";
	public String pathToTestCaseDocument="";
	public String pathToReportingFolder="";
private String getValueFromFile (String fileName, String attributeName){
	String value="";
	//Open ini file
	//Go throgh all rows
	//Find row, which starts from attributeName
	//Return the content after '=' sign 
	
	return value;
}
	
	public void initialiseEnvironmentVariables() {
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
	public static void main(String[] args){
		
	 }
//End debug	
}
