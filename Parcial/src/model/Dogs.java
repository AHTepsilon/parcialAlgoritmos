package model;

import processing.core.PApplet;

public class Dogs 
{
	String[] text1;
	String[] text2;
	int posX;
	int posY;
	int id;
	PApplet app;

	public Dogs() 
	{
		
	}
	
	public void loadText(PApplet app)
	{
		text1 = app.loadStrings("./imports/dogs1");
		text2 = app.loadStrings("./imports/dogs2");
	}
	
	public void separateText()
	{
		for (int i = 0; i < text1.length; i++) 
		{
			String[] arrayWords = text1[i].split(" ");
		}
		for (int i = 0; i < text2.length; i++) 
		{
			String[] arrayWords2 = text2[i].split(" ");
		}
	}
	
	public void compareTo()
	{
		
	}

	public String[] getText1() {
		return text1;
	}

	public void setText1(String[] text1) {
		this.text1 = text1;
	}

	public String[] getText2() {
		return text2;
	}

	public void setText2(String[] text2) {
		this.text2 = text2;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

}
