package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class launch_browser {
	private WebDriver driver;

	public launch_browser(int i,String url,String title){
		int choice =i ;
		try {
			if( i==1){
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver= new ChromeDriver();
				driver.get(url);
				String correct =driver.getTitle();

				System.out.println("the title is :"+correct/*toString().equals(title.toString())*/);
				if(correct==title/*.toString().equals(title.toString())*/)
				{
					System.out.println("pass");
					
				}
				else
				{
					System.out.println("fail");

				}
			}else if (i==2){
				WebDriverManager.firefoxdriver().setup();
				FirefoxDriver driver= new FirefoxDriver();
				driver.get(url);
				String correct =driver.getTitle();
				if(title==correct)
				{
					System.out.println("pass");
					
				}
				else
				{
					System.out.println("fail");

				}
				
			}else if (i==3){
				WebDriverManager.edgedriver().setup();
				SafariDriver driver= new SafariDriver();
				driver.get(url);
				String correct =driver.getTitle();
				if(title==correct)
				{
					System.out.println("pass");
					
				}
				else
				{
					System.out.println("fail");

				}
			}else if (i==4){
				WebDriverManager.iedriver().setup();
				InternetExplorerDriver driver= new InternetExplorerDriver();
				driver.get(url);
				String correct =driver.getTitle();
				System.out.println("Title is "+title);
				if(title==correct)
				{
					System.out.println("pass");
					
				}
				else
				{
					System.out.println("fail");

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("browser not found");
		}
		
	}
	
//	public void Setup_browser()
//	{
//		String URL= url;
//		String Title =title;
//	}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch_browser b = new launch_browser(1,"https://www.google.com/", "Google");


	}

}
