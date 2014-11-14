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
    private int loses;
    private ArrayList<Domino> hand = new ArrayList<>();
    private String position;
    
    public Player(){
    	
    }

    public Player(String position) {
        
        this.position = position;
    }

    public void play() {

    }

    public void pickUp() {

    }

    public int getWins() {
        return wins;
    }

    public int getLost() {
        return loses;
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

    public void setLost(int loses) {
        this.loses = loses;
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

}
