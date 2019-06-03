package MavenSeleniumGrid;

import org.testng.annotations.Test;

public class TesTJunit {

	
	public class TestJunit {

		    @Test
		   public void testAdd() {
		      String str = "Junit testing using TestNG";
		      AssertEquals("Junit testing using TestNG",str);
		   }

			private void AssertEquals(String string, String str) {
				// TODO Auto-generated method stub
				
				System.out.println("New line has added");
				System.out.println("code updated from  git repository.It should get reflected in eclipse project ");
				
			}

		
		
	}

	
}
		
		
		
	
	

