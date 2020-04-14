
public class DuoApp {

	public static void main(String[] args) {
		
		Duo<String> sd = new Duo("Hello" , "World");
		Duo<Integer> id = new Duo(7 , 5);
		Duo<Number> dn = new Duo<>(8 , 2);
		
		String s1 = sd.getFirst();
		String s2 = sd.getSecond();
		
		Integer i1 = id.getFirst();
		Integer i2 = id.getSecond();
		
		System.out.println(s1 + " " + s2);
		System.out.println(i1 + i2);
		System.out.println(s1 + " " + i1);
		
		DuoUtility.printSum(dn);
		DuoUtility.printSumEx(dn);

	}

}