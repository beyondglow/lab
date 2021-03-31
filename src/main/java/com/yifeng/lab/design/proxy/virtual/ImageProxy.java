package com.yifeng.lab.design.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThead;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		this.imageURL = url;
	}
	

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}
		return 800;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			System.out.println("已经实例化了哦");
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait awhile...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				retrievalThead = new Thread(new Runnable(){
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThead.start();
			}
		}
	}
	

}
