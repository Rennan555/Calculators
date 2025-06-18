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
		final int SCREENHEIGTH = 500;
		final int DISPLAYWIDTH = SCREENHEIGTH;
		final int DISPLAYHEIGTH = 100;
		
		// Frame declaration
		JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREENWIDTH, SCREENHEIGTH);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        
        // Display declaration
        JTextField display = new JTextField("...");
        display.setBounds(0, 0, DISPLAYWIDTH, DISPLAYHEIGTH);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        
        // Components addition
        frame.add(display);
	}
}
