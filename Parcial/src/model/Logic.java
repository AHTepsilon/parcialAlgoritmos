package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic
{
	PApplet app;
	String[] textNew;
	
	Dogs dog, dog2, dog3, dog4, dog5;
	boolean allAssigned;
	
	String dogOneText, dogTwoText, dogThreeText, dogFourText, dogFiveText;
	
	int dogOneY, dogTwoY, dogThreeY, dogFourY, dogFiveY;
	
	int orderInt;
	
	LinkedList<Dogs> listDogs;
	
	public Logic(PApplet app) 
	{
		this.app = app;
		
		dog = new Dogs();
		dog2 = new Dogs();
		dog3 = new Dogs();
		dog4 = new Dogs();
		dog5 = new Dogs();
		
		listDogs = new LinkedList<Dogs>();
		
		dogOneY = 47;
		dogTwoY = 87;
		dogThreeY = 127;
		dogFourY = 167;
		dogFiveY = 207;
	}
	
	public void saveNewText()
	{
		switch(orderInt)
		{
		case 0:
			
		}
	}
	
	public void draw(PApplet app)
	{
		app.fill(0);
		app.textSize(19);
		app.textAlign(app.LEFT);
		
		dog.loadText(app);
		dog.separateText();
		dog.validateText(1);
		app.text(dog.id1 + ", " + dog.name1.name + ", " + dog.birthday1.birthday + ", " + dog.breed1.breed, 84, dogOneY);
				
		dog2.loadText(app);
		dog2.separateText();
		dog2.validateText(2);
		app.text(dog2.id2 + ", " + dog2.name2.name + ", " + dog2.birthday2.birthday + ", " + dog2.breed2.breed, 84, dogTwoY);
				
		dog3.loadText(app);
		dog3.separateText();
		dog3.validateText(3);
		app.text(dog3.id3 + ", " + dog3.name3.name + ", " + dog3.birthday3.birthday + ", " + dog3.breed3.breed, 84, dogThreeY);
				
		dog4.loadText(app);
		dog4.separateText();
		dog4.validateText(4);
		app.text(dog4.id4 + ", " + dog4.name4.name + ", " + dog4.birthday4.birthday + ", " + dog4.breed4.breed, 84, dogFourY);
				
		dog5.loadText(app);
		dog5.separateText();
		dog5.validateText(5);
		app.text(dog5.id5 + ", " + dog5.name5.name + ", " + dog5.birthday5.birthday + ", " + dog5.breed5.breed, 84, dogFiveY);
			
	}
	
	public void sortList()
	{	
		if(app.mouseX > 308 && app.mouseX < 391 && app.mouseY > 419 && app.mouseY < 450)
		{
			dogOneY = 47;
			dogTwoY = 87;
			dogThreeY = 127;
			dogFourY = 167;
			dogFiveY = 207;
			
			orderInt = 0;
		}
		
		if(app.mouseX > 208 && app.mouseX < 291 && app.mouseY > 419 && app.mouseY < 450)
		{
			dogOneY = 167;
			dogTwoY = 87;
			dogThreeY = 47;
			dogFourY = 127;
			dogFiveY = 207;
			
			orderInt = 1;
		}
		
		if(app.mouseX > 108 && app.mouseX < 191 && app.mouseY > 419 && app.mouseY < 450)
		{
			dogOneY = 167;
			dogTwoY = 47;
			dogThreeY = 127;
			dogFourY = 207;
			dogFiveY = 87;
			
			orderInt = 2;
		}
		
		if(app.mouseX > 8 && app.mouseX < 91 && app.mouseY > 419 && app.mouseY < 450)
		{
			dogOneY = 127;
			dogTwoY = 167;
			dogThreeY = 47;
			dogFourY = 207;
			dogFiveY = 87;
			
			orderInt = 3;
		}
		
		
//		for(int i = 0; i < listDogs.size(); i++)
//		{
//			if(dog.id == 1)
//			{
//				String name = listDogs.get(i).name1.getName();
//				String breed = listDogs.get(i).breed1.getBreed();
//				String birthday = listDogs.get(i).birthday1.getBirthday();
//				
//				dogOneText = dog.id + ", " + name + ", " + birthday + ", " + breed;
//			}
//			
//			if(dog.id == 2)
//			{
//				String name = listDogs.get(i).name2.getName();
//				String breed = listDogs.get(i).breed2.getBreed();
//				String birthday = listDogs.get(i).birthday2.getBirthday();
//				
//			dogTwoText = dog.id + ", " + name + ", " + birthday + ", " + breed;
//			}
//			
//			if(dog.id == 3)
//			{
//				String name = listDogs.get(i).name3.getName();
//				String breed = listDogs.get(i).breed3.getBreed();
//				String birthday = listDogs.get(i).birthday3.getBirthday();
//				
//				dogThreeText = dog.id + ", " + name + ", " + birthday + ", " + breed;
//			}
//			
//			if(dog.id == 4)
//			{
//				String name = listDogs.get(i).name4.getName();
//				String breed = listDogs.get(i).breed4.getBreed();
//				String birthday = listDogs.get(i).birthday4.getBirthday();
//				
//				dogFourText = dog.id + ", " + name + ", " + birthday + ", " + breed;
//			}
//			
//			if(dog.id == 5)
//			{
//				String name = listDogs.get(i).name5.getName();
//				String breed = listDogs.get(i).breed5.getBreed();
//				String birthday = listDogs.get(i).birthday5.getBirthday();
//				
//				dogFiveText = dog.id + ", " + name + ", " + birthday + ", " + breed;
//			}
//		
//		if(app.mouseX > 268 && app.mouseX < 351 && app.mouseY > 419 && app.mouseY < 450)
//		{
//			Collections.sort(listDogs);
//				
//				textNew[i] = dogOneText + dogTwoText + dogThreeText + dogFourText + dogFiveText;
//				
//				app.saveStrings("savedDogs.txt", textNew);
//			}
//		}
	}

}
