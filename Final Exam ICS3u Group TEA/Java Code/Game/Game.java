package program;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	String inputgame;
	ArrayList<String>gaming=new ArrayList<>();
	ArrayList<String>cart=new ArrayList<>();
	ArrayList<String>gameInfo=new ArrayList<>();
	
	public Game(String inputgame) {
		this.inputgame=inputgame;
	}
	
	public void addGame(String addgame) {
		gaming.add(addgame);
		}
	
	public void addInfo(String infomation) {
		gameInfo.add(infomation);
		}
	
	public void searchGame(String nameofgame) {

		int count=0;
		for(int i=0;i<gaming.size();i++) {
			
			if(gaming.get(i).equals(nameofgame)) {
				System.out.println(gaming.get(i)+" is in the store, "+gameInfo.get(i));
				return;
			}else {
				count++;
			}
		}
		
		if(count==gaming.size()) {
			System.out.println("Game does not exist");
		}
	}
	
	public void displayGame() {
		System.out.println(gaming);
		System.out.println(gameInfo);
	}

	public void buyGame(String usersgame) {
		int count=0;
		for(int i=0;i<cart.size();i++) {
			
			if(cart.get(i).equals(usersgame)) {
				System.out.println("You have this game");
			}else {
				count++;
			}
		}
		
		if(count==cart.size()) {
			System.out.println("you don't have this game ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game object=new Game("exmple");
		Scanner sc= new Scanner(System.in);
		
		object.addGame("cyberpunker 2077");
		object.addInfo("An open-world RPG set in a cyberpunk city--39.99.");
		object.addGame("elden ring");
		object.addInfo("An open-world RPG set in a cyberpunk city--$59.99.");
		object.addGame("unpacking");
		object.addInfo("A relaxing puzzle game about unpacking boxes--$6.");
		object.addGame("Baldur's Gate 3");
		object.addInfo("A role-playing game set in the Dungeons & Dragons universe, offering deep character customization and branching storylines.--$59.99");
		object.addGame("Black Myth: Wukong");
		object.addInfo("An action-adventure game inspired by the Chinese classic 'Journey to the West,' featuring intense combat and stunning visuals.--$49.99");
		while(true) {
			System.out.println("");
			System.out.println("");
			System.out.println("***menu***");
			System.out.println("press 1 to show all the available game");
			System.out.println("press 2 to search a game");
			System.out.println("press 3 to check whether a game in your cart");
			System.out.println("press 4 to add a game to store");
			System.out.println("press 5 to exit");
			
			int menu=sc.nextInt();
			sc.nextLine();
			
			if(menu==1) {
				object.displayGame();
			}else if(menu==2) {
				System.out.println("please enter the name of the game");
				String userSG=sc.nextLine();
				object.searchGame(userSG);
			}else if(menu==3) {
				System.out.println("please enter the name of the game");
				String userCG=sc.nextLine();
				object.buyGame(userCG);
			}else if(menu==4) {
				System.out.println("please enter the name of the game ");
				String userAG=sc.nextLine();
				object.addGame(userAG);
				System.out.println("please enter the infomation of the game");
				String userIF=sc.nextLine();
				object.addInfo(userIF);
				
			}else if(menu==5) {
				System.out.println("exiting.....");
				break;
			}
		}
		sc.close();
	}

}
