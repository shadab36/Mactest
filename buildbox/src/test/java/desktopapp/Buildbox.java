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

		Thread.sleep(9000);
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
		screen.doubleClick("//Users//hitesh//Desktop//Image//drop-down-basic.png");
		screen.setAutoWaitTimeout(10);

		// click on game type drop-down

		screen.doubleClick("//Users//hitesh//Desktop//Image//single.PNG");
		screen.setAutoWaitTimeout(10);

		// select menu option from menu settings
		screen.doubleClick("//Users//hitesh//Desktop//Image//Endless.PNG");
		screen.setAutoWaitTimeout(10);

		// mark pause field
		screen.click("//Users//hitesh//Desktop//Image//pause.PNG");
		screen.setAutoWaitTimeout(10);

		// mark info check box field
		screen.click("//Users//hitesh//Desktop//Image//info.PNG");
		screen.setAutoWaitTimeout(10);

		// //click on forward (arrow) button
		screen.click("//Users//hitesh//Desktop//Image//forward.PNG");
		screen.setAutoWaitTimeout(10);

		// click on backward (arrow) button

		screen.click("//Users//hitesh//Desktop//Image//backword.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		// select avoidance type game
		screen.click("//Users//hitesh//Desktop//Image//Avoidance.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		screen.click("//Users//hitesh//Desktop//Image//createbutton.PNG");
		screen.setAutoWaitTimeout(10);

		// play game demo
		screen.click("//Users//hitesh//Desktop//Image//playgame.PNG");
		screen.setAutoWaitTimeout(10);

		// start game
		screen.click("//Users//hitesh//Desktop//Image//start.PNG");
		screen.setAutoWaitTimeout(10);

		// pause game
		screen.click("//Users//hitesh//Desktop//Image//pausegame.PNG");
		screen.setAutoWaitTimeout(10);

		// click on char menu option
		screen.click("//Users//hitesh//Desktop//Image//Characters.PNG");
		screen.click("//Users//hitesh//Desktop//Image//Characters.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on objects menu option
		screen.click("//Users//hitesh//Desktop//Image//objects.PNG");
		screen.click("//Users//hitesh//Desktop//Image//objects.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);
		//
		// click on effect options
		screen.click("//Users//hitesh//Desktop//Image//effects.PNG");
		screen.click("//Users//hitesh//Desktop//Image//effects.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on logic options
		screen.click("//Users//hitesh//Desktop//Image//logic.PNG");
		screen.click("//Users//hitesh//Desktop//Image//logic.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on labels field
		screen.click("//Users//hitesh//Desktop//Image//labels.PNG");
		screen.click("//Users//hitesh//Desktop//Image//labels.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);

		// click on setting button
		screen.click("//Users//hitesh//Desktop//Image//setting.PNG");
		screen.setAutoWaitTimeout(10);
		//
		//
		//
		screen.click("//Users//hitesh//Desktop//Image//controller.PNG");
		screen.setAutoWaitTimeout(10);

		screen.click("//Users//hitesh//Desktop//Image//Advertisements.PNG");
		screen.setAutoWaitTimeout(10);

		// close setting option all fields
		screen.click("//Users//hitesh//Desktop//Image//ok_button.PNG");
		screen.setAutoWaitTimeout(10);

		// click on tree view
		screen.doubleClick("//Users//hitesh//Desktop//Image//treeview.PNG");
		screen.setAutoWaitTimeout(10);
		Thread.sleep(2000);
		// click on screen
		
		// click home build
		try{
			
			screen.doubleClick("//Users//hitesh//Desktop//Image//homescreen.PNG");
			screen.setAutoWaitTimeout(10);
			Thread.sleep(1000);
			
		screen.doubleClick("//Users//hitesh//Desktop//Image//home.PNG");
		Thread.sleep(1000);
		screen.setAutoWaitTimeout(10);
		Thread.sleep(1000);
		}catch(Exception e){
			
		}
		// close app
		screen.doubleClick("//Users//hitesh//Desktop//Image//cross-icon.PNG");
		screen.setAutoWaitTimeout(10);

		
	}

}
