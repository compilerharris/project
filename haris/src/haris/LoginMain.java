package haris;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class LoginMain extends JFrame implements ActionListener{

	JButton b1,b2;
	JLabel l1,l2;
	TextField t1,t2;
	int haris = 0; 
    String un="ali";
	String pwd="ali";
	char c='*';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login v=new Login();
		v.setVisible(true);
	}
	
	LoginMain()
	{
		//Color c1=new Color(50,46,29);
		setTitle("LOGIN");
		setSize(200,220);
		setLocation(450,200);
				
		setBackground(Color.BLUE);
		setLayout(new FlowLayout());
				
		l1=new JLabel("Enter user name::");
		add(l1);
		
		t1=new TextField(15);
		add(t1);
		
		l2=new JLabel("Enter password:: ");
		add(l2);
		
		t2=new TextField(15);
		add(t2);
		t2.setEchoChar(c);
		
		b1=new JButton("Ok");
		add(b1);
		b1.setForeground(Color.BLUE);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		add(b2);
		b2.setForeground(Color.RED);
		b2.addActionListener(this);
		
		
				
	Container contentPane=getContentPane();	
	ImageIcon img=new ImageIcon("src\\imagesuyu.jpeg");
	JLabel jl=new JLabel("",img,JLabel.CENTER);	
	contentPane.add(jl); 	
	
	addWindowListener(new WindowAdapter()
 		{
 			public void windowClosing(WindowEvent e)
 			{
 				setVisible(false);
 			}
 		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inv","root","");
			Statement stm = con.createStatement();
			String sql1 = "SELECT count(name) FROM register WHERE name = '"+t1.getText()+"', password = '"+t2.getText()+"'";
			ResultSet rs = stm.executeQuery(sql1);
			System.out.println(rs);
			if(rs.next()) {
				haris = Integer.parseInt(rs.getString("count(name)"));
			}
			if(e.getSource()==b1){
				if(haris == 1) 
				{
//		            int u=un.compareTo(t1.getText());
//					int s=pwd.compareTo(t2.getText());
					if(t1.getText().length()==0 && t2.getText().length()==0)
					{
//					if(t1.getText().length()>0 && u==0)
//					{
//					if( t2.getText().length()>0 && s==0)
//					{
						MyFrame v=new MyFrame();
						v.setVisible(true);
						setVisible(false);
//					}
//					else
//					{
//						JOptionPane.showMessageDialog(null,"Please Enter Correct Password !!!!!!");
//						t2.setText("");
//						t1.setText("");
//					}
//					}
//					else
//					{
//						JOptionPane.showMessageDialog(null,"Invalid Name!!!!!!!");
//						t1.setText("");
//						t2.setText("");
//					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please fill all the Field!!!!!!!");
						t1.setText("");
						t2.setText("");
					}
				}
			}
			
			if(e.getSource()==b2)
			{
				int x=(JOptionPane.showConfirmDialog(null,"Do you really want to Exit!!!"));
				if(x==0)
				System.exit(0);
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
