import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cardlayout extends Frame implements ActionListener{
    Panel  cardPanel=new Panel();
    Panel controlpaPanel=new Panel();
   Button nextbutton,preButton;
   CardLayout cardLayout=new CardLayout();
  public Cardlayout(){
       setSize(300,200);
      setVisible(true);
      this.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
       Cardlayout.this.dispose();
       }
});
cardPanel.setLayout(cardLayout);
cardPanel.add(new Label("one",Label.CENTER));
cardPanel.add(new Label("two",Label.CENTER));
cardPanel.add(new Label("three",Label.CENTER));
nextbutton=new Button("next");
preButton=new Button("before");
nextbutton.addActionListener(this);
preButton.addActionListener(this);
controlpaPanel.add(preButton);
controlpaPanel.add(nextbutton);
this.add(cardPanel,BorderLayout.CENTER);
this.add(controlpaPanel,BorderLayout.SOUTH);
 }
public void actionPerformed(ActionEvent e){
     if(e.getSource()==nextbutton){
        cardLayout.next(cardPanel);
   }
if(e.getSource()==preButton){
     cardLayout.previous(cardPanel); 
 }
}
}
public class E{
    	public static void main(String args[]){
    		new Cardlayout();
    	}
  	}