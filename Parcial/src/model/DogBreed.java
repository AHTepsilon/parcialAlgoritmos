package model;

import java.util.Comparator;

public class DogBreed extends Dogs implements Comparator
{
	String breed;

	public DogBreed() 
	{
	
	}
	
	public void assign(int id)
	{
		if(id == 1)
		{
			breed = "Labrador retriever";
		}
		
		if(id == 2)
		{
			breed = "Pastor aleman";
		}
		
		if(id == 3)
		{
			breed = "Bulldog";
		}
		
		if(id == 4)
		{
			breed = "Rottweiler";
		}
		
		if(id == 5)
		{
			breed = "Husky siberiano";
		}
	}
	
	@Override
	public int compare(Object arg0, Object arg1) 
	{
		return 0;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}
