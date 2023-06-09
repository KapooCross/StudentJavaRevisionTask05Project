package by.itstep.javatraining.revision.task;

/*	Task 04. Amount of days [количество дней]
 *
 *	Даны порядковый номер месяца и номер года.
 *	Определите количество дней в заданном месяце соответствующего года.
 *
 *	Примечание
 *	1) Постарайтесь реализовать основной алгоритм так, чтобы в нём было не более двух условных конструкций.
 *	2) Не забудьте про "защиту от дурака": если номер месяца некорректен, то нужно возвратить 0.
 *
 *	Формат входных данных [input]
 *	На вход даётся два целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество дней в заданном месяце или ноль (при неверных данных месяца).
 *
 *	[ input 1]: 4 2023
 *	[output 1]: 30
 *
 *	[ input 2]: 5 2023
 *	[output 2]: 31
 *
 *	[ input 3]: 2 1900
 *	[output 3]: 28
 *
 *	[ input 4]: 2 2000
 *	[output 4]: 29
 *
 *	[ input 5]: -7 2023
 *	[output 5]: 0
 *
 *	[ input 6]: 0 2023
 *	[output 6]: 0
 *
 *	[ input 7]: 13 2023
 *	[output 7]: 0
 */

import javax.imageio.stream.ImageOutputStream;

public class Task04 {
    public static int task04(int month, int year) {
        int rez = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                rez = 31;
                break;
            case 4, 6, 9, 11:
                rez = 30;
                break;
            case 2:
//                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )? rez = 29 : rez = 28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    rez = 29;
                } else {
                    rez = 28;
                }
                break;
        }

        return rez;
    }
}