package Ex10_classLesoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class AirPortTest {
	// func1
	static void sortTransport(Comparable[] transport) {
		// sorting ...
		Arrays.sort(transport);
	}

	// func1.2
	static void sortTransport1(ArrayList transport) {
		Collections.sort(transport);

		// func2
	}

	static String reportAll(Movable[] transport) {
		String str = "";
		for (Movable movable : transport) {
			str += movable.details();
			str += "\n";
		}
		return str;
	}

	public static void main(String[] args) {

		Train train1 = new Train(1, "", "", 500);
		Train train2 = new Train(2, "", "", 6800);
		Train train3 = new Train(3, "", "", 1000);

		ArrayList<Train> tr = new ArrayList<Train>();
		tr.add(train1);
		tr.add(train2);
		tr.add(train3);
		sortTransport1(tr);
		// System.out.println(tr);

		// trying to sort by id:in anonymis comperator..:
		Collections.sort(tr, new Comparator<Train>() {
			public int compare(Train tr1, Train tr2) {
				Integer int1 = tr1.getId();
				Integer int2 = tr2.getId();
				return tr1.compareTo(tr2);
			}
		});

		Train max1 = Collections.max(tr);
		System.out.println(max1);
		// using max collection using class ...
		CompareTrainDestLenght comp3 = new CompareTrainDestLenght();
		Train maxTrein3 = Collections.max(tr, comp3);
		System.out.println(maxTrein3);

	}

}
