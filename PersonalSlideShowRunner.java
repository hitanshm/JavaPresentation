//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;

public class PersonalSlideShowRunner extends JFrame 
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;

	public PersonalSlideShowRunner()
	{
		super("Personal Slide Show");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new PersonalSlideShow());
     

		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		PersonalSlideShowRunner run = new PersonalSlideShowRunner();
	}
}