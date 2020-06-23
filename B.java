import java .awt.*;
import java.awt.event.*;
public class B{
     public static void main(String[]args){
       Frame f=new Frame("GridLayout");
        f.setLayout(new GridLayout(3,3));
        f.setSize(300,300);
       f.setLocation(400,300);
      for(int i=1;i<=9;i++){
      Button btn=new Button("btn"+i);
      btn.setBackground(Color.pink);
      f.add(btn);
     }
    f.setVisible(true);
MyWindowListener mv=new MyWindowListener();
   f.addWindowListener(mv);
}
}
   class MyWindowListener implements WindowListener{
   public void windowClosing(WindowEvent e){
   Window window=e.getWindow();
    window.setVisible(false);
   window.dispose();
}
public void windowActivated (WindowEvent e){
}
public void windowClosed (WindowEvent e){
}
public void windowDeactivated (WindowEvent e){
}
public void windowDeiconified (WindowEvent e){
}
public void windowIconified (WindowEvent e){
}
public void windowOpened (WindowEvent e){
}
    }