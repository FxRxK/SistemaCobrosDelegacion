/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Adalberto
 */
public class Imagen extends javax.swing.JPanel{
    String ruta;
    

public Imagen(int x, int y, String ruta) {
        this.setSize(x, y);
        this.ruta = ruta;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
         Dimension size = getSize();
         ImageIcon img = new ImageIcon(getClass().getResource(ruta));
         
         g.drawImage(img.getImage(), 0,0, size.width, size.height, null);
         
         setOpaque(false);
         
         
    }
}
