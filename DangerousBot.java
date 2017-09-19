
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public boolean even;
    public int beepers;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        countBeepers();
        chooseDirection();
        moveIntoChoosenRoom();
        pickUpPileOfBeepers();
    }
    public void countBeepers(){
        while(nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
     
    }
    public void chooseDirection(){
        if (beepers % 2 == 0){
            turnRight();
        }
        else{
            turnLeft();
        }
    }
    public void moveIntoChoosenRoom(){
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickUpPileOfBeepers(){
        while (nextToABeeper()){
            pickBeeper();
        }
    }
    

        
        
}

