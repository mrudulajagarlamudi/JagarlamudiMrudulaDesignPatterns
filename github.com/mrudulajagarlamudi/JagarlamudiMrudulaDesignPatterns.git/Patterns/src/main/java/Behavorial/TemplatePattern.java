package Behavorial;

public class TemplatePattern {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        
        Class c=Class.forName(args[0]);  
        Game game=(Game) c.newInstance();  
        game.play();     
      }  

}
