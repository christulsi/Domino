/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.m;

import java.util.ArrayList;

/**
 *
 * @author private
 */
public class Player {

    private int wins;
    private int gamesplayed = 0;
    private int points;
    private ArrayList<Domino> hand = new ArrayList<>();
    private String position;
    private int NumberOfDomino = 7;
    
    public Player(){
    	
    	setPoints(0);
    	setNumberOfDomino(7);
    	setGamesPlayed(getGamesPlayed()+1);
    }

    public Player(String position) {
    	
    	setPoints(0);
    	setNumberOfDomino(7);
    	setGamesPlayed(getGamesPlayed()+1);
        setPosition(position);
    }

    public Domino play(int left, int right){
    	
    	Domino temp=null;
    	
    	for(Domino domino:hand){
    		
    		if(domino.getTop()==left || domino.getBottom()==left ||domino.getTop()==right ||domino.getBottom()==right){
    			
    			temp = domino;
    			hand.remove(domino);
    			setNumberOfDomino(hand.size());		
    		}
    		return temp;
    	}
    			
    	return null;
    }

    public int getWins() {
        return wins;
    }

    public int getGamesPlayed() {
        return gamesplayed;
    }

    public String getPosition() {
        return position;
    }

    public ArrayList<Domino> getHand() {
        return hand;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setGamesPlayed(int loses) {
        this.gamesplayed = loses;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHand(ArrayList<Domino> pack) {
        for (int i = 6; i >= 0; i--) {
            hand.add(pack.get(i));
            pack.remove(i);
        }

    }

	public int getNumberOfDomino() {
		return NumberOfDomino;
	}

	public void setNumberOfDomino(int numberOfDomino) {
		NumberOfDomino = numberOfDomino;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
