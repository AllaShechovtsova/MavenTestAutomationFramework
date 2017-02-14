package MavenTestAutomationProject.TestAutomationFramework;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private JunitDemonstration checkOne;
	
	
	
	   // test method to add two values
	   public void testFunction1Test1(){
		   checkOne= new JunitDemonstration();
	      
	      assertTrue(checkOne.myFunction1(10) == 110);
	     
	   }
	   public void testFunction1Test2(){
		   checkOne= new JunitDemonstration();
	      
	    
	      assertTrue(checkOne.myFunction1(11) == 140);
	   }
}
