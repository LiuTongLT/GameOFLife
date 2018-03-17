
/**
 * Enumeration class State - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum State
{
    ALIVE(0), DEAD(1);
    public final int value;

    private State(int value)
    {
        this.value = value;
    }
}
