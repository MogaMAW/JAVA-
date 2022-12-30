import java.awt.FlowLayout;
import java.awt.event.*;
// import java.net.FileNameMap;

import javax.swing.*;

public class Working extends  JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu voterMenu;
    JMenu adminMenu;
    JMenu registerMenu;
    JMenu exitMenu;

    JMenuItem voterItem;
    JMenuItem adminItem;
    JMenuItem registerItem;
    JMenuItem exitItem;

    // ImageIcon voterIcon;

    


    

    Working(){
        //setting image icons
        //voterIcon = new ImageIcon("VoteIcon.jpg");
        // adminIcon = new ImageIcon("");
        // registerIcon = new ImageIcon("");
        // exitIcon = new ImageIcon("");


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        //placing menus using JMenuBar.
        JMenuBar menuBar = new JMenuBar();

        voterMenu = new JMenu("Voter");
        adminMenu = new JMenu("Admin");
        registerMenu= new JMenu("Register");
        exitMenu = new JMenu("Exit");

        //Loading items to appear as the items selected horizontally.

        voterItem = new JMenuItem("voter");
        adminItem = new JMenuItem("Admin");
        registerItem = new JMenuItem("register");
        exitItem = new JMenuItem("exit");

        //adding items under the menu bar displayed 
        voterMenu.add(voterItem);
        voterMenu.add(adminItem);
        voterMenu.add(registerItem);
        voterMenu.add(exitItem);

        //adding the Image Icons 
        //voterItem.setIcon(voterIcon);
        // adminItem.setIcon(adminIcon);
        // registerItem.setIcon(registerIcon);
        // exitItem.setIcon(exitIcon);
        
        //making the items displayed under the menubar functional
        voterItem.addActionListener(this);
        adminItem.addActionListener(this);
        registerItem.addActionListener(this);
        exitItem.addActionListener(this);


        //setting letter to navigate using setMnemonic
        //On the GUI is sets the first letters of the words underlined
        voterItem.setMnemonic(KeyEvent.VK_V);  //V for vote
        adminItem.setMnemonic(KeyEvent.VK_A);  //A for admin
        registerItem.setMnemonic(KeyEvent.VK_R); //R for register
        exitItem.setMnemonic(KeyEvent.VK_E);  //E for exit

        //setting letters to navigate MenuBar
        voterMenu.setMnemonic(KeyEvent.VK_V); //Alt + V for vote
        adminMenu.setMnemonic(KeyEvent.VK_A); //Alt + V for admin.
        registerMenu.setMnemonic(KeyEvent.VK_R); //Alt + V for register
        exitMenu.setMnemonic(KeyEvent.VK_E); //Alt + V for exit.
        

        //adding the menu bar items: items to appear horizontally.
        menuBar.add(voterMenu);
        menuBar.add(adminMenu);
        menuBar.add(registerMenu);
        menuBar.add(exitMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==voterItem);{
            System.out.println("Vote Now");
        }
        if(e.getSource()==adminItem);{
            System.out.println("Admin now");
        }
        if(e.getSource()==registerItem);{
            System.out.println("Register now");
        }
        if(e.getSource()==exitMenu);{
            System.exit(0);
        }
       
        
    }


    

}
