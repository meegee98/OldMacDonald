class Chick implements Animal 
{     
     protected String myType;     
     protected String mySound;      
     public Chick(String type, String sound)     
     {         
         myType = type;         
         mySound = sound;     
     }    
     public Chick(String type, String sound1, String sound2)
     {
     	myType=type;
     	if(Math.random() > .4)
     	{
     		mySound=sound2;
     	}
     	else
     	{
     		mySound=sound1;
     	}
     }    
     public Chick()
     {         
         myType= "unknown";         
         mySound = "unknown";     
     }  
     public String getSound(){return mySound;}
     public String getType(){return myType;} 
    //your code here
}