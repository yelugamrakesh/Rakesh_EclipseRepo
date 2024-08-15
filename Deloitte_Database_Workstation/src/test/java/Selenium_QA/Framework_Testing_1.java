package Selenium_QA;

public class Framework_Testing_1 extends StoreRoom{

	
	
	
	
	public static void main(String[] args) throws Exception {
		StoreRoom s1=new StoreRoom();
		s1.browser("chrome","https://www.hyrtutorials.com/") ;
		s1.screenshot();
		s1.closeBrowser();
		System.out.println("Browser opened");
	}
	

	 
	
}
