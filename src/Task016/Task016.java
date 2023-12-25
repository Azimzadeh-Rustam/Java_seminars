package Task016;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/
public class Task016 {
    public static void main(String[] args) {
        int min = 0;
        int max = 24;
        int len = 1000;
        Integer [] arr = getArr(min, max, len);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPer(arr));
    }
    static Integer[] getArr(int min, int max, int len){
        Integer[] res = new Integer[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            res[i] = random.nextInt(min, max+1);
        }
        return res;
    }
    static double uniqPer(Integer[] arr){
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        return hashSet.size()*100.00/arr.length;
    }

}