package Behavorial;

public class IteratorDemo {
	public static void main(String[] args) {
	      NameRep namesRepository = new NameRep();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
