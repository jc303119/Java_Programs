package oppbasics;

public class GameUtils {
	public static void delay(long start){
		long startTime = System.currentTimeMillis();
		while(start<=10000000){
			start++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime +  " ms");
	}

	public static void main(String[] args) {
		delay(1);

	}

}
