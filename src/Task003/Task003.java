package Task003;

import java.util.Arrays;

/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
*/
public class Task003 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 3};
        int val = 3;
        System.out.println(Arrays.toString(sort(arr, val)));
    }

    static int[] sort(int[] arr, int num) {
        int arr_length = arr.length;
        int[] sort_arr = new int[arr_length];
        int count_val = arr_length - 1;
        int count_num = 0;
        for (int i = 0; i < arr_length; i++) {
            if (arr[i] == num) {
                sort_arr[count_val] = num;
                count_val--;
            } else {
                sort_arr[count_num] = arr[i];
                count_num++;
            }
        }
        return sort_arr;
    }
}
