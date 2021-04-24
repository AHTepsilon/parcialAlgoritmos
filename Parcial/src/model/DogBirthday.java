package model;

public class DogBirthday extends Dogs
{
	String birthday;
	
	public DogBirthday(String birthday) 
	{
		this.birthday = birthday;
	}
	
	public void assign()
	{
		if(id1 == 1)
		{
			birthday = "11-04-2019";
		}
		
		if(id2 == 2)
		{
			birthday = "14-06-2010";
		}
		
		if(id3 == 3)
		{
			birthday = "10-02-2019";
		}
		
		if(id4 == 4)
		{
			birthday = "05-12-2020";
		}
		
		if(id5 == 5)
		{
			birthday = "09-02-2017";
		}
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	

}
