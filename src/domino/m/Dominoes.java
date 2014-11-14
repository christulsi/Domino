/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.m;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author private
 */
public class Dominoes extends ArrayList {

  // private ArrayList<Domino> pack = new ArrayList<>();
    public Dominoes() {
        createPack();
    }

    public void createPack() {
        //      int i, j;
        this.add(new Domino(0, 0, "../Dominoes/0-0.png"));
        this.add(new Domino(0, 1, "../Dominoes/0-1.png"));
        this.add(new Domino(0, 2, "../Dominoes/0-2.png"));
        this.add(new Domino(0, 3, "../Dominoes/0-3.png"));
        this.add(new Domino(0, 4, "../Dominoes/0-4.png"));
        this.add(new Domino(0, 5, "../Dominoes/0-5.png"));
        this.add(new Domino(0, 6, "../Dominoes/0-6.png"));
        this.add(new Domino(1, 1, "../Dominoes/1-1.png"));
        this.add(new Domino(1, 2, "../Dominoes/1-2.png"));
        this.add(new Domino(1, 3, "../Dominoes/1-3.png"));
        this.add(new Domino(1, 4, "../Dominoes/1-5.png"));
        this.add(new Domino(1, 5, "../Dominoes/1-5.png"));
        this.add(new Domino(1, 6, "../Dominoes/1-6.png"));
        this.add(new Domino(2, 2, "../Dominoes/2-2.png"));
        this.add(new Domino(2, 3, "../Dominoes/2-3.png"));
        this.add(new Domino(2, 4, "../Dominoes/2-4.png"));
        this.add(new Domino(2, 5, "../Dominoes/2-5.png"));
        this.add(new Domino(2, 6, "../Dominoes/2-6.png"));
        this.add(new Domino(3, 3, "../Dominoes/3-3.png"));
        this.add(new Domino(3, 4, "../Dominoes/3-4.png"));
        this.add(new Domino(3, 5, "../Dominoes/3-5.png"));
        this.add(new Domino(3, 6, "../Dominoes/3-6.png"));
        this.add(new Domino(4, 4, "../Dominoes/4-4.png"));
        this.add(new Domino(4, 5, "../Dominoes/4-5.png"));
        this.add(new Domino(4, 6, "../Dominoes/4-6.png"));
        this.add(new Domino(5, 5, "../Dominoes/5-5.png"));
        this.add(new Domino(5, 6, "../Dominoes/5-6.png"));
        this.add(new Domino(6, 6, "../Dominoes/6-6.png"));

        /*
        
         for (i = 6; i >= 0; i--) {
            
         for (j = 0; j <= i; j++) {
         this.add(new Domino(i, j));

         }
         }
         /*
         for(Domino tile:pack){
         System.out.print(tile.getTop());
         }
         */
    }

    public void shuffle() {
        Collections.shuffle(this);
    }

}
