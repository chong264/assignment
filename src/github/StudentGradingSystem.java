package github;
import java.util.Scanner;
public class StudentGradingSystem {

	public static void main(String[] args) {
		
		
        int Grade;
        int SubT;
        int LoopT= 0;
        int charT= 0;
        float Total= 0;
        float average;
        char G= 'A';
        
		Scanner S= new Scanner(System.in);
		
	    	System.out.println("please input your name");
	    	String name=S.next();
        
		    for(SubT=1;SubT<=3;SubT++)
		    {
			  System.out.println("please input your subject"+"("+ SubT+"/3)");
			  String subject =S.next();
			  System.out.println("please input your score (between 0 and 100)"+ "("+ SubT+"/3)");
			  float N = S.nextFloat();

			  Total = (N+ Total);
	    	 }
		
		System.out.println("Hi!"+name);
		System.out.println("The sum of your subjects'score is"+ " "+Total);
		
		System.out.println("Based on the subject and score you inputed");
		average= Total/3;
		System.out.println("Your average score is"+" "+average);
	    
	        for( Grade=100 ;(Grade-10)>average;Grade -=10) 
	        {
	        	LoopT++;
	            
	           while(charT<LoopT) 
	            {
	            charT++;
	            G++;
	            }
	           
	        }
	                
	        if( G <= 'D'){
	        	System.out.print("Your grade is"+ " " +G);
	        	}else {
	        	  System.out.print("You fail the exam.");
	              }


	}
}
