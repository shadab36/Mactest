package desktopapp;
//changed by pavan in Brach Pavan
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
public class WelcomeScreen {
	@Test(priority = 1)
	public void runApp() throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec(LaunchApp.Open_app);
		Thread.sleep(8000);

	}

	@Test(priority = 2)
	public void welc_screen_verify() throws FindFailed, InterruptedException {

		// using screen class for verify element
		Screen s = new Screen();
		String image1 = "Build_logo.png";
		String image2 = "Tutorial_video.png";
		String image3 = "Simple_game_demo.png";
		String image4 = "Platform_Demo.png";
		String image5 = "16Surprising.png";
		
		String image6 = "DevBlog.png";
		String image7 = "Game_of_day.png";
		String image8 = "13GratePlace.png";
		
		
		String image9 = "create.png";
		String image[] = {image1, image2, image3, image4, image5, image6, image7, image8, image9};

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
		Screen s = new Screen();

		String click1 = "Build_logo.png";
		String close = "Closebrowser.png";
		String click2 = "Tutorial_video.png";
		String click3 = "DevBlog.png";
		String click4 = "Game_of_day.png";
		String click5 = "13GratePlace.png";
		String click6 = "16Surprising.png";
		
		// Verify page on browser
		String image1 = "buildboxpage_verify.png";
		String image2 = "Tutorial page.png";
		String image3 = "Dev_Blog_page-verify.png";
		String image4 = "arctic_smash_page_verify.png";
		String image5 = "13 Great Place_page_verify.png";
		

		// verfy home page
		s.click(click1);
		s.wait(click1, 10);
		Thread.sleep(5000);
		s.find(image1);
		s.setAutoWaitTimeout(15);
		Thread.sleep(2000);
		s.click(close);
		s.wait(close, 10);
		Thread.sleep(2000);

		// verfy Tutorial page
		s.click(click2);
		s.wait(click2, 10);
		Thread.sleep(2000);
		s.find(image2);
		s.setAutoWaitTimeout(15);
		Thread.sleep(2000);
		s.click(close);
		s.setAutoWaitTimeout(10);
		Thread.sleep(2000);

		// verfy home page
		s.click(click3);
		s.wait(click3, 10);
		Thread.sleep(2000);
		s.find(image3);
		s.setAutoWaitTimeout(15);
		s.click(close);
		s.setAutoWaitTimeout(10);
		Thread.sleep(2000);

		// verfy home page
		s.click(click4);
		s.wait(click4, 10);
		Thread.sleep(2000);
		s.find(image4);
		s.setAutoWaitTimeout(15);
		s.click(close);
		s.setAutoWaitTimeout(10);
		Thread.sleep(2000);

		// verfy home page
		s.click(click5);
		s.wait(click5, 10);
		Thread.sleep(2000);
		s.find(image5);
		s.setAutoWaitTimeout(15);
		s.click(close);
		s.setAutoWaitTimeout(10);
		Thread.sleep(2000);

		// verfy home page
		s.click(click6);
		s.wait(click6, 10);
		Thread.sleep(4000);

		s.click(close);
		s.setAutoWaitTimeout(10);
		Thread.sleep(2000);

		// Verify open build box startup button
	
	}
}