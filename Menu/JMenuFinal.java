import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuFinal extends JApplet 
{
    
	 Container con;
	
	 JMenuBar mb;
  	 JMenu Breakfast, Juice,Orange , Dinner;
	 JMenuItem California, Other;

    public void init()
    {
      
 		mb = new JMenuBar();
      
      Breakfast = new JMenu("Breakfast");
      Juice = new JMenu("Juice");
      Orange = new JMenu("Orange");
      
      Dinner = new JMenu("Dinner");
      
      California = new JMenuItem("California");
      
      Other = new JMenuItem("Other");
      
      Other.setMnemonic('t');
      
      Breakfast.add(Juice);
      
      Juice.add(Orange);
      
      Orange.add(California);
      
      Dinner.add(Other);
      
      mb.add(Breakfast);
      mb.add(Dinner);
      
      setJMenuBar(mb);
      
      
      
       
    }

   
}



