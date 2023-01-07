import java.util.Random;
//ДЗ:
//● Создать массив дробных (не целых) чисел размером 15 элементов и наполнить
//его положительными и отрицательными числами;
//● Затем через цикл “for each” посчитать среднее арифметическое положительных
//чисел расположенных после первого отрицательного числа и вывести его на экран
//(8, -2, -4, 2, 3, 6) = 11/3
public class Main {
    public static void main(String[] args) {
        double floats[] = {1.3, 4.5,-5.6, -14.2, -1.1, 7.8,- 1.9, -11.2, 8.5, -1.3, 12.4, 12.5,- 12.4, 17.8, -8.9};
        double sum = 0.0;
        int divisor = 0;

        for (double b : floats) {

            for (int c = 0; true; c++) {
                if (floats[c] < 0) {
                    for (int c1 = (int) (c + 1); c1 < floats.length; c1++) {
                        if (floats[c1] > 0) {

                            sum += floats[c1];
                            divisor++;

                        }


                    }
                    break;

                }
            }

         break;

        }
        System.out.println(sum + "/" + divisor);
    }

        }

