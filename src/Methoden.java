import java.util.*;

public class Methoden {
	
	private Methoden() {
		
	}

	public static double doubleValue(Object o) {
		return ((Double) o).doubleValue();	
	}
	
	public static double quadSum(Collection c) {
		Iterator<Collection> it = c.iterator();
		double quadsum = 0.0;
		
		while(it.hasNext()) {
			quadsum += Math.pow(doubleValue(it), 2);
		}
		
		
		return quadsum;
	}
}
