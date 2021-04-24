package model;

import processing.core.PApplet;

public class Dogs 
{
	String[] text1;
	String[] text2;
	
	String[] arrayWords;
	String[] arrayWords1;
	int posX;
	int posY;
	int id1, id2, id3, id4, id5;
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
			arrayWords = text1[i].split(" ");
		}
		for (int i = 0; i < text2.length; i++) 
		{
			arrayWords1 = text2[i].split(" ");
		}
	}
	
	public void validateText(int id)
	{
		if(id == 1)
		{
			id1 = Integer.parseInt(arrayWords[0]);
			System.out.println(1);
		}
		if(id == 2)
		{
			id2 = Integer.parseInt(arrayWords[2]);
			System.out.println(2);
		}
		if(id == 3)
		{
			id3 = Integer.parseInt(arrayWords[4]);
			System.out.println(3);
		}
		if(id == 4)
		{
			id4 = Integer.parseInt(arrayWords[6]);
			System.out.println(4);
		}
		if(id == 5)
		{
			id5 = Integer.parseInt(arrayWords[8]);
			System.out.println(5);
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

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public int getId3() {
		return id3;
	}

	public void setId3(int id3) {
		this.id3 = id3;
	}

	public int getId4() {
		return id4;
	}

	public void setId4(int id4) {
		this.id4 = id4;
	}

	public int getId5() {
		return id5;
	}

	public void setId5(int id5) {
		this.id5 = id5;
	}
	
	

}
