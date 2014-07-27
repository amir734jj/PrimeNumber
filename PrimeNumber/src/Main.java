import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	static int DOMAIN = 10000;

	public static void main(String[] args) {
		PrimeNumber(DOMAIN);
	}

	public static void PrimeNumber(int Domain) {

		ArrayList<Integer> PrimeArray = new ArrayList<Integer>();
		for (int i = 2; i <= Domain; i++)
			PrimeArray.add(i);
		Iterator<Integer> it = PrimeArray.iterator();
		while (it.hasNext())
			if (Divisible(it.next()))
				it.remove();
		PrimeArray.add(2);

		for (Integer p : PrimeArray)
			System.out.println("==> " + p);

		System.out.println(PrimeArray.size());
	}

	public static boolean Divisible(Integer Number) {
		ArrayList<Integer> IntegerArray = new ArrayList<Integer>();
		for (int i = 2; i <= (int) Math.sqrt(Number) + 1; i++)
			IntegerArray.add(i);
		Iterator<Integer> it = IntegerArray.iterator();
		while (it.hasNext())
			if (Number.intValue() % it.next().intValue() == 0)
				return true;
		return false;

	}
}
