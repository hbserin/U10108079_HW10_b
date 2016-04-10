/**Name:Erin
 *Id:U10108079
 *Exercise:HW10_bubble sort
 */

//main method
public class bubbleSort {
	public static void main(String[] args) {

		int[] list ={10, 5, 8, 1, 4, 6, 14, 9, 12, 11};

		for (int k =1; k < list.length ; k++) {
			for (int i = 0; i <list.length - k; i++){
				if (list[i] > list[i + 1]) {
					//Swap list[i] with list[list =1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");

	}

}
