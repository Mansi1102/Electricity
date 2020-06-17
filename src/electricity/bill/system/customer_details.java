
package electricity.bill.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class customer_details extends JFrame implements ActionListener{
    JTable t;
    JButton b;
    String x[]={"emp_name","meter_no.","address","state","city","email","phone_no."};
    String y[][]=new String[20][8];
    int i=0;int j=0;
    customer_details(){
        super("Customer Details");
        setSize(1200,450);
        setLocation(200,200);
        try{
            Conn c1=new Conn();
            String s1="select*from emp";
              ResultSet rs=c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("meter_number");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("state");
                y[i][j++]=rs.getString("city");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("phone");
                i++;
                j=0;
            }
            t=new JTable(y,x);
        }
        catch(Exception e){
            e.printStackTrace();
           }
        b=new JButton("Print");
        add(b,"South");
        JScrollPane sp=new JScrollPane(t);
        add(sp);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t.print();
        }
        catch(Exception e){
    }
    }
      public static void main(String[] args){
        new customer_details().setVisible(true);
    }  
    }

