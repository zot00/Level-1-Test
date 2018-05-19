import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ColorTeacher implements ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	ColorTeacher() {
		jframe.setVisible(true);
		jframe.add(jpanel);
		jpanel.add(yellow);
		jpanel.add(red);
		jpanel.add(blue);
		jpanel.add(green);
		jframe.setTitle("Color Teacher");
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);///////////;
		red.setBackground(Color.RED);
		red.setOpaque(true);////////;
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);/////////;
		green.setBackground(Color.GREEN);
		green.setOpaque(true);//////////;
	}
	public static void main(String[] args) {
		ColorTeacher ct = new ColorTeacher();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == yellow) {
			speak("yellow");
		} else if(arg0.getSource() == red) {
			speak("red");
		} else if(arg0.getSource() == blue) {
			speak("blue");
		} else if(arg0.getSource() == green) {
			speak("green");
		}
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}