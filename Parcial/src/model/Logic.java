package model;

import java.util.Collections;

import processing.core.PApplet;

public class Logic implements Comparable
{
	PApplet app;
	String[] textNew;
	
	Dogs dog, dog2, dog3, dog4, dog5;
	boolean allAssigned;

	public Logic(PApplet app) 
	{
		this.app = app;
		
		dog = new Dogs();
		dog2 = new Dogs();
		dog3 = new Dogs();
		dog4 = new Dogs();
		dog5 = new Dogs();
	}
	
	public void saveNewText()
	{
		
	}
	
	public void draw(PApplet app)
	{
		app.fill(0);
		app.textSize(19);
		app.textAlign(app.LEFT);
		
		dog.loadText(app);
		dog.separateText();
		dog.validateText(1);
		app.text(dog.id1 + ", " + dog.name1.name + ", " + dog.birthday1.birthday + ", " + dog.breed1.breed, 84, 47);
				
		dog2.loadText(app);
		dog2.separateText();
		dog2.validateText(2);
		app.text(dog2.id2 + ", " + dog2.name2.name + ", " + dog2.birthday2.birthday + ", " + dog2.breed2.breed, 84, 87);
				
		dog3.loadText(app);
		dog3.separateText();
		dog3.validateText(3);
		app.text(dog3.id3 + ", " + dog3.name3.name + ", " + dog3.birthday3.birthday + ", " + dog3.breed3.breed, 84, 127);
				
		dog4.loadText(app);
		dog4.separateText();
		dog4.validateText(4);
		app.text(dog4.id4 + ", " + dog4.name4.name + ", " + dog4.birthday4.birthday + ", " + dog4.breed4.breed, 84, 167);
				
		dog5.loadText(app);
		dog5.separateText();
		dog5.validateText(5);
		app.text(dog5.id5 + ", " + dog5.name5.name + ", " + dog5.birthday5.birthday + ", " + dog5.breed5.breed, 84, 207);
			
	}
	
	public void sortList()
	{
		
	}

	@Override
	public int compareTo(Object arg0) 
	{
		return 0;
	}

}
