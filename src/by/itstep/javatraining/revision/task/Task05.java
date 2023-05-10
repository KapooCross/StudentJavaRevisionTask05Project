package by.itstep.javatraining.revision.task;

/*	Task 05. The Average Number [среднее число]
 *
 *	Даны три различных числа. Определите среднее по величине число.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": все три числа должны быть различными.
 *
 *	Формат входных данных [input]
 *	На вход даётся три различных целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено среднее по величине число или ноль, если среди чисел есть одинаковые.
 *
 *	[ input 1]: 1 2 3
 *	[output 1]: 2
 *
 *	[ input 2]: 17 23 11
 *	[output 2]: 11
 *
 *	[ input 3]: 7 7 7
 *	[output 3]: 0
 *
 *	[ input 4]: 5 7 7
 *	[output 4]: 0
 */

public class Task05 {
    public static int task05(int a, int b, int c) {
        int rez = 0;

//        if (a == c && b == c) {
//            rez = 0;
//        }

        if ((a > b && a < c) || a < b && a > c) {
            rez = a;
        }
        if ((b < a && b > c) || (b > a && b < c)) {
            rez = b;
        }
        if ((c > a && c < b) || (c < a && c > b)) {
            rez = c;
        }

        return rez;
    }
}