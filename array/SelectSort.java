package src.main.array;

/**
 * 选择排序
 * @author thugwar
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 2, 8, 9, 5, 7, 6, 1, 3 };
		
		for (int i = 0; i < array.length; i++) {
			
			int min=i;
			
			for (int j = i+1; j < array.length; j++) {
				
				if(array[j]<array[min]){
					min=j;
				}
			}
			int a=array[i];
			array[i]=array[min];
			array[min]=a;
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}

}
