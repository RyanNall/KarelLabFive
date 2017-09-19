
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for (int x = 5; x > 0; x --){
        moveToNextDirtyBallot();
        cleanBallot();
    }
    }
    public void moveToNextDirtyBallot(){
        while (!nextToABeeper()){
            move();
        }
    }
    public void cleanBallot(){
        pickBeeper();
        cleanBallotRight();
        cleanBallotLeft();
    }
    public void cleanBallotRight(){
        turnRight();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        turnRight();
    }
    public void cleanBallotLeft(){
        turnLeft();
        move();
        pickBeeper();
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
}

