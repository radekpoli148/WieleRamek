/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wieleramek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class dialog extends JDialog {

    public dialog(JFrame parent)
    {
        super(parent, true);
        initComponents();
        
        int szer = (int)parent.getBounds().getWidth();
        int wys = (int)parent.getBounds().getHeight();
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation(parent.getBounds().x+(szer-szerRamki)/2, parent.getBounds().y+(wys-wysRamki)/2);
    }
    public void initComponents()
    {
        this.setTitle("Ramka numer: "+(++i));
        this.setBounds(300, 320, 300, 250);
        
        
        this.setDefaultCloseOperation(2);
    }
    
    public static void main(String[] args) {
        new WieleRamek().setVisible(true);
    }
    static int i = 0;
}
