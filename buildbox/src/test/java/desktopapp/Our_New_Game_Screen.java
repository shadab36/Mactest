package desktopapp;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Our_New_Game_Screen {
	@Test(priority = 9)
	public void create_gmae() throws FindFailed, InterruptedException {
		Screen s = new Screen();
		String create = "createbutton.PNG";
		if (s.exists(create) != null) {
			Thread.sleep(100);
			s.click(create);
			Thread.sleep(200);
		} else {
			System.out.println("exits element");
		}

	}

	@Test(priority = 10)
	public void OurGmae_screen_element() throws FindFailed, InterruptedException {
		Screen s = new Screen();
		s.setAutoWaitTimeout(20);
		String image1 = "CharClickable.png";
		String image2 = "Character.png";
		String image3 = "EditChar.png";
		String image4 = "circledrop.png";
		String image5 = "PolygonSelect.png";
		String image6 = "ClickPlusbutton.png";
		String image7 = "SelectMinus.png";
		String image8 = "SelectPolyImage.png";
		String image9 = "searchButton.png";
		String image10 = "/Users/hitesh/Desktop/Image/OurTeamScreen/Scrolldown.png";
		String Game[] = { image1, image2, image3, image4, image5, image6, image7, image8, image9 };
		for (int G = 0; G < Game.length; G++) {
			if (s.exists(Game[G]) != null) {
				Thread.sleep(400);
				s.click(Game[G]);
				Thread.sleep(400);
			} else {
				System.out.println("element not fount G is not exits:" + G);
			}

		}
		// String image10 = "Scrolldown.png";
		s.doubleClick(image10);
		s.type(Key.DOWN, KeyModifier.CMD);
		Thread.sleep(200);
		s.type(Key.DOWN, KeyModifier.CMD);
		Thread.sleep(200);

		s.click(image1);
		s.setAutoWaitTimeout(20);

	}
}