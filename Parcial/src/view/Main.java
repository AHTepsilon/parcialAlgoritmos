package view;
import controller.ControllerMain;
import model.Dogs;
import processing.core.PApplet;
import processing.core.PImage;

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
		posXButton = 450;
		posYButton = 435;
		
		controls = new ControllerMain(this);
		
		controls.loadImages();
	}
	
	@Override
	public void draw() //void Update
	{		
		System.out.println(mouseX + ", " + mouseY);
		background(145, 242, 216);
		rectMode(CENTER);
		imageMode(CENTER);
		buttons();
		controls.draw(this);
	}
	
	public void mousePressed()
	{
		controls.sortList();
		
		System.out.println("test");
		
		controls.saveNewText();
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
		text("SAVE", posXButton, 443);
		
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton - 100, posYButton, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("ID", posXButton - 100, 443);
		
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton - 200, posYButton, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("NAME", posXButton - 200, 443);
		
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton - 300, posYButton, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("BIRTH", posXButton - 300, 443);
		
		stroke(0);
		strokeWeight(3);
		fill(255);
		rect(posXButton - 400, posYButton, 80, 30);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("BREED", posXButton - 400, 443);
		
		textAlign(CENTER);
		fill(0);
		textSize(20);
		text("Select the sorting method you want", posXButton - 200, 403);
	}

}

