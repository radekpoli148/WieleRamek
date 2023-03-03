package wieleramek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class WieleRamek extends JFrame {

    public WieleRamek()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Aplikacja z wieloma ramkami");
        this.setBounds(300, 320, 400, 200);
        
        
        nowaRamka.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new dialog(taRamka).setVisible(true);
            }
        });
        this.getContentPane().add(nowaRamka);
        this.setDefaultCloseOperation(3);
    }
    
    private JFrame taRamka = this;
    private JButton nowaRamka = new JButton("Stwórz ramkę");
    
    public static void main(String[] args) {
        new WieleRamek().setVisible(true);
    }
    
}
