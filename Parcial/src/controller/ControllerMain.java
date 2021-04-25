package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerMain
{
	Logic logic;
	PApplet app;

	public ControllerMain(PApplet app) 
	{
		this.app = app;
		logic = new Logic(app);
	}
	
	public void draw(PApplet app)
	{
		logic.draw(app);
	}
	
	public void sortList()
	{
		logic.sortList();
	}
	
	public void saveNewText()
	{
		logic.saveNewText();
	}

}
