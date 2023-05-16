package phaseOneThirdProgram;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nSum of the arry is : " + sum);
	}

}
