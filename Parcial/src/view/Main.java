package view;
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
	
	@Override
	public void setup() //void Start
	{
		
	}
	
	@Override
	public void draw() //void Update
	{		
		System.out.println(mouseX + ", " + mouseY);
		background(145, 242, 216);
		rectMode(CENTER);
		saveButton();
	}
	
	public void mousePressed()
	{
		
	}
	
	public void saveButton()
	{
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(410, 435, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("SAVE", 410, 443);
	}

}

