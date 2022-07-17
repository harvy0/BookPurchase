/*
Harwinder Singh Dhillon
*/
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class HarwinderDhillonBuyBookB extends JApplet implements ActionListener, ItemListener
{
	
	
	    
	ButtonGroup rGroup;
   
	JTextField tTitle, tTotal;
   
   JComboBox cbCopies;
   
   JRadioButton rHard, rSoft, rDigitel;
   
   JButton buttonTotal;
   
   JList lOutput;
	
	JScrollPane jp;
   
   JPanel p1, p2, p3;
   
   Vector vt;
   
   int copy = 1;
   
   double cost;
   
   String temp;
   
   char temp2;
		
	NumberFormat dollars = NumberFormat.getCurrencyInstance();
	
		
	Container con;

	public void init()
	{
		
		
		//////////////// GIVEN BY INSTRUCTOR /////////////////////////////////////
  // your_component.setBorder(new TitledBorder(""));
  // JOptionPane.showMessageDialog(this,"One or more fields are blank - Please re-enter","Not Allowed",JOptionPane.ERROR_MESSAGE);
  // your_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  // your_JList.setVisibleRowCount(int);
 //  your_JList.setListData(Vector);
  ////////////////////////////////////////////////////////////////	
		
     con = getContentPane();
     
     vt = new Vector();
     
     tTitle = new JTextField();
     tTitle.setBorder(new TitledBorder("Enter Book Title"));
          
     tTotal = new JTextField(12);
     tTotal.setEditable(false);
     
     cbCopies = new JComboBox();
     cbCopies.addItem("1 Copies");
     cbCopies.addItem("2 Copies");
     cbCopies.addItem("3 Copies");
     cbCopies.addItem("4 Copies");
     cbCopies.addItem("5 Copies");
     cbCopies.addItem("6 Copies");
     cbCopies.addItem("7 Copies");
     
     cbCopies.addItemListener(this);
     
     rHard = new JRadioButton("Hard back $3.50",true);
     rHard.addItemListener(this);
     
     rSoft = new JRadioButton("Soft back $2.10");
      rSoft.addItemListener(this);
      
     rDigitel = new JRadioButton("Buy Digital $5.20");
      rDigitel.addItemListener(this);
      
     rGroup = new ButtonGroup();
     
     buttonTotal = new JButton("Total/Update");
     buttonTotal.addActionListener(this);
          
     rGroup.add(rHard);
     rGroup.add(rSoft);
     rGroup.add(rDigitel);
     
     lOutput = new JList();
     lOutput.setFixedCellHeight(20);
     lOutput.setFixedCellWidth(20);
     lOutput.setVisibleRowCount(5);
     
     jp = new JScrollPane(lOutput);
     
     p1 = new JPanel(new GridLayout(1,2,4,4));
     p2 = new JPanel(new GridLayout(1,3,4,4));
     p3 = new JPanel(new FlowLayout());
     
     con.setLayout(new GridLayout(4,1,1,1));
     
     p1.add(tTitle);
     p1.add(cbCopies);
     
     p2.add(rHard);
     p2.add(rSoft);
     p2.add(rDigitel);
     
     p3.add(buttonTotal);
     p3.add(tTotal);
     
     con.add(p1);
     con.add(p2);
     con.add(p3);
     con.add(jp);
      
     cost = 3.50;
     tTotal.setBackground(Color.yellow);
      
  }
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof JButton)
      {
         if(e.getSource() == buttonTotal)
         {
           if((tTitle.getText()).trim().equals(""))
           {
           JOptionPane.showMessageDialog(this,"No book title entered - Please re-enter","Not Allowed",JOptionPane.ERROR_MESSAGE);
            tTotal.setText(dollars.format(0));
           }
           else
           {
            String title = tTitle.getText();
            
            if(rDigitel.isSelected())
            {
              copy = 1;
            }
            tTotal.setText(dollars.format(cost*copy));
            
            vt.add(title+" " +dollars.format(cost*copy));
            
            lOutput.setListData(vt);
            }
         }
      }
    	
	}	// event
	
   public void itemStateChanged(ItemEvent e)
   {
     if(e.getSource() instanceof JComboBox)
     {    
         temp = String.valueOf(cbCopies.getSelectedItem());
         temp2 = temp.charAt(0);
         copy = Character.getNumericValue(temp2);
           
     }
     if(e.getSource() instanceof JRadioButton)
     {
        if(rHard.isSelected())
            {
              tTotal.setText(dollars.format(0));
              tTotal.setBackground(Color.yellow);
              cost = 3.50;
            }
            else
            if(rSoft.isSelected())
            {
              tTotal.setText(dollars.format(0));
              tTotal.setBackground(Color.yellow);
              cost = 2.10;
            }
            else
            if(rDigitel.isSelected())
            { 
              tTotal.setText(dollars.format(0));
              tTotal.setBackground(Color.green);
              cost = 5.20;
            }
     }
      
   }
   
  		
		
	
 public static void main(String args[])
{
  HarwinderDhillonBuyBookB ob = new HarwinderDhillonBuyBookB();
  ob.init();
  JFrame frame = new JFrame();
  
  frame.add(ob);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  
  
}
			

}


		


	