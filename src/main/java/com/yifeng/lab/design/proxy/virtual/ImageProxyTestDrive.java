package com.yifeng.lab.design.proxy.virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {
	
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenu menu;
	JMenuBar menuBar;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
	}
	
	public ImageProxyTestDrive() throws Exception{
		cds.put("Ambient", "http://www.beautyallin.net/ymh/shop/20190603141619_img_700x700_android.jpg");
		cds.put("Buddha", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/WuZhenXianDiaoKangShuai/logo/logo.jpg");
		cds.put("Ima", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/WuZhenShuiGuangGuanFu/logo/logo.jpg");
		cds.put("Karma", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/BaiJingXiNen/logo/logo.jpg");
		cds.put("MCMXC", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/ShuiYangSPAXingFu/logo/logo.jpg");
		cds.put("Northern", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/4/ShuiYangBaoShi/logo/logo.jpg");
		cds.put("Vol", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/3/JinZhiFuHuoYanBu/logo/logo.jpg");
		cds.put("oliver", "http://file.beautyallin.net/images/products/Amymuscle/MeiRong/3/MeiJingNenFu/logo/logo.jpg");
		URL initialURL = new URL((String)cds.get("oliver"));
        
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        for (Enumeration e = cds.keys(); e.hasMoreElements();) {
        	String name = (String)e.nextElement();
        	JMenuItem menuItem = new JMenuItem(name);
        	menu.add(menuItem);
        	menuItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ImageProxy(getUrl(cds.get(e.getActionCommand()))));
					frame.repaint();
				}
        		
        	});
        }
        //建立框架和菜单
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
	}
	
	URL getUrl(String url) {
		try {
			return new URL(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
