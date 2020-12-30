

import java.awt.event.ActionEvent;

class Frame3_bKon_actionAdapter implements
java.awt.event.ActionListener
{
 Frame3 adaptee;
 Frame3_bKon_actionAdapter(Frame3 adaptee)
 { this.adaptee = adaptee;}
 public void actionPerformed(ActionEvent e)
 {
 adaptee.bKon_actionPerformed(e);
 }
}
