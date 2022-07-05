package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookDetails extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3,b4,b5;


	public BookDetails () {
            
	setBackground(new Color(169, 169, 169));	
        setBounds(600, 300, 600, 400);
		
        panel = new JPanel();
	panel.setBackground(new Color(176, 224, 230));
	setContentPane(panel);
	panel.setLayout(null);

	b1 = new JButton("CE Department");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(70, 150, 313, 39);
	panel.add(b1);
		
        b2 = new JButton("CSE Department");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(70, 100, 313, 39);
	panel.add(b2);

	b3 = new JButton("ME Department");
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(70, 200, 313, 39);
	panel.add(b3);
        
        b4 = new JButton("EECE Department");
	b4.addActionListener(this);
	
	b4.setForeground(new Color(139, 69, 19));
	b4.setBackground(new Color(192, 192, 192));
	b4.setBounds(70, 250, 313, 39);
	panel.add(b4);
        
          b5 = new JButton("Back");
	b5.addActionListener(this);
	b5.setForeground(new Color(255, 255, 255));
	b5.setBackground(new Color(0, 0, 0));
	b5.setBounds(50, 300, 113, 39);
	panel.add(b5);

	JLabel l5 = new JLabel("Categories : ");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(70, 50, 130, 20);
	panel.add(l5);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(176, 224, 230));
		panel2.setBounds(24, 40, 434, 263);
		panel.add(panel2);
                
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                 setVisible(false);
		ce su = new ce();
		su.setVisible(true);
            }
            if(ae.getSource() == b2){
                setVisible(false);
		cse su = new cse();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		me forgot = new me();
		forgot.setVisible(true);
            }
             if(ae.getSource() == b4){
                setVisible(false);
		eece forgot = new eece();
		forgot.setVisible(true);
            }
               if(ae.getSource() == b5){
                  this.setVisible(false);
		new Home().setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}

}
