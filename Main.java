/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements Runnable
{
    
    
	Thread t;
	DonutRush cr;

	public Main(){
		t = new Thread(this,"Dispose");

		cr = new DonutRush(this);
		cr.start();
		add(cr);

		addKeyListener(cr);
		setTitle("Donut Rush"); //Title Frame
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setSize(1200, 700); 		//frame size
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run(){
		dispose();
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
