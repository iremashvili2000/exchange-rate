/// wignidan chemtvis

import java.awt.Frame;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;



import java.awt.*;

public class Frame3 extends JFrame {
	List list=new List();
	TextField Lari=new TextField();
	Label label1=new Label();
	Button button=new Button();
	TextField tfKV=new TextField();
	Label lKV=new Label();
	Label inf=new Label();
	
	
	double [] kursebi= {2.45,0.07,2.7};
	
	public Frame3() {
		try {
			JbInit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void JbInit() throws Exception{
		// TODO Auto-generated method stub
		this.setLayout(null);
		
		list.setBounds(new Rectangle(22,180,158,103));
		list.addActionListener(new Frame3_sVal_actionAdapter(this));
		Lari.setText("");
		Lari.setBounds(new Rectangle(22, 116, 96, 34));
		 label1.setFont(new java.awt.Font("Dialog", 0, 16));
		 label1.setText("Lari");
		 label1.setBounds(new Rectangle(127, 116, 37, 35));
		 button.setFont(new java.awt.Font("Dialog", 1, 16));
		 button.setLabel("Transfer");
		 button.setBounds(new Rectangle(176, 117, 114, 33));
		 button.addActionListener(new Frame3_bKon_actionAdapter(this));
		 //
		
		 //
		 tfKV.setText("");
		 tfKV.setBounds(new Rectangle(294, 117, 86, 36));
		 lKV.setFont(new java.awt.Font("Dialog", 1, 16));
		 lKV.setBounds(new Rectangle(394, 117, 49, 35));
		 inf.setText("");
		 inf.setBounds(new Rectangle(210, 184, 178, 94));
		 this.add(list, null);
		 list.add("Dolari") ;
		 list.add("Rubli") ;
		 list.add("Evro") ;
		 this.add(Lari, null);
		 this.add(label1, null);
		 this.add(button, null);
		 this.add(lKV, null);
		 this.add(tfKV, null);
		 this.add(inf, null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	}
	public static void main(String[] args) {
		Frame3 frame3=new Frame3();
		frame3.setVisible(true);
		frame3.setSize(400,400);
		
	}
	 void sVal_actionPerformed(ActionEvent e)
	 {
	 System.out .print(e.toString() ) ;
	 //l1.setText(sVal.getSelectedItem() ) ;
	 //list1.remove(0) ;
	 }

	 
	 void bKon_actionPerformed(ActionEvent e)
	 {
	 double dLari = Double.parseDouble(Lari.getText() ) ;
	 if(list.getSelectedIndex() == -1)
	 {
	 inf.setText("airchie valuta!!!") ;
	 }
	 else
	 {
	 double k = kursebi[ list.getSelectedIndex()];
	 double dVal = dLari / k;

	 tfKV.setText(Double.toString(dVal) ) ;
	 lKV.setText(list.getSelectedItem() ) ;
	 inf.setText("") ;
	 }
	 }
	
	

}
