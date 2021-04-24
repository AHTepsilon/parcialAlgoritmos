package model;

import processing.core.PApplet;

public class Logic 
{
	PApplet app;
	String[] textNew;
	
	Dogs dog;

	public Logic(PApplet app) 
	{
		this.app = app;
		
		dog = new Dogs();
	}
	
	public void saveNewText()
	{
		
	}
	
	public void draw(PApplet app)
	{
		dog.loadText(app);
		dog.separateText();
		dog.validateText(4);
	}
	
	public void sortList()
	{
		
	}

}
