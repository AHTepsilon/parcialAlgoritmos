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
	
	public void sortList()
	{
		logic.draw(app);
	}
	
	public void saveNewText()
	{
		logic.saveNewText();
	}

}
