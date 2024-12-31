package github;
import java.util.Scanner;
public class DiamondPattern {
	public static void main(String[] args) {
        
		Scanner N= new Scanner(System.in); 
		
   	    String stars= "*";
   	    int H;
   	    int S;
   	    int ST;
   	    
		System.out.println("please input the height of the diamond");
        int height= N.nextInt();
        
        if(height %2 ==0) {
        	height=height/2;
            for(H=1;H<=height;H++) {
            	for(S=1;S<=height-H;S++) {
                  System.out.print(" ");}
            	for(ST=1;ST<=(2*H-1);ST++) {
                  System.out.print(stars);
            	}
                  System.out.println();
            	}
            for(H=height;H>=1;H--) {
            	for(S=1;S<=height-H;S++) {
                    System.out.print(" ");}
              	for(ST=1;ST<=(2*H-1);ST++) {
                    System.out.print(stars);
              	}
                    System.out.println();
              	}
          }else {
        	  height= (height+1)/2;
                
            for(H=1;H<=height;H++) {
        	   for(S=1;S<=height-H;S++) {
                System.out.print(" ");}
        	   for(ST=1;ST<=(2*H-1);ST++) {
                System.out.print(stars);
        	     }
                System.out.println();
        	     }
            for(H=height-1;H>=1;H--) {
        	   for(S=1;S<=height-H;S++) {
                  System.out.print(" ");}
          	   for(ST=1;ST<=(2*H-1);ST++) {
                 System.out.print(stars);
          	    }
                 System.out.println();
          	    }
		
        }
	}
        

}
