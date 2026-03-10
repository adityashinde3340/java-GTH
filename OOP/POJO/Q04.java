/*
Q4. Problem:
 Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. 
 Perform the following operations:
 Calculate the average runs per match for each player.
 Find and display the player with the highest batting average.
 Print the details of players whose batting average is above the team average.

 Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.

*/

class Player{
	private int playerId;
	private String name;
	private int runs;
	private int matches;
	
	public Player(int playerId , String name , int runs , int matches){
		this.playerId = playerId;
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	
	public int getPlayerId(){
		return playerId;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRuns(){
		return runs;
	}
	
	public int getMatches(){
		return matches;
	}
	
	
	
}

public class Q04{
	public static void main(String x[]){
		Player[] pl = new Player[5];
        
		pl[0] = new Player(01 , "rohit" , 4500 , 50);
	    pl[1] = new Player(02 , "virat" , 6000 , 50);
		pl[2] = new Player(03 , "tilak" , 3545 , 50);
		pl[3] = new Player(04 , "ishan" , 4125 , 50);
		pl[4] = new Player(05 , "dhoni" , 3645 , 50);
		
		
		System.out.println("average runs per match for each player");
		int avarageRuns = 0;
		for(int i = 0 ; i < pl.length ; i++){
		   avarageRuns = pl[i].getRuns() / pl[i].getMatches();
		   System.out.println("the avarege of "+pl[i].getName()+" are "+avarageRuns);
		}
		System.out.println();
		
		double HighestBattingAvg = 0;
		int index = 0;
		for(int i = 0 ; i < pl.length ; i++){
			index++;
			HighestBattingAvg = pl[0].getRuns() / pl[0].getMatches();
			//return (double)HighestBattingAvg;
			
		}
		System.out.println("Highest batting avarege = "+HighestBattingAvg+" of "+pl[index].getName());
	}
}