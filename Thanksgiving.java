
import java.util.*;

public class Thanksgiving {
	public static int thanksgiving(int x) {
		  return (28-(x-2+x/4-x/100+x/400)%7);
	}

  public static void main(String[] args) {
    Scanner getInput = new Scanner(System.in);
 
    boolean validInput = false;
    

    int x = getInput.nextInt();
    System.out.println(thanksgiving(x));
	


    
      
    
    
  }
}