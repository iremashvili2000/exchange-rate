

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_sVal_actionAdapter implements java.awt.event.ActionListener {

	Frame3 adaptee;
	Frame3_sVal_actionAdapter(Frame3 adaptee)
	{
		this.adaptee=adaptee;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		adaptee.sVal_actionPerformed(arg0);
	}

}
