package src.main.array;

/**
 * 插入排序
 * @author thugwar
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 2, 4, 3, 9, 5, 7, 6, 1, 3 };
		
	
		
		for (int i = 1; i < array.length; i++) {
			
			//临时变量保证i不会重新赋值
			int j=i;
			
			int thisAr=array[i];
			//j此时递增减 意义为遍历上次循环生成已排序好的数组
			while (j>0&&thisAr<array[j-1]) {
				//从右边开始对比
				array[j]=array[j-1];
				j--;
			}
			//循环结束把小的放到前面
			array[j]=thisAr;
		}
		
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}

}
