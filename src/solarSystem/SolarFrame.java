package solarSystem;

import java.awt.Graphics;
import java.awt.Image;

import GameUtil.Constant;
import GameUtil.GameUtil;
import GameUtil.JiaZai;

public class SolarFrame extends JiaZai{
	//JiaZai a = new JiaZai();
	
	Image img = GameUtil.getImages("img/bj.jpg");
	Star sun=new Star("img/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HIHGT/2);
	
	
	Plants earth =new Plants(sun, "img/01.jpg", 150, 150, 0.1);
	
	public void  paint (Graphics g) {
		g.drawImage(img, 0, 0, null);
		sun.drew(g);
	earth.drew(g);
}
	public static void main(String[] args) {
		
		new SolarFrame().launchFrame();
	}
}
