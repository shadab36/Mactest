package desktopapp;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class BuildboxProject {

	public static WebDriver driver;

	// Method 1 launch application

	@Test(priority = 0)
	public void launch_application() {
		try {
			// String cmd = "open /Applications/Buildbox.app";
			Process p = Runtime.getRuntime().exec("open /Applications/Buildbox.app");
			Thread.sleep(9000);

		} catch (Exception e) {

		}
	}

	// Maximize and minimize the Application

	@Test(priority = 1)

	public void max_min_app() throws FindFailed, InterruptedException {
		Screen s = new Screen();
		Thread.sleep(2000);
		// minimize application screen
		s.click("/Users/hitesh/Desktop/Image/max-minapplication/minimize.png");
		s.setAutoWaitTimeout(10);
		// open application
		s.click("/Users/hitesh/Desktop/Image/max-minapplication/openapp.png");
		s.setAutoWaitTimeout(10);

	}

	@Test(priority = 2)
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

	@Test(priority = 3)
	public void clickable_link() throws FindFailed, InterruptedException {
		Screen cs = new Screen();

		String click1 = "Build_logo.png";
		String close = "Closebrowser.png";
		String click2 = "Tutorial_video.png";
		String click3 = "DevBlog.png";
		String click4 = "Game_of_day.png";
		String click5 = "13GratePlace.png";
		String click6 = "Buildbox+Android.png";

		// Verify page on browser
		String image1 = "/Users/hitesh/Desktop/Image/max-minapplication/buildboxpage_verify.png";
		String image2 = "Users/hitesh/Desktop/Image/max-minapplication/Tutorial page.png";
		String image3 = "/Users/hitesh/Desktop/Image/max-minapplication/Dev_Blog_page-verify.png";
		String image4 = "/Users/hitesh/Desktop/Image/max-minapplication/arctic_smash_page_verify.png";
		String image5 = "/Users/hitesh/Desktop/Image/max-minapplication/13 Great Place_page_verify.png";
		String image6 = "/Users/hitesh/Desktop/Image/max-minapplication/rrdf.png";

		// verfy home page
		cs.click(click1);
		cs.wait(click1, 10);
		Thread.sleep(2000);
		cs.exists(image1);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.wait(close, 10);
		Thread.sleep(2000);

		// verfy Tutorial page
		cs.click(click2);
		cs.wait(click2, 10);
		Thread.sleep(2000);
		cs.exists(image2);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.setAutoWaitTimeout(20);
		Thread.sleep(2000);

		// verfy home page
		cs.click(click3);
		cs.wait(click3, 10);
		Thread.sleep(2000);
		cs.exists(image3);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.setAutoWaitTimeout(20);
		Thread.sleep(2000);

		// verfy home page
		cs.click(click4);
		cs.wait(click4, 10);
		Thread.sleep(2000);
		cs.exists(image4);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.setAutoWaitTimeout(20);
		Thread.sleep(2000);

		// verfy home page
		cs.click(click5);
		cs.wait(click5, 10);
		Thread.sleep(2000);
		cs.exists(image5);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.setAutoWaitTimeout(20);
		Thread.sleep(2000);

		// verfy home page
		cs.click(click6);
		cs.wait(click6, 10);
		Thread.sleep(2000);
		cs.exists(image6);
		cs.setAutoWaitTimeout(15);
		cs.click(close);
		cs.setAutoWaitTimeout(20);
		Thread.sleep(2000);

	}

	//
	// @Test(priority = 5)
	// public void simple_demo_element() throws FindFailed {
	// Screen scn = new Screen();
	// scn.click("Simple_game_demo.png");
	// scn.setAutoWaitTimeout(10);

	// verify all element in simple demo section

	// String image1="Characters.png";
	// String image2="/Users/hitesh/Desktop/Image/SimpleDG/character.png";
	// String image3="";
	//
}
