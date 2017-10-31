package haris;
/* This just a varification form for the System User.
 * Password will provide by the Program.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class warehouse extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	//JLabel l1;
	//TextField t1,t2;
        //String un="ali";
	//String pwd="ali";
	//char c='*';

	public static void main(String a[])
	{
		warehouse v=new warehouse();
		v.setVisible(true);
	}
	
	warehouse()
	{
		//Color c1=new Color(50,46,29);
		setTitle("Inventory Management");
		setSize(300,220);
		setLocation(450,200);
				
		setBackground(Color.BLUE);
		setLayout(new FlowLayout());
				
		//l1=new JLabel("WELCOME TO INVENTORY MANAGEMENT SYSTEM");
		//add(l1);
		
		//t1=new TextField(15);
		//add(t1);
		
		//l2=new JLabel("Enter password:: ");
	//	add(l2);
		
	//	t2=new TextField(15);
	//	add(t2);
	//	t2.setEchoChar(c);
		
		b1=new JButton("ADD GOODS");
		add(b1);
		b1.setForeground(Color.BLACK);
		b1.addActionListener(this);
		
		b2=new JButton("VIEW GOODS");
		add(b2);
		b2.setForeground(Color.BLACK);
		b2.addActionListener(this);
		
		b3=new JButton("CANCEL");
		add(b3);
		b3.setForeground(Color.BLACK);
		b3.addActionListener(this);
				
//	Container contentPane=getContentPane();	
//	ImageIcon img=new ImageIcon("src\\imagesuyu.jpeg");
//	JLabel jl=new JLabel("",img,JLabel.CENTER);	
//	contentPane.add(jl); 	
	
	addWindowListener(new WindowAdapter()
 		{
 			public void windowClosing(WindowEvent e)
 			{
 				setVisible(false);
 			}
 		});
	}
	
	public void actionPerformed(ActionEvent e)
	{
            Object b3 = null;
		//if(e.getSource()==b1)
		//{
		//	int s=pwd.compareTo(t2.getText());
                  //      int u=un.compareTo(t1.getText());
		//	if(t1.getText().length()>0 && t2.getText().length()>0)
		//	{
		//	if(t1.getText().length()>0 && u==0)
		//	{
		//	if( t2.getText().length()>0 && s==0)
		//	{
		//		MyFrame v=new MyFrame();
		//		v.setVisible(true);
		//		setVisible(false);
		//	}
		//	else
		//	{
		//		JOptionPane.showMessageDialog(null,"Please Enter Correct Password !!!!!!");
		//		t2.setText("");
//t1.setText("");//
///			}
//			}
//			else
//			{
//				JOptionPane.showMessageDialog(null,"Please Enter Your Name!!!!!!!");
//				t1.setText("");
//t2.setText("");
//			}
//			}
//			else
//			{
//				JOptionPane.showMessageDialog(null,"Please fill all the Field!!!!!!!");
//				t1.setText("");
//				t2.setText("");
//			}
//		}
//		
		if(e.getSource()==b3)
		{
			int x=(JOptionPane.showConfirmDialog(null,"Do you really want to Exit!!!"));
			if(x==0)
			System.exit(0);
		}
		//repaint();//
	}}
