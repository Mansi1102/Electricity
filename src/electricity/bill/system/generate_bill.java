package electricity.bill.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class generate_bill extends JFrame implements ActionListener{
    JLabel l1;
    JTextArea ta;
    JButton b1;
    Choice c1,c2;
    JPanel p1;
    generate_bill (){
    setSize(500,900);
    setLayout(new BorderLayout());
    p1=new JPanel();
    l1=new JLabel("Generate Bill");
    
    c1=new Choice();
       c1.add("1001");
       c1.add("1002");
       c1.add("1003");
       c1.add("1004");
       c1.add("1005");
       c1.add("1006");
       c1.add("1007");
       c1.add("1008");
       c1.add("1009");
       c1.add("1010");
       
       c2=new Choice();
       c2.add("January");
       c2.add("Feburary");
       c2.add("March");
       c2.add("April");
       c2.add("May");
       c2.add("June");
       c2.add("July");
       c2.add("August");
       c2.add("September");
       c2.add("October");
       c2.add("November");
       c2.add("December");
    
       ta=new JTextArea(50,15);
       JScrollPane sp=new JScrollPane(ta);
       ta.setFont(new Font("Senserif",Font.ITALIC,18));

         b1=new JButton("Gnerate Bill");
         p1.add(l1);
         p1.add(c1);
         p1.add(c2);
         add(p1,"North");
         add(sp,"Center");
         add(b1,"South");
         b1.addActionListener(this);
         setLocation(350,40);
}
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c=new Conn();
            String month=c2.getSelectedItem();
            ta.setText("\tRealiance Power Limited\nELECTRICITY BILL FOR THE MONTH OF "+month+" ,2020\n\n\n");
             ResultSet rs=c.s.executeQuery("select *from emp where meter_number="+c1.getSelectedItem());
               if(rs.next()){
             ta.append("\n   Customer Name:"+rs.getString("name"));
             ta.append("\n   Meter Number:" +rs.getString("meter_number"));
             ta.append("\n   Address:"      +rs.getString("address"));
             ta.append("\n   State:"        +rs.getString("state"));
             ta.append("\n   City:"         +rs.getString("city"));
             ta.append("\n   Email:"        +rs.getString("email"));
             ta.append("\n   Phone Number:" +rs.getString("phone"));
             ta.append("\n--------------------------------------------------------------------------------------------------");
             ta.append("\n");
               }
             rs=c.s.executeQuery("select*from tax");
             if(rs.next()){
             ta.append("\n   Meter Location:"+rs.getString("meter_location"));
             ta.append("\n   Meter Type:"    +rs.getString("meter_type"));
             ta.append("\n   Phase Code:"    +rs.getString("phase_code"));
             ta.append("\n   Bill Type:"     +rs.getString("bill_type"));
             ta.append("\n   Days:"          +rs.getString("days"));
             ta.append("\n");
             ta.append("----------------------------------------------------------------------------------------------------");
             ta.append("\n\n");
             ta.append("\n   Meter Rent:\t\t"+rs.getString("meter_rent"));
             ta.append("\n   MCB Rent:   \t\t"+rs.getString("mcb_rent"));
             ta.append("\n   Service Tax:\t"+rs.getString("service_rent"));
             ta.append("\n   GST@9%:\t\t"   +rs.getString("gst"));
             ta.append("\n");
             }
              
             rs=c.s.executeQuery("select *from bill where meter_number="+c1.getSelectedItem());
              if(rs.next()){
             ta.append("\n   Current Month: \t"+rs.getString("month"));
             ta.append("\n   Units Consumed:\t"+rs.getString("units"));
             ta.append("\n   Total Charges: \t"+rs.getString("amount"));
             ta.append("\n----------------------------------------------------------------------------------------------------");
             ta.append("\n   Total Payment: \t"+rs.getString("amount"));
            }
        
               
        }
               catch(Exception ex){
                   ex.printStackTrace();
        }
   }
    public static void main(String[] args){
        new generate_bill().setVisible(true);

    }
}
