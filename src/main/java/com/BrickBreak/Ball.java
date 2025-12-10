/*
 * Author: Amir
 * Date: 12/02/24
 * Description: This is the ball file for a brick break game controlling the ball
 */


package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	private int x;
	private int y;
	private int radius;
	private int XVelocity = 5;
	private int YVelocity = 1;
	//don't forget you need instance variables:
	public Ball(int _x, int _y, int _radius){
		x = _x;
		y = _y;
		radius = _radius;
	}
	//precondition: g exists
	//postcondition: draws a ball
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, radius, radius);

	}
	//
	public int getYpos(){
		return y;
	}
	public int getXpos(){
		return x;
	}
	public int getSize(){
		return radius;
	}
	public void setX(int _x){
		x = _x;
	}
	public void setY(int _y){
		y = _y;
	}
	public void setXVelocity(int _v){
		XVelocity = _v;
	}
	public void setYVelocity(int _v){
		YVelocity = _v;
	}
	//precondition: XVelocity/YVelocity is declared
	//post condition; reverses the value of velocity
	public void reverseX(){
		XVelocity *= -1;
	}
	public void reverseY(){
		YVelocity *= -1;
	}
	//precondition, x and y are declared
	//post condition: adds velocity to the x and y values
	public void move(){
		y += YVelocity;
		x += XVelocity;
	}
	
	
	//constructor(s):
	
	//methods:

}
