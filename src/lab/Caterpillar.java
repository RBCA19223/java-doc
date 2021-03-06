package lab;

/**
 * This is a short description of class<br>
 * This is a program to implement a caterpillar class<br>
 * This is the class that implements the following methods: <br>
 * 1.Constructor with parameter<br>
 * 2.Constructor with no parameter<br>
 * 3.Setter for name<br>
 * 4.Getter for name<br>
 * 5.Setter for moves<br>
 * 6.Getter for moves<br>
 * 7.Setter for cabbages eaten<br>
 * 8.Getter for cabbages eaten<br>
 * 9.Display methods for name,moves and cabbages eaten
 * 
 * @author subash
 * @version 15.0.2
 *
 */

public class Caterpillar {
	String name;
	int moves;
	int cabbages_eaten;
	
	/**
	 * This is a parameterized constructor to initialize the attributes
	 * @param name The name of the caterpillar
	 * @param moves The number of moves by caterpillar
	 * @param cabbages_eaten The cabbages_eaten by the caterpillar
	 */
	public Caterpillar(String name,int moves,int cabbages_eaten)
	{
		this.name=name;
		this.moves=moves;
		this.cabbages_eaten=cabbages_eaten;
	}

	/**
	 * This is a constructor to initialize the attributes<br>
	 * The name is set to a default value of xxxx<br>
	 * The moves is set to default as 0<br>
	 * The  default cabbages eaten is 0
	 * 
	 */
	public Caterpillar()
	{
		name="xxxx";
		moves=0;
		cabbages_eaten=0;
	}
	/**
	 * This is the setter for the caterpillar name
	 * @param name Name of the caterpillar
	 */

	public void setName(String name) 
	{
		this.name = name;
	}
    /**
     * This is the getter for the caterpillar name
     * @return name
     */
	public String getName() 
	{
		return name;
	}
    /**
     * This is the setter for caterpillar moves
     * @param moves Moves by the caterpillar
     */
	public void setMoves(int moves) {
		this.moves = moves;
	}
	
	/**
	 * This is the getter for caterpillar moves
	 * @return moves
	 */
	public int getMoves() {
		return moves;
	}
    /**
     * This is the setter for cabbages eaten by caterpillar
     * @param cabbages_eaten Cabbages eaten by caterpillar
     */
	public void setCabbages_eaten(int cabbages_eaten) {
		this.cabbages_eaten = cabbages_eaten;
	}
	/**
	 * This is the getter for cabbages eaten by caterpillar
	 * @return cabbages_eaten
	 */
	public int getCabbages_eaten() {
		return cabbages_eaten;
	}


	/**
	 * This is a method to display the name,moves and cabbages eaten by the caterpillar
	 * @see getName()
	 * @see getMoves()
	 * @see getCabbages_eaten()
	 */
    public void display()
    {
    	System.out.println("students name"+getName());
    	System.out.println("students roll num"+getMoves());
    	System.out.println("students age" +getCabbages_eaten());
    }
    /**
     * This is the entry point of the execution of the program
     * @param args not used
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
