package model;

public class DogName extends Dogs
{
	String name;

	public DogName(String name)
	{
		this.name = name;
	}
	
	public void assign()
	{
		if(id1 == 1)
		{
			name = "Martina";
		}
		
		if(id2 == 2)
		{
			name = "Kaiser";
		}
		
		if(id3 == 3)
		{
			name = "Heisenberg";
		}
		
		if(id4 == 4)
		{
			name = "Lola";
		}
		
		if(id5 == 5)
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
