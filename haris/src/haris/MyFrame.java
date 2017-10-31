package haris;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import java.awt.LayoutManager;


public class MyFrame extends Frame{

    public MyFrame()  {
        setSize(300, 300);
        setTitle("MyFrame");
        setVisible(true);
        setResizable(false);
        
        Button b1=new Button("Add");
        add(b1);
        b1.setBounds(10, 10, 10, 10);
        
        
    }
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        LayoutManager FlowLayout = null;
        f.setLayout(FlowLayout);
    }
    
    
    
}
