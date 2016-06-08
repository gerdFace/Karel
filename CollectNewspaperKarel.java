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

public class CollectNewspaperKarel extends SuperKarel {

public void run() {
	moveToBeeper();
	pickBeeper();
	returnToStart();
}
//	Method: moveToBeeper()
//	pre-condition:
// 		Karel is facing east at starting point
//	post-condition:
//		Karel is facing east on beeper postion

	private void moveToBeeper() {
		moveToWall();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
// 	Method: moveToWall()
//	pre-condition:
//		Karel is facing in any direction
//	post-condition:
//		Karel moved in any direction he was facing until he hit a wall
	
	private void moveToWall() {
		while(frontIsClear()) {
			move();
		}
	
	}
	
//	Method: returnToStart()
//	pre-condition:
//		Karel is facing west just outside the wall
//	post-condition:
//		Karel is facing east in the starting postion within his home
	
	private void returnToStart() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		moveToWall();
		turnAround();
	}
}