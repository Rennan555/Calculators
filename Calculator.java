// Used package
package src;

// Imported libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

// Class block
public class Calculator {
	public static void main(String[] args) {
		
		// Util variables
		ArrayList<String> elements = new ArrayList<>();
		
		// General screen config
		final int SCREENWIDTH = 400;
		final int SCREENHEIGTH = 300;
		final int DISPLAYWIDTH = SCREENHEIGTH;
		final int DISPLAYHEIGTH = 50;
		final int BUTTONSIZE = 50;
		
		// Frame declaration
		JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREENWIDTH, SCREENHEIGTH);
        frame.setVisible(true);
        frame.setLayout(null);
        
        // Display declaration
        JTextField display = new JTextField("...");
        display.setBounds(0, 0, DISPLAYWIDTH, DISPLAYHEIGTH);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        frame.add(display);
        
        // Numbers declaration
        JButton[][] numberButtons = new JButton[3][3];
        int num = 1;
        for(int j=0;j<3;j++) for(int i=0;i<3;i++) {
        	numberButtons[i][j] = new JButton(Integer.toString(num));
        	numberButtons[i][j].setBounds(i*BUTTONSIZE, j*BUTTONSIZE+DISPLAYHEIGTH, BUTTONSIZE, BUTTONSIZE);
        	num++;
        	frame.add(numberButtons[i][j]);
        }
        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(BUTTONSIZE, BUTTONSIZE*3+DISPLAYHEIGTH, BUTTONSIZE, BUTTONSIZE);
        frame.add(zeroButton);
	}
}
