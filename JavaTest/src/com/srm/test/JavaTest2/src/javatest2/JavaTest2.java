
package javatest2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class DBSwing extends JFrame
{
    public DBSwing()  {
        JTable jt=new JTable();
        DefaultTableModel model = new DefaultTableModel();
        String[] cols={"cname","addr","psize","ctype","pay","phone","zip"};
        model.setColumnIdentifiers(cols);
       try
       {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder","diya","diya");
           String str="select * from pizza";
           PreparedStatement ps=conn.prepareStatement(str);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               String cname=rs.getString(1);
               String addr=rs.getString(2);
               String psize=rs.getString(3);
               String ctype=rs.getString(4);
               String pay=rs.getString(5);
               String phone=rs.getString(6);
               String zip=rs.getString(7);
               model.addRow(new Object[]{cname,addr,psize,ctype,pay,phone,zip});
               jt.setModel(model);
           }
           JFrame jf=new JFrame();
           jf.add(jt);
           jf.setTitle("Displaying Table");
       }
       catch(Exception e)
       {
           System.out.println("Exception "+e);
       }
        
        
    }
    
}
public class JavaTest2  {
    public static void main(String[] args) {
        new DBSwing();
    }
    
}
