package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t22;
    private JButton b1,b2,b3,b4,bb1;

    public static void main(String[] args) {
	new IssueBook().setVisible(true);
			
    }

    public IssueBook() {
        setBounds(300, 200, 900, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Book_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 86, 100, 23);
	contentPane.add(l1);
        	JLabel l11 = new JLabel("Catagory");
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setForeground(new Color(47, 79, 79));
	l11.setBounds(47, 54, 100, 23);
	contentPane.add(l11);
 
//        JLabel ll1 = new JLabel("Book_name");
//	ll1.setFont(new Font("Tahoma", Font.BOLD, 14));
//	ll1.setForeground(new Color(47, 79, 79));
//	ll1.setBounds(47, 97, 130, 23);
//	contentPane.add(ll1);
 
	JLabel l21 = new JLabel("Name");
	l21.setForeground(new Color(47, 79, 79));
	l21.setFont(new Font("Tahoma", Font.BOLD, 14));
	l21.setBounds(47, 120, 100, 23);
	contentPane.add(l21);
 
	JLabel l3 = new JLabel("ISBN");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 154, 100, 23);
	contentPane.add(l3);
 
	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 188, 100, 23);
	contentPane.add(l4);
 
	JLabel l5 = new JLabel("Edition");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(47, 222, 100, 23);
	contentPane.add(l5);
 
	JLabel l6 = new JLabel("Price");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(47, 256, 100, 23);
	contentPane.add(l6);
 
	JLabel l7 = new JLabel("Pages");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(47, 290, 100, 23);
	contentPane.add(l7);
 
	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 86, 86, 20);
	contentPane.add(t1);
        t22 = new JTextField();
	t22.setForeground(new Color(47, 79, 79));
	t22.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t22.setBounds(126, 54, 86, 20);
	contentPane.add(t22);
 
	b1 = new JButton("Search");
        b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 80, 100, 30);
 
	contentPane.add(b1);
 
	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 120, 86, 20);
	contentPane.add(t2);
	t2.setColumns(10);
 
        bb1 = new JButton("Search");
          bb1.addActionListener(this);
	bb1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        bb1.setBackground(Color.black);
        bb1.setForeground(Color.WHITE);
	bb1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	bb1.setBounds(234, 114, 100, 30);
        contentPane.add(bb1);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 154, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 188, 208, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 222, 208, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(126, 256, 208, 20);
	contentPane.add(t6);

	t7 = new JTextField();
	t7.setEditable(false);
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(126, 290, 208, 20);
	contentPane.add(t7);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l8 = new JLabel("Student_id");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 63, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("Dept");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 147, 100, 23);
	contentPane.add(l10);

	JLabel l33 = new JLabel("Level");
	l33.setForeground(new Color(47, 79, 79));
	l33.setFont(new Font("Tahoma", Font.BOLD, 14));
	l33.setBounds(384, 187, 100, 23);
	contentPane.add(l33);

	JLabel l12 = new JLabel("Course");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(384, 233, 100, 23);
	contentPane.add(l12);

	

	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(508, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 150, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(508, 190, 208, 20);
	contentPane.add(t11);

	t12 = new JTextField();
	t12.setForeground(new Color(47, 79, 79));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(508, 236, 208, 20);
	contentPane.add(t12);



	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Deatails",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(360, 38, 378, 372);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel(" Date of Issue :");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
	contentPane.add(l15);
        
        t13 = new JTextField();
	t13.setForeground(new Color(47, 79, 79));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setBounds(137, 337, 200, 29);
	contentPane.add(t13);

//	dateChooser = new JDateChooser();
//	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//	dateChooser.setForeground(new Color(105, 105, 105));
//	dateChooser.setBounds(137, 337, 200, 29);
//	contentPane.add(dateChooser);

	b3 = new JButton("Issue");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(47, 377, 118, 33);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(199, 377, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                  if(t22.getText().equalsIgnoreCase("CSE")){
                String sql = "select * from cse where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                     if(t22.getText().equalsIgnoreCase("EECE")){
                String sql = "select * from eece where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                        if(t22.getText().equalsIgnoreCase("CE")){
                String sql = "select * from ce where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                           if(t22.getText().equalsIgnoreCase("ME")){
                String sql = "select * from me where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
		
            }
            if(ae.getSource() == bb1){
                  if(t22.getText().equalsIgnoreCase("CSE")){
                String sql = "select * from cse where name = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t1.setText(rs.getString("book_id"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                     if(t22.getText().equalsIgnoreCase("EECE")){
                String sql = "select * from eece where name = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                   t1.setText(rs.getString("book_id"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                        if(t22.getText().equalsIgnoreCase("CE")){
                String sql = "select * from ce where name = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                     t1.setText(rs.getString("book_id"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
                           if(t22.getText().equalsIgnoreCase("ME")){
                String sql = "select * from me where name = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                      t1.setText(rs.getString("book_id"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                  }
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("dept"));
                    t11.setText(rs.getString("level"));
                    t12.setText(rs.getString("course"));
                  
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b3){
                    try{
                String sql = "insert into issueBook(book_id, student_id, bname, sname, level, course, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t8.getText());
		st.setString(3, t2.getText());
		st.setString(4, t9.getText());
		st.setString(5, t11.getText());
		st.setString(6, t12.getText());
		st.setString(7, t13.getText());
		int i = st.executeUpdate();
		if (i > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
