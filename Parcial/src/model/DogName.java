package model;

import java.util.Comparator;

public class DogName extends Dogs implements Comparator
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
	
	@Override
	public int compare(Object arg0, Object arg1) 
	{
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
