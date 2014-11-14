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

public UI(){
 super("Domino Game");
 /*
 String location = "../Dominoes/6-6.png";
        InputStream imgStream = getClass().getResourceAsStream(location);
        BufferedImage image_setter = null;
        try {
            image_setter = ImageIO.read(imgStream);
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon background_image = new ImageIcon(image_setter);
        setContentPane(new JLabel(background_image));
*/
 Domino a = new Domino(6, 6, "../Dominoes/6-6.png");
 a.setIcon(new ImageIcon(getClass().getResource("../Dominoes/6-6.png")));
 add(a);
 
 
 
 
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(1400,1400);
setVisible(true);

setLocationRelativeTo(null);
setResizable(false);
}    
    
    
    
    
    
    
    
}
