package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	   public void showButton() {
	     System.out.println("Button clicked");
	     
	     JFrame frame = new JFrame();
	     
	     frame.setVisible(true);
	     
	     JButton button = new JButton();
	     
	     frame.add(button);
	     
	     frame.pack();
	     
	     button.addActionListener(this);
	     
	     int rand = new Random().nextInt(5);
	    
	     if(rand == 0) {
	    	JOptionPane.showMessageDialog(null, "Our deeds determine us, as much as we determine our deeds"); 
	     }
	     
	     if(rand == 1) {
	    	 JOptionPane.showMessageDialog(null, "Land is always on the mind of a flying bird");
	     }
	   
	     if(rand == 2) {
	    	 JOptionPane.showMessageDialog(null, "What ever you're goal is in life, embrace it visualize it, and for it will be yours");
	     }
	     
	     if(rand == 3) {
	    	 JOptionPane.showMessageDialog(null, "Be on the lookout for coming events; They cast their shadows beforehand");
	     }
	     
	     if(rand == 4) {
	    	 JOptionPane.showMessageDialog(null, "Be on the lookout for coming events; They cast their shadows beforehand");
	     }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 	   
	   
	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	    JOptionPane.showMessageDialog(null, "Woohoo");
	}
	}



