package model;

public class DogName extends Dogs
{
	String name;

	public DogName()
	{
		
	}
	
	public void assign(int id)
	{
		if(id == 1)
		{
			name = "Martina";
		}
		
		if(id == 2)
		{
			name = "Kaiser";
		}
		
		if(id == 3)
		{
			name = "Heisenberg";
		}
		
		if(id == 4)
		{
			name = "Lola";
		}
		
		if(id == 5)
		{
			name = "Nymeria";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
