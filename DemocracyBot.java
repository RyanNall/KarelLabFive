
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
        checkIfBallotHasBeepers();
        cleanBallot();
    }
    }
    public void moveToNextBallot();
}

