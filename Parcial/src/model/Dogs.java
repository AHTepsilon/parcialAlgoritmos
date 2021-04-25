package model;

import processing.core.PApplet;

public class Dogs
{
	String[] text1;
	String[] text2;
	
	String[] arrayWords;
	String[] arrayWords1;
	
	String[] newText;
	int posX;
	int posY;
	int id1, id2, id3, id4, id5;
	PApplet app;
	
	
	DogName name1, name2, name3, name4, name5;
	DogBirthday birthday1, birthday2, birthday3, birthday4, birthday5;
	DogBreed breed1, breed2, breed3, breed4, breed5;

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
			
			name1 = new DogName();
			birthday1 = new DogBirthday();
			breed1 = new DogBreed();
			
			name1.assign(1);
			birthday1.assign(1);
			breed1.assign(1);
			
			//System.out.println(id1 + ", " + name1.name + ", " + birthday1.birthday + ", " + breed1.breed);
		}
		if(id == 2)
		{
			id2 = Integer.parseInt(arrayWords[2]);
			
			name2 = new DogName();
			birthday2 = new DogBirthday();
			breed2 = new DogBreed();
			
			name2.assign(2);
			birthday2.assign(2);
			breed2.assign(2);
			
			//System.out.println(id2 + ", " + name2.name + ", " + birthday2.birthday + ", " + breed2.breed);
		}
		if(id == 3)
		{
			id3 = Integer.parseInt(arrayWords[4]);
			
			name3 = new DogName();
			birthday3 = new DogBirthday();
			breed3 = new DogBreed();
			
			name3.assign(3);
			birthday3.assign(3);
			breed3.assign(3);
			
			//System.out.println(id3 + ", " + name3.name + ", " + birthday3.birthday + ", " + breed3.breed);
		}
		if(id == 4)
		{
			id4 = Integer.parseInt(arrayWords[6]);
			
			name4 = new DogName();
			birthday4 = new DogBirthday();
			breed4 = new DogBreed();
			
			name4.assign(4);
			birthday4.assign(4);
			breed4.assign(4);
			
			//System.out.println(id4 + ", " + name4.name + ", " + birthday4.birthday + ", " + breed4.breed);
		}
		if(id == 5)
		{
			id5 = Integer.parseInt(arrayWords[8]);
			
			name5 = new DogName();
			birthday5 = new DogBirthday();
			breed5 = new DogBreed();
			
			name5.assign(5);
			birthday5.assign(5);
			breed5.assign(5);
			
			//System.out.println(id5 + ", " + name5.name + ", " + birthday5.birthday + ", " + breed5.breed);
		}
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

	public String[] getNewText() {
		return newText;
	}

	public void setNewText(String[] newText) {
		this.newText = newText;
	}

}
