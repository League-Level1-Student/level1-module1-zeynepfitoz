

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar c = new RaceCar("Tesla", 2);
		// 2. Print the RaceCar's position in the race
System.out.println(c.getPositionInRace());
		// 3. Crash the RaceCar
		c.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
	
c.pit();
		// 5. Help the car move into first place.
c.overtake();
c.overtake();
c.overtake();
c.overtake();
	}
}
