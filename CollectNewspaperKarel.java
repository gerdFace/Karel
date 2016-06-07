/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel  extends SuperKarel {

	public void run() {
		move();
		if (beepersPresent()) {
			pickBeeper();
		}
		else {
				putBeeper();
		}
		moveToWall();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnLeft();
		move();
		putBeeper();
		move();
		turnRight();
		move();
		turnRight();
		moveToWall();
		turnRight();
		moveToWall();
	}
	
private void moveToWall() {
	while(frontIsClear()) {
		move();
	}
	}
}