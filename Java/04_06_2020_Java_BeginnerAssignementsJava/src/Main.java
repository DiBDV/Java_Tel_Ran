public class Main {

    public static void main(String[] args) {

//        Параметр weekday имеет значение true если это рабочий день недели, и параметр
//        vacation имеет значение true если у нас каникулы. Мы спим, если это не рабочий день
//        или у нас каникулы. Вернуть значение true, когда мы спим.
        public boolean sleepIn(boolean weekday, boolean vacation) {

        }


//        Дано целое число n , вернуть абсолютную разницу между n и 21, но вернуть
//        удвоенную разницу, если n больше 21.
        public int diff21(int n) {
            if n > 21{
                return int n*2;
            }else{
                return 21 - n;
            }
        }


//        Дана строка , вернуть новую строку, где последние 3 символа в верхнем регистре
//        (заглавные). Если строка длины меньше 3, перевести это в заглавные.
        public String endUp(String str) {


        }


//        Даны три целых числы a b c, вернуть наибольшее.
//                intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3
        public int intMax(int a, int b, int c) {


        }



//        Даны два массива целых чисел. Вернуть true если у них одинаковый первый или
//        последний элемент. Оба массива длины 1 или более.
//        commonEnd([1, 2, 3], [7, 3]) → true
//        commonEnd([1, 2, 3], [7, 3, 2]) → false
//        commonEnd([1, 2, 3], [1, 3]) → true
        public boolean commonEnd(int[] a, int[] b) {


        }




//        Дан массив целых чисел. Вернуть сумму двух первых элементов массива. Если
//        длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина
//        массива равна нулю.
        public int sum2(int[] nums) {



        }




//        Вернуть количество четных чисел в массиве целых чисел. Напомню, что оператор
//                % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
        public int countEvens(int[] nums) {


        }


//        Вернуть версию входного массива , где каждыое нулевое значение заменено
//        максимальным нечетным значением, справа от нуля. Если нечетных числе справа от
//        нуля нет, то оставляем ноль.
        public int[] zeroMax(int[] nums) {
        }



//        Вернуть массив, смещенный влево на один индекс. То ест для {6, 2, 5, 3}
//        вернуть {2, 5, 3, 6}. Можно вернуть измененный данный массив, а можно вернуть новый.
//        shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//        shiftLeft([1, 2]) → [2, 1]
//        shiftLeft([1]) → [1]
        public int[] shiftLeft(int[] nums) {
        }

//        Даны две строки, вернуть их конкатенацию, но без первого символа в каждой. Строки
//        ненулевой длины.
        public String nonStart(String a, String b) {

        }

//        Дана строка четной длины. Вернуть строку из двух центральных символов, например
//        строка "string" превратиться в "ri". Длина входной строки минимум 2.
        public String middleTwo(String str) {

        }
    }
}