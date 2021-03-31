package com.yifeng.lab.design.template;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

	String message;
	
	@Override
	public void init() {
		message = "Hello world, I`m alive!";
		repaint();
	}

	@Override
	public void start() {
		message = "Now I`m starting up...";
		repaint();
	}

	@Override
	public void stop() {
		message = "Oh, now i`m being stopped..";
		repaint();
	}

	@Override
	public void destroy() {
		//applet正在销毁
	}
	
	public void paint(Graphics g){
		g.drawString(message, 5, 15);
	}
}
