package solarSystem;

import java.awt.Graphics;
import java.awt.Image;

import GameUtil.GameUtil;
import GameUtil.JiaZai;

public class Star extends JiaZai {
	Image img;
	double x,y;
	int width;
	int height;
	public  Star(String imgPath,double x,double y) {
	img=GameUtil.getImages(imgPath);
	this.x=x;
	this.y=y;
}
	public Star() {
	}
public void drew(Graphics g) {
	g.drawImage(img,(int)x,(int)y, null);
	this.width=img.getWidth(null);
	this.height=img.getHeight(null);
}

}
