package Ex10_classLesoon;

import java.util.Comparator;

public class CompareTrainDestLenght implements Comparator<Train>{

	@Override
	public int compare(Train o1, Train o2) {
		Integer int1=o1.getDestination().length();
		Integer int2=o2.getDestination().length();
		return int1.compareTo(int2);
	
	}

	
	
}
