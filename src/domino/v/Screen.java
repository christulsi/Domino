

package domino.v;

import javax.swing.*;

public class Screen extends JPanel{
    
    private BufferedImage image; 
    
    public void paint(Graphics g){
        
        try{
            image = new ImageIO.read(getClass().getResourceAsStream("0-0.png"));
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        g.drawImage(image);
    }
    
    
}