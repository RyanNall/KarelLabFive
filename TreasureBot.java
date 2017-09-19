
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beeperCount;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (beeperCount != 5){
        countBeepers();
        faceCorrectDirection();
        checkIfAtTreasureCorner();
        moveToABeeper();
        beeperCount = 0;
    }
    }
    public void countBeepers(){
        while (nextToABeeper()){
            pickBeeper();
            beeperCount ++;
        }
    }
    public void faceCorrectDirection(){
        if (beeperCount == 1){
            faceNorth();
        }
        if (beeperCount == 2){
            faceEast();
        }
        if (beeperCount == 3){
            faceSouth();
        }
        if (beeperCount == 4){
            faceWest();
        }
    }
    public void moveToABeeper(){
        while (!nextToABeeper()){
                move();
            }
    }
    public void faceWest(){
    while (!facingWest()){
        turnLeft();
    }
    }
    public void faceEast(){
    while (!facingEast()){
        turnLeft();
    }
    }
    public void faceNorth(){
    while (!facingNorth()){
        turnLeft();
    }
    }
    public void faceSouth(){
    while (!facingSouth()){
        turnLeft();
    }
    }
    public void checkIfAtTreasureCorner(){
        if (beeperCount == 5){
            turnOff();
        }
    }
}

