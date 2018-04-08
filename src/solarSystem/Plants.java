package solarSystem;

import java.awt.Graphics;

import GameUtil.GameUtil;

public class Plants extends Star {
int i=1;
	double longAxis;
	double shortAzis;
	double speed;
	Star center;
	double degree;
	
	public Plants(Star center,String path, double longAxis, double shortAzis, double speed) {
		this.center=center;
		this.x=center.x+longAxis;
		this.y=center.y;
		this.img=GameUtil.getImages(path);
		this.longAxis = longAxis;
		this.shortAzis = shortAzis;
		this.speed = speed;
		this.center = center;
		System.out.println(degree);
	}
	public void drew(Graphics g) {
		g.drawImage(img,(int)x,(int)y, null);
		x=center.x+longAxis*Math.cos(degree)+center.width/2;
		y=center.y+shortAzis*Math.sin(degree)+center.height/2;
		degree = degree+ speed;
		
		
	}

	public Plants(String imgPath, double x, double y) {
		super(imgPath, x, y);
	}

}
