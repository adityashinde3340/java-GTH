/*
Q14.Create Player class:
playerId
playerName
runs
Store players in Vector and display players who scored even runs.
Description
Logical condition:
runs % 2 == 0
Input
1 Virat 75
2 Rohit 80
3 Gill 66
4 KL 59
Output
Players with even runs:

2 Rohit 80
3 Gill 66

*/

import java.util.*;
class Player{
  private int playerId;
  private String playerName;
  private int runs;
  
  public Player(int playerId , String playerName , int runs){
    this.playerId = playerId;
    this.playerName = playerName;
    this.runs = runs;
   } 
  public int getId(){
    return playerId;
  }
  public String getName(){
    return playerName;
  }
  public int getRun(){
    return runs;
  }
}
public class Q14{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   Vector<Object> v1 = new Vector<>();
   v1.add(new Player(1 , "Virat", 75));
   v1.add(new Player(2 , "Rohit", 80));
   v1.add(new Player(3 ,"Gill" ,66));
   v1.add(new Player(4 ,"KL" , 59));
   
   
   for(Object o:v1){
      Player e=(Player)o;
      if(e.getRun() % 2==0){
         System.out.println(e.getId()+" "+e.getName()+" "+e.getRun());
      }
   }
   }
}
