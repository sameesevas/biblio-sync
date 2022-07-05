package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;
   private JButton b4;
        public static void main(String[] args) {
           	new aboutUs().setVisible(true);		
	}
    
        public aboutUs() {
            
            super("About Us");
       
            setBackground(new Color(173, 216, 230));
            setBounds(500, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

   


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

       


            JLabel l6 = new JLabel("Team Name : Prime Three");
            l6.setForeground(new Color(255, 0, 0));
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Bijoya Ghosh");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("ID:202014009");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Muhammad Samee Sevas");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


               JLabel l10 = new JLabel("ID:202014038");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l10.setBounds(70, 350, 600, 34);
            contentPane.add(l10);
            
             JLabel l11 = new JLabel("Shejuti Binte Feroz");
            l11.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l11.setBounds(70, 380, 600, 34);
            contentPane.add(l11);


               JLabel l12 = new JLabel("ID:202014050");
            l12.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l12.setBounds(70, 410, 600, 34);
            contentPane.add(l12);
                
                
            contentPane.setBackground(Color.WHITE);
            b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(400, 400, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
	}
          public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}


