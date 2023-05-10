package by.itstep.javatraining.revision.task;

/*	Task 08. Next Date [дата следующего дня]
 *
 *  Заданы три целых числа d, m и y, которые задают некоторую дату по Грегорианскому календарю.
 *  Определите дату следующего дня.
 *
 *	Примечание
 *	1) Постарайтесь не использовать стандартную библиотеку работы со временем
 *  (задание закрепляет знания по использованию именно условных конструкций).
 *  2) Не забудьте про "защиту от дурака": все данные должны быть корректными.
 *  3) Отсчёт года идёт с нуля (наша эра), т.е. не должно быть отрицательного года.
 *
 *	Формат входных данных [input]
 *	На вход даются три целых числа в диапазоне int.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена строка с соответствующей датой следующего дня в формате "DD.MM.YYYY"
 *  или "Error.", если данные введены некорректно.
 *
 *	[ input 1]: 3 5 2023
 *	[output 1]: 04.05.2023
 *
 *	[ input 2]: 28 2 2023
 *	[output 2]: 01.03.2023
 *
 *	[ input 3]: 28 2 2020
 *	[output 3]: 29.02.2020
 *
 *	[ input 4]: 30 2 2020
 *	[output 4]: Error.
 *
 *	[ input 5]: 1 13 2020
 *	[output 5]: Error.
 *
 *	[ input 6]: 1 1 -1
 *	[output 6]: Error.
 *
 *	[ input 7]: 1 1 1
 *	[output 7]: 02.01.0001
 */

public class Task08 {
    public static String task08(int day, int month, int year) {
        boolean visokos = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (day < 1 || month < 1 || month > 12 || year < 0 || (month == 2 ?
                visokos ? day > 29 : day > 28 :
                (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ?
                        day > 31 : day > 30)) {
            return "Error.";
        }


        day += 1;
        switch (month) {
            case 12:
                if (day > 31) {
                    year += 1;
                    day = 1;
                    month = 1;
                }
            case 1, 3, 5, 7, 8, 10:
                if (day > 31) {
                    day = 1;
                    month += 1;
                }
                break;
            case 4, 6, 9, 11:
                if (day > 30) {
                    day = 1;
                    month += 1;
                }
                break;
            case 2:
                if (visokos) {
                    if (day > 29) {
                        day = 1;
                        month += 1;
                    }
                } else {
                    if (day > 28) {
                        day = 1;
                        month += 1;
                    }
                }
                break;
        }

        return String.format("%s.%s.%s", day < 10 ? 0 + "" + day : day,
                month < 10 ? 0 + "" + month : month,
                year < 10 ? "000" + year : year < 100 ? "00" + year : year < 1000 ? "0" + year : year);
    }
}