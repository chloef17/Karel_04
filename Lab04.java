/**
*
* Description of the program goes here  // provide a brief description
*
* @author ChloeFink
* @version 5.11.14
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

public static void takeTheField(Athlete arg)  {
	arg.move();
   arg.move();
   arg.move();
   arg.move();
   arg.turnRight();
   arg.move();
   arg.move();  
   }

  public static void main(String[] args) {
     
     Display.openWorld("maps/arena.map");
     Display.setSize(10,10);
     Display.setSpeed (5);
     
          Athlete chloe = new Athlete();
          Athlete riley = new Athlete();
          Athlete anton = new Athlete();
          Athlete nicki = new Athlete();
          Athlete sophie = new Athlete();
          Athlete brigitte = new Athlete();
          Athlete jackyboy = new Athlete();
          
          takeTheField(chloe);
          chloe.move();
          chloe.move();
          chloe.move();
          chloe.turnLeft();
          chloe.move();
          chloe.move();
          chloe.turnAround();
          
          takeTheField(riley);
          riley.move();
          riley.move();
          riley.move();
          riley.move();
          riley.move();
          riley.turnLeft();
          riley.move();
          riley.turnAround();
          
          takeTheField(anton);
          anton.move();
          anton.turnLeft();
          anton.move();
          anton.turnAround();
          
          takeTheField(nicki);
          nicki.move();
          nicki.move();
          nicki.move();
          nicki.move();
          nicki.turnRight();
          
          takeTheField(sophie);
          sophie.move();
          sophie.move();
          sophie.move();
          sophie.turnRight();
          
          takeTheField(brigitte);
          brigitte.move();
          brigitte.move();
          brigitte.turnRight();
          
          jackyboy.move();
          jackyboy.move();
          jackyboy.move();
          jackyboy.move();
          jackyboy.move();
          jackyboy.move();
          jackyboy.turnRight();
          jackyboy.move();
     
     }
}
