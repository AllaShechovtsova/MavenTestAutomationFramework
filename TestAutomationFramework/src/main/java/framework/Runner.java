package framework;

import java.io.IOException;
import java.sql.SQLException;

public class Runner {
 
 public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
	 TestEnvironment myInstance=new TestEnvironment();
	 myInstance.initialiseEnvironmentVariables();
	 //myInstance.createEnvironment();
	//myInstance.anotherHelpRunTests();
	myInstance.writeIntoExcel();
	//myInstance.runTests();
	// myInstance.sendTestReports();
 }
}
