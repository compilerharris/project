package haris;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class welcome extends JFrame implements ActionListener 
  { 
    JLabel l1;
    JButton btn1, btn2,btn3,btn4;

    welcome()
     {
        setVisible(true);
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("WELCOME");
 
        l1 = new JLabel("INVENTORY MANAGEMENT");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
 
        btn1 = new JButton("WAREHOUSE DETAILS");
        btn2 = new JButton("ORDERS");
        btn3 = new JButton("CANCEL");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        l1.setBounds(10, 30, 400, 30);
        btn1.setBounds(20, 80, 170, 30);
        btn2.setBounds(80, 120, 100, 30);
        btn3.setBounds(80, 160, 100, 30);
     
        add(l1);
        add(btn1);
        add(btn2);
        add(btn3);
     
     }
 
    public void actionPerformed(ActionEvent e) 
     {
        if (e.getSource() == btn1)
        {
            
        }{
             
         }
            int x = 0;
               {
                try               
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");
                    PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");
                    ResultSet rs = ps.executeQuery();
                    x++;
                    if (x > 0) 
                    {
                        JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
                }
                
          catch (Exception ex) 
                {
                    System.out.println(ex);
                }
               }}
                
            
    public static void main(String args[])
   {
        new welcome();
    }
}
