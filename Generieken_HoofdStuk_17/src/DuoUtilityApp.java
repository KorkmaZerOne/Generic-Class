
public class DuoUtilityApp {

	public static void main(String[] args) {
		
		Duo<Integer> id = new Duo<>(7 , 5);
		Duo<Long> 	 ld = new Duo<>(746987L , 546358L);
		Duo<Number>  fd = new Duo<>(5.7F , 8.9F);
		Duo<Number>  nd = new Duo<>(4 , 8.56D);
		
		DuoUtility.printSum(id, ld);
		DuoUtility.printSum(ld, fd);
		DuoUtility.printSum(fd, nd);
		DuoUtility.printSum(nd, id);
		
		DuoUtility.printSumSame(nd, fd);
		
		DuoUtility.swapFirst(fd, nd);
		DuoUtility.printSum(nd, fd);
		DuoUtility.printSum(fd, nd);
		
		Duo<String> d1 = new Duo<>("Hello" , "World");
		Duo<String> d2 = new Duo<>("Goodbye" , "Mars");
		
		DuoUtility.printDuo(d1);
		DuoUtility.printDuo(d2);
		
		DuoUtility.swapFirst(d1, d2);
		DuoUtility.printDuo(d1);
		DuoUtility.printDuo(d2);
	}

}
