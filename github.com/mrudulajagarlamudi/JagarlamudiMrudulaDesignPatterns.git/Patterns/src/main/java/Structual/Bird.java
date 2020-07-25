package Structual;

public interface Bird {

	    
	    public void fly(); 
	    public void makeSound(); 

}
class Sparrow implements Bird 
{ 
    // a concrete implementation of bird 
    public void fly() 
    { 
        System.out.println("Flying"); 
    } 
    public void makeSound() 
    { 
        System.out.println("Chirp Chirp"); 
    } 
} 
  
interface ToyDuck 
{ 
    
    public void squeak(); 
} 
  
class PlasticToyDuck implements ToyDuck 
{ 
    public void squeak() 
    { 
        System.out.println("Squeak"); 
    } 
} 
  
class BirdAdapter implements ToyDuck 
{ 
    
    Bird bird; 
    public BirdAdapter(Bird bird) 
    {  
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
        // translate the methods appropriately 
        bird.makeSound(); 
    } 
} 
