package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{

	JButton button1 = new JButton("PinkFluffyUnicorns");
	
	JButton button2 = new JButton("DuckSong");
	
	JButton button3 = new JButton("Frogs");
	
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	

	 void GUI() {
		// TODO Auto-generated method stub

		 
		    JFrame frame = new JFrame();
		    
		    JPanel panel = new JPanel();
			
			button1.addActionListener(this);
			
			button2.addActionListener(this);
			
			button3.addActionListener(this);
			
			frame.add(panel);
			
			panel.add(button1);
			
			panel.add(button2);
			
			panel.add(button3);
			
			frame.setVisible(true);
			
			frame.pack();
			
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if(e.getSource()== button1) {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	
	if(e.getSource()== button2) {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	
	if(e.getSource()== button3) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
		
	}

}
