package desktopapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import org.testng.annotations.Test;

public class CreatorScreen {

	@Test(priority = 4)
	public void creator_New_Game_Name() throws FindFailed, InterruptedException, AWTException {
		Screen s = new Screen();
		s.click("create.png");
		s.setAutoWaitTimeout(10);
		String Name = "NewGame.png";

		if (s.exists(Name) != null) {
			s.click("NewGame.png");
			s.setAutoWaitTimeout(10);
			System.out.println("element is present");
		} else {
			System.out.println("element not present");
		}

		// using Robot class for clear by default name

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(2000);

		// enter name from the keyboard

		String text = "Our New Game";
		StringSelection strinselection = new StringSelection(text);
		Clipboard clickboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clickboard.setContents(strinselection, strinselection);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		Thread.sleep(3000);
		// verify all element in creator screen

	}

	@Test(priority = 5)
	public void verify_Game_type() throws FindFailed, InterruptedException {
		Screen s = new Screen();

		String image1 = "360shooter.png";
		String image2 = "Avoidance.PNG";
		String Fbutton = "forward.png";
		String image4 = "Dogfight.png";
		String image5 = "GravityPortal.png";
		String Bbutton = "backword.png";
		String image7 = "CarouserMiddle.png";
		String image8 = "LastCarouser.png";

		String GameType[] = { image1, image2, Fbutton, image4, Fbutton, image5, Bbutton, image7, image8 };

		for (int m = 0; m < GameType.length; m++) {
			if (s.exists(GameType[m]) != null) {
				s.setAutoWaitTimeout(25);
				Thread.sleep(300);
				s.click(GameType[m]);
				Thread.sleep(200);
				System.out.println("verfy the all element m is: " + m);
			} else {
				System.out.println("verfy the all element m is not exits: " + m);
			}
		}
	}

	@Test(priority = 6)
	public void verify_drop_down_basis_section() throws FindFailed, InterruptedException {
		Screen s = new Screen();
		String BSection = "drop-down-basic.png";
		String image1 = "CoinsCollect.png";
		String image2 = "Cointextdrop.png";
		String image3 = "GlobalDistance.png";
		String image4 = "GlobalDistancedrop.png";
		String image5 = "GlobalSreen.png";

		String Basis[] = { BSection, image1, image2, image3, image4, image5 };

		for (int p = 0; p < Basis.length; p++) {

			if (s.exists(Basis[p]) != null) {
				s.setAutoWaitTimeout(50);
				Thread.sleep(400);
				s.click(Basis[p]);
				Thread.sleep(400);
				System.out.println("verfy the all element p is:" + p);
			} else {
				System.out.println("verfy the all element p is not exits: " + p);
			}

		}
	}

	@Test(priority = 7)
	public void word_settins_drop_down() throws InterruptedException, FindFailed {
		Screen s = new Screen();
		String image1 = "single.png";
		String image2 = "Multiselect.png";
		String image3 = "Mulitdrop.png";
		String image4 = "SelectSingle.png";
		String image5 = "EndlessDropdown.png";
		String image6 = "Endsense.png";
		String image7 = "EndSencedrop.png";
		String image8 = "SelectDefaualtEndLess.png";

		String WorldSetting[] = { image1, image2, image3, image4, image5, image6, image7, image8 };

		for (int t = 0; t < WorldSetting.length; t++) {

			if (s.exists(WorldSetting[t]) != null) {
				s.setAutoWaitTimeout(50);
				Thread.sleep(300);
				s.click(WorldSetting[t]);
				Thread.sleep(300);
				System.out.println("verfy the all element p is:" + t);
			} else {
				System.out.println("verfy the all element p is not exits: " + t);
			}
		}

	}

	@Test(priority = 8)
	public void menu_setting() throws FindFailed, InterruptedException {
		// element path image
		Screen s = new Screen();

		String image1 = "pauseRadiobutton.png";
		String image2 = "CoinshopRadioButton.png";
		String image3 = "InfoRadiobutton.png";

		String radio[] = { image1, image2, image3 };
		for (int r = 0; r < radio.length; r++) {
			if (s.exists(radio[r]) != null) {
				s.click(radio[r]);
				Thread.sleep(100);
			}

		}

	}
}
