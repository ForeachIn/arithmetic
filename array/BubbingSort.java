package src.main.array;

/**
 * 冒泡排序
 * 
 * @author thugwar
 *
 */
public class BubbingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 4, 2, 8, 9, 5, 7, 6, 1, 3 };
		//不带flag标识
		for (int i = 0; i < array.length; i++) {
			boolean flag=true;
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
					flag=false;
				}
			}
			System.out.println("方法一循环次数:"+i);
			if(flag){
				break;
			}
		}
		int[] array2 = { 4, 2, 8, 9, 5, 7, 6, 1, 3 };
		//带flag标识
		for (int i = 0; i < array2.length; i++) {
			boolean flag=true;
			for (int j = 0; j < array2.length-1; j++) {

				if (array2[j] > array2[j+1]) {
					int a = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = a;
					flag=false;
				}
			}
			System.out.println("方法二循环次数:"+i);
			if(flag){
				break;
			}
		}

//		for (int i : array) {
//			System.out.println(i);
//		}

	}

}
