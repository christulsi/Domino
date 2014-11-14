/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.m;

import javax.swing.JButton;

/**
 *
 * @author private
 */
public class Domino extends JButton {

    private int top;
    private int bottom;
    private String imgPath;

    public Domino(int top, int bottom,String imgPath) {
        this.top = top;
        this.bottom = bottom;
        this.imgPath=imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

}
