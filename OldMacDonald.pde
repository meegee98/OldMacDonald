
public void setup()
{  
    Farm f = new Farm();
    f.animalSounds();

    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());  

    Chick h = new Chick("chick", "cluck");   
    System.out.println(h.getType() + " goes " + h.getSound()); 

    Pig p = new Pig("pig", "oink");   
    System.out.println(p.getType() + " goes " + p.getSound()); 

}

