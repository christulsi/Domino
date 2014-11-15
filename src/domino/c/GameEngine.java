/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.c;

import domino.m.Board;
import domino.m.Domino;
import domino.m.Dominoes;
import domino.m.Player;

/**
 *
 * @author private
 */
public class GameEngine {

	Board board = new Board();
    Player player1 = new Player("south");
    Player player2 = new Player("east");
    Player player3 = new Player("north");
    Player player4 = new Player("west");
    Player currentPlayer = new Player();
    Player winner = new Player();
    int rap = 0;

    Dominoes pack = new Dominoes();//An arraylist of dominoes

    public GameEngine() {
    }
    
    public void start(){
    	
    	share();
    	currentPlayer = playFirst();
    	
    	while(true){
        	
        	if(board.collectDomino(currentPlayer.play(board.getLeft(), board.getRight()))){//left right      		
        		
        		rap = 0; //set rap count to zero 
        	}else {
        		rap ++;	
        	}
        	System.out.println(1);
        	
        	if(currentPlayer.getNumberOfDomino() == 0){
        		
        		winner = currentPlayer;
        		break;
        	}
        	//check to the if the game is finished if game is blocked
        	else if(rap == 4){  
        		
        		checkWinner();
        		break;
        	}
        	
        	playNext();
        
    	}
    	
    	winner.setWins(winner.getWins()+1);
    	
    }

    //Shuffles the domino pack and share 7 dominoes to each player
    private void share() {
     
            pack.shuffle();
            //give each player a hand of 7 dominoes
            player1.setHand(pack);
            player2.setHand(pack);
            player3.setHand(pack);
            player4.setHand(pack);
            
            //pack became empty so set it to be eligible for garbage collection 
            pack = null;
    }
    
    //Decides who plays next
    private void playNext(){
    	
    	if(currentPlayer.getPosition().equalsIgnoreCase("south")){
    		
    		currentPlayer = checkPosition("west");
    		
    	}else if(currentPlayer.getPosition().equalsIgnoreCase("east")){
    		
    		currentPlayer = checkPosition("north");
    		
    	}else if(currentPlayer.getPosition().equalsIgnoreCase("north")){
    		
    		currentPlayer = checkPosition("west");
    		
    	}else if(currentPlayer.getPosition().equalsIgnoreCase("south")){
    		
    		currentPlayer = checkPosition("east");
    	}
    }
    
    //searches for a player with a specific position
    private Player checkPosition(String position){
    	
    	if(player1.getPosition().equalsIgnoreCase(position)){
    		
    		return player1;
    		
    	}else if(player2.getPosition().equalsIgnoreCase(position)){
    		
    		return player2;
    		
    	}else if(player3.getPosition().equalsIgnoreCase(position)){
    		
    		return player3;
    		
    	}else if(player4.getPosition().equalsIgnoreCase(position)){
    		
    		return player4;
    		
    	}
    	return null;
    	
    }
    
    //Decides who plays first base on the double 6 domino
    private Player playFirst() {
        
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

    //check player hand for a specified domino
    private Player checkhand(Player playern, int top, int bottom) {
    	
    	
        for (Domino player : playern.getHand()) {
            if (player.getTop() == top) {
                if(player.getBottom() == bottom)
                    return playern;

            }
        }
        return null;
    }
    
    //Check winner based on points
    private void checkWinner(){
    		
    	player1.setPoints(playersum(player1));
    	player2.setPoints(playersum(player2));
    	player3.setPoints(playersum(player3));
    	player4.setPoints(playersum(player4));
    	
    	winner = (player1.getPoints() > player2.getPoints()) ? player1 : player2;	
    	winner = (winner.getPoints() < player3.getPoints()) ? player3 : winner;
    	winner = (winner.getPoints() < player4.getPoints()) ? player4 : winner;
    	
    }
    
    private int playersum(Player player){
    	
    	int sum = 0;
    	
    	for(Domino domino: player.getHand()){
    		
    		sum += domino.getTop();
    		sum += domino.getBottom();
    	}
    	
    	return sum;
    }

}
