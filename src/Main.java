import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ## Задание 1
//
//Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
// Код должен работать с любой последовательностью и объемом списка чисел.
//В качестве отладочной информации можете использовать список чисел

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}