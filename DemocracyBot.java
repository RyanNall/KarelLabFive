
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    boolean roomNeedsCleaning;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        move();
        for (int x = 5; x > 0; x --){
        checkIfBallotNeedsCleaning();
        cleanBallotIfNeccesary();
        moveToNextBallot();
    }
    }
    public void moveToNextBallot(){
        move();
        move();
        }
    public void checkIfBallotNeedsCleaning(){
        if (!nextToABeeper()){
            roomNeedsCleaning = true;
        }
        else{
            roomNeedsBeepers();
        }
    }
    public void cleanBallotIfNeccesary(){
        if (roomNeedsCleaning == true){
        cleanBallotRight();
        cleanBallotLeft();
        roomNeedsCleaning = false;
    }
    }
    public void cleanBallotRight(){
        enterBallotRight();
        while (nextToABeeper()){
         pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
    }
    public void cleanBallotLeft(){
        enterBallotLeft();
         while (nextToABeeper()){
         pickBeeper();
        }
        turnRight();
        turnRight();
        move();
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void roomNeedsBeepers(){
        enterBallotRight();
        if (!nextToABeeper()){
            putBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
        enterBallotLeft();
        if (!nextToABeeper()){
            putBeeper();
        }
        turnRight();
        turnRight();
        move();
        turnLeft();
    }
    public void enterBallotLeft(){
        turnLeft();
        move();
    }
    public void enterBallotRight(){
        turnRight();
        move();
    }
}

