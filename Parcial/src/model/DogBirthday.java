package model;

import java.util.Comparator;

public class DogBirthday extends Dogs implements Comparator
{
	String birthday;
	
	public DogBirthday() 
	{
		
	}
	
	public void assign(int id)
	{
		if(id == 1)
		{
			birthday = "11-04-2019";
		}
		
		if(id == 2)
		{
			birthday = "14-06-2010";
		}
		
		if(id == 3)
		{
			birthday = "10-02-2019";
		}
		
		if(id == 4)
		{
			birthday = "05-12-2020";
		}
		
		if(id == 5)
		{
			birthday = "09-02-2017";
		}
	}
	
	@Override
	public int compare(Object arg0, Object arg1) 
	{
		return 0;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	

}
