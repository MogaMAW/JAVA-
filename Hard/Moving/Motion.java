package Moving;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Motion extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    Motion(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(5500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("voteIcon.jpg");
        icon = new ImageIcon("voteIcon.jpg");
        icon = new ImageIcon("voteIcon.jpg");
        icon = new ImageIcon("voteIcon.jpg");
        icon = new ImageIcon("voteIcon.jpg");

        label = new JLabel();

        label.setBounds(0,0,50,50);
        label.setIcon(icon);
        
        //label.setBackground(Color.black);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.yellow);
        this.add(label);
        this.setVisible(true);

        
 


    }


    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = invoked when a key is typed. uses KeyChar, char output
        switch(e.getKeyCode()){
            case 'a': label.setLocation(label.getX()-10,getY()); //moving left 
                break;
            case 'w': label.setLocation(label.getX(),getY()-10); //moving up
                break;
            case 's': label.setLocation(label.getX()+10,getY()); // moving right
                break;
            case 'd': label.setLocation(label.getX(),getY()+10); // moving down
                break;

        }
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Key Pressed =  Invoked when a physical key is pressed down. uses KeyCode, int output

        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,getY()); //moving left
                break;
            case 38: label.setLocation(label.getX(),getY()-10); //moving up
                break;
            case 39: label.setLocation(label.getX()+10,getY()); // moving right
                break;
            case 40: label.setLocation(label.getX(),getY()+10); // moving down
                break;

            /* 
            left = 37
            up  =38
            down =40
            right =39
            */ 

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key char: " + e.getKeyCode());
        
    }
    

    
}
