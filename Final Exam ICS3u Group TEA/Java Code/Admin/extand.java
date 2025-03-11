package program;
import java.util.ArrayList;
import java.util.Scanner;


public class extand {
	 String comment;
	    int rating;   
	    
	    ArrayList <String>review=new ArrayList<>();
	    ArrayList <Integer>rate=new ArrayList<>();
	   
	    public extand(String comment, int rating) {
	        this.comment = comment;
	        this.rating = rating;
	       
 }
	    
	    public void displayReview() {
	        System.out.println("Rating: " + rate );
	        System.out.println("Review: " + review); 
	        		  }

           public void checkReviews() {
	        if (review.isEmpty()) {
	            System.out.println("no review"); 
	        } else {
	            System.out.println(" gameName + review:");
	          }
           }
	        public void writeReview(String addreview) {
	        review.add(addreview);
	  	System.out.println(review);
	        }
	        public void rateGame(int rategame) {
		        rate.add(rategame);
		  	System.out.println(rate);
		        }
}
   
	   
	  
   



class kevinextand extends extand{
	public double interestRate;
	
	kevinextand(String comment, int rating){
		 super(comment,rating);
		 this.comment=comment;
		 this.rating=rating;
		 }




	 ArrayList<String>username=new ArrayList<>();
	 ArrayList<Integer>userId=new ArrayList<>();
	 ArrayList<String>Gamelist=new ArrayList<>();
	 ArrayList<String>Gamecollection=new ArrayList<>();
	 ArrayList<String>gaming=new ArrayList<>();
	 ArrayList<String>gameInfo=new ArrayList<>();
	Scanner b =new Scanner(System.in);
	String name;
	
	
	public void registerUser() {
		System.out.println("Enter your name like(Kevin):");
        
        String s = b.nextLine();
       
        username.add(s);
        
        System.out.println("Enter your id like(123456):");
        int id = b.nextInt();
        b.nextLine();
        userId.add(id);
       
       
        System.out.println("Success");
	}
	public void login() {
		System.out.println("Aurhenticate,enter you name");
		String a=b.nextLine();
		
		System.out.println("Enter you id");
		
		int c=b.nextInt();

		for(int i=0;i<username.size();i++) {
		
		if(a.equals(username.get(i))&&c==(userId.get(i))) {
			System.out.println("success");
			
		}else {
			System.out.println("inexistence");
		}
		}
	}
	void addGamecollection() {
		Gamelist.add("call of the wild");
		Gamelist.add("giant");
		Gamelist.add("super super");
		System.out.println(Gamelist);
		System.out.println("Enter you option such as(1)");
		
		int option=b.nextInt();
		if(option==1) {
			Gamecollection.add(Gamelist.get(0));	
		}else if(option==2) {
			Gamecollection.add(Gamelist.get(1));
		}else if(option==3) {
			Gamecollection.add(Gamelist.get(2));
		}
		}
	
	void viewGamecollection() {
		if(Gamecollection.size()>0) {
			System.out.println(Gamecollection);
			
		}else {
			System.out.println("You Gamecollection is empty");
		}
	}
}	




	class chongextand extends kevinextand{
		public double interestRate;
		
		chongextand(String comment, int rating){
			 super(comment, rating);
			 this.comment=comment;
			 this.rating=rating;
			 }
		
		public void addGame(String addgame) {
			gaming.add(addgame);
			}
		
		public void addInfo(String infomation) {
			gameInfo.add(infomation);
			}
		public void removeGame(String removeGame) {
			
			int count=0;
			for(int i=0;i<gaming.size()-1;i++) {
				if(gaming.get(i).equals(removeGame)) {
					gaming.remove(i);
					gameInfo.remove(i);
					System.out.println("game successfully remove");
					return;
				}else {
					count++;
				}
				
				if(count==gaming.size()) {
					System.out.println("game is not in the store");
				}
			}
		}
		
		public void viewalluser(String viewalluser) {
			System.out.println(username);
		}
	    
		public void deletereview(int deletereview) {
			System.out.println(review);
			System.out.println(rate);
			System.out.println("please enter the number of comment which you want to remove");
			review.remove(deletereview);
			rate.remove(deletereview);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p=new Scanner(System.in);
		chongextand obj=new chongextand("example",1);
		
	   	while(true) {
			System.out.println("");
			System.out.println("");
			System.out.println("***menu***");
			System.out.println("press 1 to regist");
            System.out.println("press 2 to login");
			System.out.println("press 3 to addGame to collection");
			System.out.println("press 4 to add the game");
			System.out.println("press 5 to remove the game");
			System.out.println("press 6 to view registers");
			System.out.println("press 4 to delete reviews");
			System.out.println("press 7 to exit");
			
			int menu=p.nextInt();
			if(menu==1) {
				obj.registerUser();
			}else if(menu==2) {
				
				obj.login();
			}else if(menu==3) {
					
				 obj.addGamecollection();
			}else if(menu==4) {
						
				obj.viewGamecollection();
			}else if(menu==5) {
				break;

	
			}

}
	}
	
	}	
	