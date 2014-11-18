/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domino.v;

import domino.m.Domino;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author private
 */
public class UI extends JFrame {
    
    private Screen sc = new Screen();
    private ArrayList<Domino> list = new ArrayList<>();
    
    public UI(){
         super("Domino Game");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,1400);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        add(sc);
    }    
    
    public void callrepaint(){
        
        sc.repaint();
    }
         
    public void setList(ArrayList<Domino> list){
        
        this.list = list;
    }
    
    public ArrayList<Domino> getList(){
        
        return list;
    }
    
}
