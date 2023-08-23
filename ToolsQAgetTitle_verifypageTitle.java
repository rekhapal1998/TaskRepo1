package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
//code to print title of the page and verify the title

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("DEMOQA")) {
			System.out.println("title matched");
		} else {
			System.out.println("title not matched");
		}

		// OR

		// System.out.println(driver.getTitle());

		// String expectedTitle = "Demo";
		// String title = driver.getTitle();
		// if (title.equalsIgnoreCase(expectedTitle)) {
		// System.out.println("Title Matched");
		// } else {
		// System.out.println("Not a match");
		// }
		driver.close();
	}

}

