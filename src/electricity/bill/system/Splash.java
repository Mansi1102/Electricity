
package electricity.bill.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash {
 public static void main(String[] args){
      fframe f1= new fframe();
      f1.setVisible(true);
      int i;
      int x=1;
      for(i=2;i<=600;i+=4,x+=1){
          f1.setLocation(370-((i+x)/2),300-(i/2));
          f1.setSize(i*x,i*x);
          try{
              Thread.sleep(10);
          }
          catch(Exception e){
              }
      }
  }    
}
class fframe extends JFrame implements Runnable{
    Thread t1;
    fframe(){
        super("ELECTRICITY BILL SYSTEM");
        setLayout(new FlowLayout());
        ImageIcon c1=new ImageIcon(("G:\\Images\\Img13.jpg"));
        Image i1=c1.getImage().getScaledInstance(2550,1050,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel ll=new JLabel(i2);
        add(ll);
        t1=new Thread(this);
        t1.start();}
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login l=new Login();
            l.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
