/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domino.m;

/**
 *
 * @author private
 */
public class ComputerPlayer extends Player{
    
	public ComputerPlayer(String position){
		super(position);
    }
    
    public Domino play(int left, int right){
    	
    	Domino temp=null;
    	
    	for(Domino domino:hand){
    		
            if(domino.getTop() == 6 && domino.getBottom() == 6){
                
                temp =domino;
                hand.remove(domino);
                
            }else if(domino.getTop() == left || domino.getBottom() == left ||domino.getTop() == right ||domino.getBottom() == right){
    			
    			temp = domino;
    			hand.remove(domino);
    					
    		}
            setNumberOfDomino(hand.size());
    		return temp;
    	}
    			
    	return null;
    }
    
}
