package haris;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ViewGoods extends JFrame{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	String s1,s2,s3,s4,s5,s6,s7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViewGoods();
	}
	ViewGoods() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inv","root","");
			Statement stm = con.createStatement();
			String sql1 = "SELECT * FROM orders LIMIT 1";
			ResultSet rs = stm.executeQuery(sql1);
			while(rs.next()) {
				s1 = rs.getString("name");
				s2 = rs.getString("email");
				s3 = rs.getString("contact");
				s4 = rs.getString("goods");
				s5 = rs.getString("c_name");
				s6 = rs.getString("c_add");
				s7 = rs.getString("doo");
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	    	setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form in Java");

        l1 = new JLabel("Goods");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));

        l2 = new JLabel("\nName:" + s1);
        l3 = new JLabel("\nEmail-ID:" + s2);
        l4 = new JLabel("\nPhone number:" + s3);
        l5 = new JLabel("\nGoods:" + s4);
        l6 = new JLabel("\nCompany Name:" + s5);
        l7 = new JLabel("\nCompany Address:" + s6);
        l8 = new JLabel("\nDate of Order:" + s7);
        
        l2.setFont(new Font("Serif", Font.BOLD, 20));

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(100, 60, 400, 30);
        l3.setBounds(100, 90, 400, 30);
        l4.setBounds(100, 120, 400, 30);
        l5.setBounds(100, 150, 400, 30);
        l6.setBounds(100, 180, 400, 30);
        l7.setBounds(100, 210, 400, 30);
        l8.setBounds(100, 240, 400, 30);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
	}
}
