package by.itstep.javatraining.revision.task;

/*	Task 01. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход даётся четыре целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите количество совпадающих чисел или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static int task01(int a, int b, int c, int d) {
        int count = 0;
//        System.out.println("435678");

        if (a == b || a == c || a == d || c == d || b == c || b == d) {
            count = 2;
        }

        if ((a == b && a == c) || (a == c && a == d) || (a == b && a == d) || (b == c && b == d)) {
            count = 3;
        }
        if (a == b && a == c && a == d) {
            count = 4;
        }

        return count;
    }
}