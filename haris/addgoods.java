import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 
public class addgoods extends JFrame implements ActionListener 
  { 
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    JButton btn1, btn2;
    
 
    addgoods()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("add goods in Java");
 
        l1 = new JLabel("Type:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
 
        l2 = new JLabel("Company Name:");
        l3 = new JLabel("Quantity:");
        l4 = new JLabel("Price:");
        l5 = new JLabel("Date:");
       
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
    
        tf5 = new JTextField();
       
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
 
        btn1.addActionListener(this);
        btn2.addActionListener(this);
 
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
       
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
       tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
       
        btn1.setBounds(50, 350, 100, 30);
        btn2.setBounds(170, 350, 100, 30);
 
        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        
        add(btn1);
        add(btn2);
    }
 
    public void actionPerformed(ActionEvent e) 
     {
        if (e.getSource() == btn1)
         {
            int x = 0;
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            String s4 = tf4.getText();
            String s5 = tf5.getText();
           
            //if (s8.equals(s9))
           {
                try
               {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");
                    PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");
                    ps.setString(1, s1);
                    ps.setString(2, s2);
                   // ps.setString(3, s8);
                    ps.setString(4, s3);
                    ps.setString(5, s4);
                    ps.setString(6, s5);
                    ResultSet rs = ps.executeQuery();
                    x++;
                    if (x > 0) 
                    {
                        JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
                    }
                }
          catch (Exception ex) 
                {
                    System.out.println(ex);
                }
            }
          //else
         // {
           //     JOptionPane.showMessageDialog(btn1, "Password Does Not Match");
          //  } 
        } 
          else
       {
            tf1.setText("");
            tf2.setText("");
           tf3.setText("");
            tf4.setText("");
            tf5.setText("");
           
        }
    } 
    public static void main(String args[])
   {
        new addgoods();
    }
}