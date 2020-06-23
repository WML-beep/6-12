import java .awt.*;
import java.awt.event.*;
public class A{
     public static void main(String[]args){
       Frame f=new Frame("GridLayout");
        f.setLayout(new GridLayout(3,3));
        f.setSize(300,300);
       f.setLocation(400,300);
      for(int i=1;i<=9;i++){
      Button btn=new Button("btn"+i);
      f.add(btn);
}
    f.setVisible(true);
   f.addWindowListener(new WindowAdapter(){
         @Override
         public void windowClosing(WindowEvent arg0){
         super.windowClosing(arg0);
       System.exit(0);
   }
  });
}
}