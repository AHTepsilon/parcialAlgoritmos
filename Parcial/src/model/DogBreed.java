package model;

public class DogBreed extends Dogs
{
	String breed;

	public DogBreed(String breed) 
	{
		this.breed = breed;
	}
	
	public void assign()
	{
		if(id1 == 1)
		{
			breed = "Labrador retriever";
		}
		
		if(id2 == 2)
		{
			breed = "Pastor aleman";
		}
		
		if(id3 == 3)
		{
			breed = "Bulldog";
		}
		
		if(id4 == 4)
		{
			breed = "Rottweiler";
		}
		
		if(id5 == 5)
		{
			breed = "Husky siberiano";
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}
