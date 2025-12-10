/*
 * Author: Amirs
 * Date: 12/02/24
 * Description: This is the paddle file for a brick break game controlling the paddle
 */


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
	//precondition: g isnt null
	//post condition, draws a rectangle
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
	//precondition: velocity is declared
	//post condition: adds value to the velocity 
	public void addVelocity(int _v){
		Velocity += _v;
	}
	public void setVelocity(int _v){
		Velocity = _v;
	}
	//precondition: Velocity is declared
	//post condition; reverses the value of velocity
	public void reverseVelocity(){
		Velocity *= -1;
	}
	//precondition x is declared
	//post condition: adds the velocity value to the x value
	public void move(){
		x += Velocity;
	}

	//your code here!


	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	
	//methods:
	
	
}
