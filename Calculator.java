import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator{
  public Calculator() {
    JFrame jf=new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(500, 600);
    
   JLabel displaylabel=new JLabel("hello");
   displaylabel.setBounds(30, 50, 540, 40);
  
   displaylabel.setBackground(Color.Blue);
   
  
   displaylabel.setOpaque(true);


   jf.add(displaylabel);

    



    jf.setVisible(true);
    jf.setDeafultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public static void main(String[] args){
    new Calculator();
  }
}