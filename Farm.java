class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     
   {       
      aBunchOfAnimals[0] = new NamedCow("cow","Elsie", "moo");           
      aBunchOfAnimals[1] = new Chick("chick","peep","cluck");       
      aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
   public void animalSounds()   
    {  
    //System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );     
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       
     	{          
       		System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      	}   
     System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() ); 
    } 
    //your code here
}
