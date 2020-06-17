package electricity.bill.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Project extends JFrame implements ActionListener{
         Project(){
    super("Electricity Billing System");
    setSize(1920,1030);
    ImageIcon ic=new ImageIcon(("G:\\Images\\Img4.jpg"));
        Image i3=ic.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
        ImageIcon ic3=new ImageIcon(i3);
        JLabel ll=new JLabel(ic3);
        add(ll);
        
        JMenuBar mb=new JMenuBar();
        JMenu master=new JMenu("Master");
        JMenuItem m1=new JMenuItem("New Customer");
        JMenuItem m2=new JMenuItem("Customer Details");
          master.setForeground(Color.BLUE);
        
       
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
       ImageIcon icon1=new ImageIcon(("G:\\Images\\Img5.jpg"));
       Image image1=icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        
       m2.setFont(new Font("monospaced",Font.PLAIN,12));
       ImageIcon icon2=new ImageIcon(("G:\\Images\\Img6.jpg"));
       Image image2=icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);

        
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
        
        JMenu user=new JMenu("User");
        JMenuItem u1=new JMenuItem("Pay Bill");
        JMenuItem u2=new JMenuItem("Calculate Bill");
          user.setForeground(Color.BLUE);
        
       
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
       ImageIcon icon4=new ImageIcon(("G:\\Images\\Img7.jpg"));
       Image image4=icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        
       u2.setFont(new Font("monospaced",Font.PLAIN,12));
       ImageIcon icon5=new ImageIcon(("G:\\Images\\Img8.jpg"));
       Image image5=icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);

        
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        JMenu report=new JMenu("Report");
        JMenuItem rep=new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);
        rep.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7=new ImageIcon(("G:\\Images\\Img15.png"));
       Image image7=icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        rep.setIcon(new ImageIcon(image7));
        rep.setMnemonic('R');
        rep.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        rep.setBackground(Color.WHITE);
        rep.addActionListener(this);
        
        JMenu exit=new JMenu("Exit");
        JMenuItem ex=new JMenuItem("Exit");
        exit.setForeground(Color.BLUE);
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
       ImageIcon icon11=new ImageIcon(("G:\\Images\\Img10.jpg"));
       Image image11=icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('E');
       ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(rep);
        
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(exit);
        
        setJMenuBar(mb);
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
     }
      public void actionPerformed(ActionEvent ae){
         String msg=ae.getActionCommand();
         if(msg.equals("Customer Details")){
             new customer_details().setVisible(true);
         }
         else if(msg.equals("New Customer")){
              new new_customer().setVisible(true);
         }
         
         else if(msg.equals("Pay Bill")){
             new pay_bill().setVisible(true);
         }
         else if(msg.equals("Calculate Bill")){
             new calculate_bill().setVisible(true);
         }
   
         else if(msg.equals("Generate Bill")){
            new generate_bill().setVisible(true);
         }
         else if(msg.equals("Exit")){
             setVisible(true);
         }
     }
      public static void main(String[] args){
          new Project().setVisible(true);
      }
}
    

