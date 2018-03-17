
/**
 * Maintain the environment for a 2D Game of Life.
 * 
 * @author David J. Barnes
 * @version  2016.02.29
 */
public class Environment
{
    // add here your own attributes
    private Cell [][] cells;
    // Visualization of the environment.
    private final EnvironmentView view;

    /**
     * Create an environment with the given size.
     * @param numRows The number of rows.
     * @param numCols The number of cols;
     */
    public Environment(int numRows, int numCols)
    {
        view = new EnvironmentView(this, numRows, numCols);
        view.showCells();
    }

    /**
     * Run the automaton for one step.
     */
    public void step()
    {
    }


    /**
     * Reset the state of the automaton to all DEAD.
     */
    public void reset()
    {
    }

    /**
     * Return the grid of cells.
     * @return The grid of cells.
     */
    public Cell[][] getCells()
    {
        return cells;
    }

}
