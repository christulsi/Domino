package domino.m;

import java.util.ArrayList;

public class Board {
	
	private int left;
	private int right;
	ArrayList<Domino> leftSide = new ArrayList<>();
	ArrayList<Domino> rightSide = new ArrayList<>();
	
	
	public Board(){
		setLeft(6);
		setRight(6);
	}
	
	//adds the domino to either one of two sides and changes the current playable values and  return true if it matches
	public boolean collectDomino(Domino domino){
		
		if (domino instanceof Domino) {
			if (domino.getTop() == left) {

				leftSide.add(domino);
				setLeft(domino.getBottom());
				return true;

			} else if (domino.getBottom() == left) {

				leftSide.add(domino);
				setLeft(domino.getTop());
				return true;

			} else if (domino.getBottom() == right) {

				leftSide.add(domino);
				setRight(domino.getTop());
				return true;

			} else if (domino.getBottom() == left) {

				leftSide.add(domino);
				setRight(domino.getTop());
				return true;

			}
		}
		return false;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
}
