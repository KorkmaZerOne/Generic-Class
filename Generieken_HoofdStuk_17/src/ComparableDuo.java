
public class ComparableDuo <E extends Number & Comparable<E>> extends Duo<E>{

	public ComparableDuo(E first, E second) {
		super(first, second);
	}
	public E getHighest() {
		return (getFirst().compareTo(getSecond()) <0) ? getSecond() : getFirst();
	}
	public E getLowest() {
		return (getFirst().compareTo(getSecond()) >0) ? getSecond() : getFirst();
	}
	public double getSum() {
		return getFirst().doubleValue() + getSecond().doubleValue();
	}
	
	public static void main(String [] args) {
		
		ComparableDuo<Integer> cd1 = new ComparableDuo<>(5 , 8);
		ComparableDuo<Double> cd2 = new ComparableDuo<> (3.2 , 4.5);
		
		System.out.println(cd1.getHighest());
		System.out.println(cd2.getLowest());
		
	}
	
}
