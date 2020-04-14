
public class DuoUtilityApp {

	public static void main(String[] args) {
		
		Duo<Integer> id = new Duo<>(7 , 5);
		Duo<Long> 	 ld = new Duo<>(746987L , 546358L);
		Duo<Float> 	 fd = new Duo<>(5.7F , 8.9F);
		Duo<Number>  nd = new Duo<>(4 , 8.56D);
		
		DuoUtility.printSum(id);
		DuoUtility.printSum(ld);
		DuoUtility.printSum(fd);
		DuoUtility.printSum(nd);
		
		
	}

}
