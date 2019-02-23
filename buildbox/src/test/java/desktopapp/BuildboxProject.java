package desktopapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class BuildboxProject {

	public Screen s;
	// Method 1 launch application

// Method 1 launch application 1
//	@Test(priority = 0)
//	public void launch_application() {
//		try {
//			// String cmd = "open /Applications/Buildbox.app";
//			Process p = Runtime.getRuntime().exec("open /Applications/Buildbox.app");
//			Thread.sleep(9000);
//
//		} catch (Exception e) {
//
//		}
//	}
//
//	// Maximize and minimize the Application
//
//	@Test(priority = 1)
//
//	public void max_min_app() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//		// minimize application screen
//		s.click("minimize.png");
//		s.setAutoWaitTimeout(10);
//		// open application
//		s.click("openapp.png");
//		s.setAutoWaitTimeout(10);
//
//	}
//
//	@Test(priority = 2)
//	public void welc_screen_verify() throws FindFailed, InterruptedException {
//
//		// using screen class for verify element
//		Screen s = new Screen();
//		String image1 = "Build_logo.png";
//		String image2 = "Tutorial_video.png";
//		String image3 = "Simple_game_demo.png";
//		String image4 = "Platform_Demo.png";
//		String image5 = "DevBlog.png";
//		String image6 = "Game_of_day.png";
//		String image7 = "13GratePlace.png";
//		String image8 = "Buildbox+Android.png";
//		String image9 = "Game_of_day.png";
//		String image10 = "markon_buildbox.png";
//		String image11 = "create.png";
//		String image[] = { image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11 };
//
//		for (int i = 0; i < image.length; i++) {
//
//			if (s.exists(image[i]) != null) {
//				System.out.println("verfy the all element i is: " + i);
//			} else {
//				System.out.println("element is not present");
//			}
//
//		}
//	}
//
//	@Test(priority = 3)
//	public void clickable_link() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//
//		String click1 = "Build_logo.png";
//		String close = "closebrowserapp.png";
//		String click2 = "Tutorial_video.png";
//		String click3 = "DevBlog.png";
//		String click4 = "Game_of_day.png";
//		String click5 = "13GratePlace.png";
//		String click6 = "Buildbox+Android.png";
//		String click7 = "markon_buildbox.png";
//		// Verify page on browser
//		String image1 = "buildboxpage_verify.png";
//		String image2 = "Tutorial page.png";
//		String image3 = "Dev_Blog_page-verify.png";
//		String image4 = "arctic_smash_page_verify.png";
//		String image5 = "13 Great Place_page_verify.png";
//		String image6 = "How to Test Android_page_verify.png";
//
//		// verfy home page
//		s.click(click1);
//		s.wait(click1, 10);
//		Thread.sleep(5000);
//		s.find(image1);
//		s.setAutoWaitTimeout(15);
//		Thread.sleep(2000);
//		s.click(close);
//		s.wait(close, 10);
//		Thread.sleep(2000);
//
//		// verfy Tutorial page
//		s.click(click2);
//		s.wait(click2, 10);
//		Thread.sleep(2000);
//		s.find(image2);
//		s.setAutoWaitTimeout(15);
//		Thread.sleep(2000);
//		s.click(close);
//		s.setAutoWaitTimeout(20);
//		Thread.sleep(2000);
//
//		// verfy home page
//		s.click(click3);
//		s.wait(click3, 10);
//		Thread.sleep(2000);
//		s.find(image3);
//		s.setAutoWaitTimeout(15);
//		s.click(close);
//		s.setAutoWaitTimeout(20);
//		Thread.sleep(2000);
//
//		// verfy home page
//		s.click(click4);
//		s.wait(click4, 10);
//		Thread.sleep(2000);
//		s.find(image4);
//		s.setAutoWaitTimeout(15);
//		s.click(close);
//		s.setAutoWaitTimeout(20);
//		Thread.sleep(2000);
//
//		// verfy home page
//		s.click(click5);
//		s.wait(click5, 10);
//		Thread.sleep(2000);
//		s.find(image5);
//		s.setAutoWaitTimeout(15);
//		s.click(close);
//		s.setAutoWaitTimeout(20);
//		Thread.sleep(2000);
//
//		// verfy home page
//		s.click(click6);
//		s.wait(click6, 10);
//		Thread.sleep(2000);
//		s.find(image6);
//		s.setAutoWaitTimeout(15);
//		s.click(close);
//		s.setAutoWaitTimeout(20);
//		Thread.sleep(2000);
//
//		// Verify open build box startup button
//		s.click(click7);
//		s.setAutoWaitTimeout(30);
//	}
//
//	@Test(priority = 4)
//	public void creator_New_Game_Name() throws FindFailed, InterruptedException, AWTException {
//		Screen s = new Screen();
//		s.click("create.png");
//		s.setAutoWaitTimeout(10);
//		String Name = "NewGame.png";
//
//		if (s.exists(Name) != null) {
//			s.click("NewGame.png");
//			s.setAutoWaitTimeout(10);
//			System.out.println("element is present");
//		} else {
//			System.out.println("element not present");
//		}
//
//		// using Robot class for clear by default name
//
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_META);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_META);
//		Thread.sleep(2000);
//
//		robot.keyPress(KeyEvent.VK_META);
//		robot.keyPress(KeyEvent.VK_X);
//		robot.keyRelease(KeyEvent.VK_X);
//		robot.keyRelease(KeyEvent.VK_META);
//		Thread.sleep(2000);
//
//		// enter name from the keyboard
//
//		String text = "Our New Game";
//		StringSelection strinselection = new StringSelection(text);
//		Clipboard clickboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clickboard.setContents(strinselection, strinselection);
//
//		robot.keyPress(KeyEvent.VK_META);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_META);
//		Thread.sleep(3000);
//		// verify all element in creator screen
//
//	}
//
//	@Test(priority = 5)
//	public void verify_Game_type() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//
//		String image1 = "360shooter.png";
//		String image2 = "Avoidance.PNG";
//		String Fbutton = "forward.png";
//		String image4 = "Dogfight.png";
//		String image5 = "GravityPortal.png";
//		String Bbutton = "backword.png";
//		String image7 = "CarouserMiddle.png";
//		String image8 = "LastCarouser.png";
//
//		String GameType[] = { image1, image2, Fbutton, image4, Fbutton, image5, Bbutton, image7, image8 };
//
//		for (int m = 0; m < GameType.length; m++) {
//			if (s.exists(GameType[m]) != null) {
//				s.setAutoWaitTimeout(25);
//				Thread.sleep(300);
//				s.click(GameType[m]);
//				Thread.sleep(200);
//				System.out.println("verfy the all element m is: " + m);
//			} else {
//				System.out.println("verfy the all element m is not exits: " + m);
//			}
//		}
//	}
//
//	@Test(priority = 6)
//	public void verify_drop_down_basis_section() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//		String BSection = "drop-down-basic.png";
//		String image1 = "CoinsCollect.png";
//		String image2 = "Cointextdrop.png";
//		String image3 = "GlobalDistance.png";
//		String image4 = "GlobalDistancedrop.png";
//		String image5 = "GlobalSreen.png";
//
//		String Basis[] = { BSection, image1, image2, image3, image4, image5 };
//
//		for (int p = 0; p < Basis.length; p++) {
//
//			if (s.exists(Basis[p]) != null) {
//				s.setAutoWaitTimeout(50);
//				Thread.sleep(400);
//				s.click(Basis[p]);
//				Thread.sleep(400);
//				System.out.println("verfy the all element p is:" + p);
//			} else {
//				System.out.println("verfy the all element p is not exits: " + p);
//			}
//
//		}
//	}
//
//	@Test(priority = 7)
//	public void word_settins_drop_down() throws InterruptedException, FindFailed {
//		Screen s = new Screen();
//		String image1 = "single.png";
//		String image2 = "Multiselect.png";
//		String image3 = "Mulitdrop.png";
//		String image4 = "SelectSingle.png";
//		String image5 = "EndlessDropdown.png";
//		String image6 = "Endsense.png";
//		String image7 = "EndSencedrop.png";
//		String image8 = "SelectDefaualtEndLess.png";
//
//		String WorldSetting[] = { image1, image2, image3, image4, image5, image6, image7, image8 };
//
//		for (int t = 0; t < WorldSetting.length; t++) {
//
//			if (s.exists(WorldSetting[t]) != null) {
//				s.setAutoWaitTimeout(50);
//				Thread.sleep(300);
//				s.click(WorldSetting[t]);
//				Thread.sleep(300);
//				System.out.println("verfy the all element p is:" + t);
//			} else {
//				System.out.println("verfy the all element p is not exits: " + t);
//			}
//		}
//
//	}
//
//	@Test(priority = 8)
//	public void menu_setting() throws FindFailed, InterruptedException {
//		// element path image
//		Screen s = new Screen();
//
//		String image1 = "pauseRadiobutton.png";
//		String image2 = "CoinshopRadioButton.png";
//		String image3 = "InfoRadiobutton.png";
//
//		String radio[] = { image1, image2, image3 };
//		for (int r = 0; r < radio.length; r++) {
//			if (s.exists(radio[r]) != null) {
//				s.click(radio[r]);
//				Thread.sleep(100);
//			}
//
//		}
//
//	}
//
//	@Test(priority = 9)
//	public void create_gmae() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//		String create = "createbutton.PNG";
//		if (s.exists(create) != null) {
//			Thread.sleep(100);
//			s.click(create);
//			Thread.sleep(200);
//		}else {
//			System.out.println("exits element");
//		}
//	}
//
//	@Test(priority = 10)
//	public void OurGmae_screen_element() throws FindFailed, InterruptedException {
//		Screen s = new Screen();
//		s.setAutoWaitTimeout(20);
//		String image1 = "CharClickable.png";
//		String image2 = "Character.png";
//		String image3 = "EditChar.png";
//		String image4 = "circledrop.png";
//		String image5 = "PolygonSelect.png";
//		String image6 = "ClickPlusbutton.png";
//		String image7 = "SelectMinus.png";
//		String image8 = "SelectPolyImage.png";
//		String image9 = "searchButton.png";
//		String image10 = "/Users/hitesh/Desktop/Image/OurTeamScreen/Scrolldown.png";
//		String Game[] = {image1, image2, image3, image4, image5, image6, image7, image8, image9};
//		for (int G = 0; G<Game.length; G++) {
//			if (s.exists(Game[G]) != null) {
//				Thread.sleep(400);
//				s.click(Game[G]);
//				Thread.sleep(400);
//			} else {
//				System.out.println("element not fount G is not exits:" + G);
//			}
//
//		}
//		//String image10 = "Scrolldown.png";
//		 s.doubleClick(image10);
//		 s.type(Key.DOWN, KeyModifier.CMD);
//		 Thread.sleep(200);
//		 s.type(Key.DOWN, KeyModifier.CMD);
//		 Thread.sleep(200);
//		
//		 s.click(image1);
//		 s.setAutoWaitTimeout(20);
	
	
}
