/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.c;

import domino.m.Domino;
import domino.m.Dominoes;
import domino.m.Player;

/**
 *
 * @author private
 */
public class GameEngine {

    Player player1 = new Player("south");
    Player player2 = new Player("east");
    Player player3 = new Player("north");
    Player player4 = new Player("west");
    Player currentPlayer = new Player();

    Dominoes pack = new Dominoes();//An arraylist of dominoes

    public GameEngine() {
    }
    
    public void start(){
    	
    	share();
    	currentPlayer = playFirst();
    	
    	
    }

    public void match() {

    }
    
    public void playnext(){
    	
    }

    public Player checkPosition(String position){
    	
    	if(player1.getPosition().equalsIgnoreCase(position)){
    		
    		return player1;
    	}else if(player1.getPosition().equalsIgnoreCase(position)){
    		
    		return player2;
    	}else if(player1.getPosition().equalsIgnoreCase(position)){
    		
    		return player3;
    	}else if(player1.getPosition().equalsIgnoreCase(position)){
    		
    		return player4;
    	}
    	return null;
    	
    }
    
    public Player playFirst() {
        
        if(checkhand(player1,6,6)instanceof Player){
            
            return checkhand(player1,6,6);
        }
        else if (checkhand(player2,6,6)instanceof Player){
            
            return checkhand(player2,6,6);
        }
        else if (checkhand(player3,6,6) instanceof Player){
            
            return checkhand(player3,6,6);
        }
        else if (checkhand(player4,6,6) instanceof Player){
            
            return checkhand(player4,6,6);
        }
        return null;
            
    }

    private Player checkhand(Player playern, int top, int bottom) {
    	
    	
        for (Domino player : playern.getHand()) {
            if (player.getTop() == top) {
                if(player.getBottom() == bottom)
                    return playern;

            }
        }
        return null;
    }

    public void share() {
     
            pack.shuffle();
            //give each player a hand of 7 dominoes
            player1.setHand(pack);
            player2.setHand(pack);
            player3.setHand(pack);
            player4.setHand(pack);
            
            //pack became empty so set it to be eligible for garbage collection 
            pack = null;
    }

}
