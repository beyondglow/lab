package com.yifeng.lab.design.template;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) throws HeadlessException {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
	}
	
	
	
	public void paint(Graphics graphics){
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Dsign Patterns");
	}
}
