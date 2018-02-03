package desktopapp;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class BuildboxProject {
	public static WebDriver driver;

	@Test(priority = 0)
	public void launch_application() {
		try {
			// String cmd = "open /Applications/Buildbox.app";
			Process p = Runtime.getRuntime().exec("open /Applications/Buildbox.app");
			Thread.sleep(9000);

		} catch (Exception e) {

		}
	}

	@Test(priority = 1)
	public void welc_screen_verify() throws FindFailed, InterruptedException {

		// using screen class for verify element
		Screen s = new Screen();
		s.setAutoWaitTimeout(10);

		String image1 = "Build_logo.png";
		String image2 = "Tutorial_video.png";
		String image3 = "Simple_game_demo.png";
		String image4 = "Platform_Demo.png";
		String image5 = "DevBlog.png";
		String image6 = "Game_of_day.png";
		String image7 = "13GratePlace.png";
		String image8 = "Buildbox+Android.png";
		String image9 = "Game_of_day.png";

		String image[] = { image1, image2, image3, image4, image5, image6, image7, image8, image9, };

		for (int i = 0; i < image.length; i++) {

			if (s.exists(image[i]) != null) {
				System.out.println("verfy the all element i is: " + i);
			} else {
				System.out.println("element is not present");
			}

		}
	}

	@Test(priority = 2)
	public void clickable_link() throws FindFailed, InterruptedException {
		Screen cs = new Screen();

		String click1 = "Build_logo.png";
		String close = "Closebrowser.png";
		String click2 = "Tutorial_video.png";
		String click3 = "DevBlog.png";
		String click4 = "Game_of_day.png";
		String click5 = "13GratePlace.png";
		String click6 = "Buildbox+Android.png";
		String clickable[] = { click1, close, click2, close, click3, close, click4, close, click5, close, click6,
				close };
		for (int j = 0; j < clickable.length; j++) {
			if (cs.exists(clickable[j]) != null) {
				cs.click(clickable[j]);
				Thread.sleep(3000);

				System.out.println("verfy the all element j is: " + j);
			} else {
				System.out.println("element is not present");
			}

		}

	}

	@Test(priority = 3)
	public void verify_browser_title() throws InterruptedException {

		// launch local browser
		System.setProperty("webdriver.chrome.driver", "//Users//hitesh//Downloads//chromedriver");

		ChromeOptions options = new ChromeOptions();
		// disable notification
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		options.addArguments("disable-notifications");
		// open Url

		String Url1 = "https://www.buildbox.com";
		String Url2 = "https://www.buildbox.com//tutorials";
		String Url3 = "https://www.buildbox.com/dev-blog-1-buildbox-software-update/";
		String Url4 = "https://www.buildbox.com/arctic-smash-apples-pick-for-game-of-the-day/";
		String Url5 = "https://www.buildbox.com/13-places-to-find-free-game-sound-effects/";
		String Url6 = "https://www.buildbox.com/how-to-test-your-games-using-android-studio/";

		// verify Home page title of buildbox app on browser
		driver.get(Url1);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Buildbox"));

		// Verfiy Tutorial page
		driver.get(Url2);
		String title1 = driver.getTitle();
		Assert.assertTrue(title1.contains("Tutorials - Buildbox"));

		// Verify dev_blog page
		driver.get(Url3);
		String title2 = driver.getTitle();
		Assert.assertTrue(title2.contains("Dev Blog #1 - Buildbox Software Development Update - Buildbox"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Verify Game of the day page is verify
		driver.get(Url4);
		String title3 = driver.getTitle();
		Assert.assertTrue(title3.contains("Arctic Smash: Apple’s Pick for Game of the Day - Buildbox"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Verify !3 Great places to Find tree page
		driver.get(Url5);
		String title4 = driver.getTitle();
		Assert.assertTrue(title4.contains("13 Great Places to Find Free Game Sound Effects - Buildbox"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Test on Android page is verify
		driver.get(Url6);
		String title5 = driver.getTitle();
		Assert.assertTrue(title5.contains("How to Test Your Games Using Android Studio - Buildbox"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.close();
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void simple_demo_element() throws FindFailed {
		Screen scn=new Screen();
		scn.click("Simple_game_demo.png");
		scn.setAutoWaitTimeout(10);
       
		//verify all element in simple demo section
		
//		String image1="Characters.png";
//		String image2="/Users/hitesh/Desktop/Image/SimpleDG/character.png";
//		String image3="";
//		
		
		
	}

}