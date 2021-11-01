//------------------------------------------------------------
// Assignment 3 
// Written by: Vraj Patel (40155059)
//For COMP 248 Section AI(lab) AAAE(Tutorial)
//-------------------------------------------------------------

public class Vaccine {
// Declare some instance variables
	private String name, type, company;
	private int dose;
// Default constructors
	public Vaccine()
	{
		name = "Pfizer" ;
		type = "mRNA" ;
		dose = 2;
		company ="BioNtech" ;
	}
// Constructor with 4 arguments
	public Vaccine(String name, String type, int dose, String company)
	{
		this.name =name;
		this.type =type;
		this.dose =dose;
		this.company=company;
	}
// copy Constructor 
	public Vaccine(Vaccine vacc)
	{
		this.name = vacc.name;
		this.type = vacc.type;
		this.dose = vacc.dose;
		this.company = vacc.company;
	}
// accessor methods 
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public String getCompany()
	{
		return company;
	}
	public int getDose()
	{
		return dose;
	}
// mutator
	public void setName(String s)
	{
		name = s;
	}
	public void setType(String s)
	{
		type = s;
	}
	public void setCompany(String s)
	{
		company = s;
	}
	public void setDose(int s)
	{
		dose =s;
	}
// tostring method
	public String toString()
	{
		return "Name: " + name + ", Type: "+ type +", Dose: " + dose + ", Company:"+ company;
	}
// to check equality
	public Boolean equals(Vaccine v)
	{
		return name == v.name &&  type == v.type && dose == v.dose && company == v.company;
	}
}// end of class
