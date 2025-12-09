package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//your code here!
	private int x;
	private int y;
	private int width;
	private int height;
	private int Velocity = 1;

	//don't forget you need instance variables:
	public Paddle(int _x, int _y, int _width, int _height){
		x = _x;
		y = _y;
		width = _width;
		height = _height;
	}
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillRect(x, y, width, height);

	}
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity() {
		return Velocity;
	}

	public void setX(int _x){
		x = _x;
	}
	public void setY(int _y){
		y = _y;
	}
	public void addVelocity(int _v){
		Velocity += _v;
	}
	public void setVelocity(int _v){
		Velocity = _v;
	}

	public void reverseVelocity(){
		Velocity *= -1;
	}

	public void move(){
		x += Velocity;
	}

	//your code here!


	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	
	//methods:
	
	
}
