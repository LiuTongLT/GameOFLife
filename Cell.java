import java.util.*;

/**
 * A cell in a 2D cellular automaton.
 * The cell has multiple possible states.
 * This is an implementation of the rules for Brian's Brain.
 * @see https://en.wikipedia.org/wiki/Brian%27s_Brain
 * 
 * @author David J. Barnes and Michael Kölling
 * @version  2016.02.29
 */
public class Cell
{
    
    private State myState;
    
    public Cell(State start)
    {
        myState = start;
    }
    
    public State getState()
    {
        return myState;
    }
    
    public void setState(State newState)
    {
        myState = newState;
    }
}
