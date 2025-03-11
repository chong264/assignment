package f;
import java.util.ArrayList;
import java.util.Scanner;
public class User {
	 ArrayList<String>username=new ArrayList<>();
	 ArrayList<Integer>userId=new ArrayList<>();
	 ArrayList<String>Gamelist=new ArrayList<>();
	 ArrayList<String>Gamecollection=new ArrayList<>();
	
	Scanner b =new Scanner(System.in);
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p=new Scanner(System.in);
		User obj=new User();
		
	   	while(true) {
			System.out.println("");
			System.out.println("");
			System.out.println("***menu***");
			System.out.println("press 1 to regist");
			System.out.println("press 2 to login");
			System.out.println("press 3 to addGame to collection");
			System.out.println("press 4 to view the game");
			System.out.println("press 5 to exit");
			
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
