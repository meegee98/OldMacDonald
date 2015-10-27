class NamedCow extends Cow
{
	protected String myName, myType, mySound;
	public NamedCow(String type, String name, String sound)
	{
		myType=type;
		myName=name;
		mySound=sound;
	}
	public NamedCow(String type, String name1, String name2, String sound)
     {
     	myType=type;
     	if(Math.random() > .5)
     	{
     		myName=name1;
     	}
     	else
     	{
     		myName=name2;
     	}
     	mySound=sound;
     }
 	public NamedCow()
     {         
        myType= "unknown"; 
        myName="unknown" ;
        mySound = "unknown";            
     }  
	public String getName(){return myName;}	
}