package desktopapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Buildbox {

	@Test
	public void deskto_app() throws IOException, InterruptedException, FindFailed, AWTException {
		// launch the desktop
		String cmd = "open /Applications/Buildbox.app";
		Process p = Runtime.getRuntime().exec(cmd);

		Thread.sleep(14000);
		// Using screen class for capture
		Screen screen = new Screen();
		screen.setAutoWaitTimeout(10);

		// click on crate new
		screen.doubleClick("create.PNG");
		screen.setAutoWaitTimeout(10);

		Thread.sleep(2000);
		// This selects one of the items in the combo box.
		// Mouse.move(450, 50);
		// Mouse.down(Button.RIGHT);
		// Thread.sleep(1000);
		// Mouse.up();

		screen.click("NewGame.PNG");
		screen.setAutoWaitTimeout(10);

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
		StringSelection stringselection = new StringSelection(text);
		Clipboard clickboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clickboard.setContents(stringselection, stringselection);

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);

		// on basic setting screen click on drop down aarow button
		screen.doubleClick("drop-down-basic.png");
		screen.setAutoWaitTimeout(10);

		// click on game type drop-down

		screen.doubleClick("single.PNG");
		screen.setAutoWaitTimeout(10);

		// select menu option from menu settings
		screen.doubleClick("Endless.PNG");
		screen.setAutoWaitTimeout(10);

		// mark pause field
		screen.click("pause.PNG");
		screen.setAutoWaitTimeout(10);

		// mark info check box field
		screen.click("info.PNG");
		screen.setAutoWaitTimeout(10);

		// //click on forward (arrow) button
		screen.click("forward.PNG");
		screen.setAutoWaitTimeout(10);

		// click on backward (arrow) button

		screen.click("backword.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		// select avoidance type game
		screen.click("Avoidance.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		screen.click("createbutton.PNG");
		screen.setAutoWaitTimeout(10);

		// play game demo
		screen.click("playgame.PNG");
		screen.setAutoWaitTimeout(10);

		// start game
		screen.click("start.PNG");
		screen.setAutoWaitTimeout(10);

		// pause game
		screen.click("pausegame.PNG");
		screen.setAutoWaitTimeout(10);

		// click on char menu option
		screen.click("Characters.PNG");
		screen.click("Characters.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on objects menu option
		screen.click("objects.PNG");
		screen.click("objects.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);
		//
		// click on effect options
		screen.click("effects.PNG");
		screen.click("effects.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on logic options
		screen.click("logic.PNG");
		screen.click("logic.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on labels field
		screen.click("labels.PNG");
		screen.click("labels.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on setting button
		screen.click("setting.PNG");
		screen.setAutoWaitTimeout(10);
		//
		//
		//
		screen.click("controller.PNG");
		screen.setAutoWaitTimeout(10);

		screen.click("Advertisements.PNG");
		screen.setAutoWaitTimeout(10);

		// close setting option all fields
		screen.click("ok_button.PNG");
		screen.setAutoWaitTimeout(10);

		// click on tree view
		screen.doubleClick("treeview.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(2000);
		// click on screen
		
		// click home build
		try{
			
			screen.doubleClick("homescreen.PNG");
			screen.setAutoWaitTimeout(10);
			Thread.sleep(1000);
			
		screen.doubleClick("home.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		}catch(Exception e){
			
		}
		// close app
		screen.doubleClick("cross-icon.PNG");
		screen.setAutoWaitTimeout(10);

		
	}

}
