package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener{
	
	JButton button = new JButton("CowMoo");
	
	JButton button1 = new JButton("DingDong"); 
	
	JButton button2 = new JButton("OwlHoot");
	
	JButton button3 = new JButton("CatMeow");
	
	JButton button4 = new JButton("RobinChirp");
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	
	

public static void main(String[] args) {
	new SoundEffectsMachine ().GUI();
}

void GUI() {
	// TODO Auto-generated method stub
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	button.addActionListener(this);
	
	button1.addActionListener(this);
	
	button2.addActionListener(this);
	
	button3.addActionListener(this);
	
	button4.addActionListener(this);
	
	frame.add(panel);
	
	panel.add(button);
	
	panel.add(button1);
	
	panel.add(button2);
	
	panel.add(button3);
	
	panel.add(button4);
	
	frame.setVisible(true);
	
	frame.pack();
	
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()== button) {
		playSound("cow.wav");
	}
	
	if(e.getSource()== button1) {
		playSound("ding.wav");
	}
	
	if(e.getSource()== button2) {
		playSound("owl.wav");
	}
	
	if(e.getSource()== button3) {
		playSound("meow.mp3");
	}
	
	if(e.getSource()== button4) {
		playSound("robin.wav");
	}
	
}
}
