package view;
import controller.ControllerMain;
import model.Dogs;
import processing.core.PApplet;

public class Main extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("view.Main");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(500, 500);
	}
	
	int posXButton, posYButton;
	ControllerMain controls;
	
	@Override
	public void setup() //void Start
	{		
		posXButton = 410;
		posYButton = 435;
		
		controls = new ControllerMain(this);

	}
	
	@Override
	public void draw() //void Update
	{		
		//System.out.println(mouseX + ", " + mouseY);
		background(145, 242, 216);
		rectMode(CENTER);
		buttons();
		controls.sortList();
	}
	
	public void mousePressed()
	{
		
	}
	
	public void buttons()
	{
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton, posYButton, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("SAVE", 410, 443);
		
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton - 100, posYButton, 80, 30);
	}

}

