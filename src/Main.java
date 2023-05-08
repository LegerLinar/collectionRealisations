import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ## Задание 1
//
//Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
// Код должен работать с любой последовательностью и объемом списка чисел.
//В качестве отладочной информации можете использовать список чисел

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }


//------------------------------------------- 1-st DONE -------------------------------------------
//Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//
//Код должен работать с любой последовательностью и объемом списка чисел.
//
//В качестве отладочной информации можете использовать список чисел

        List<Integer> nums1 = new ArrayList<>(List.of(8, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<Integer> numsList = new ArrayList<>();
        for (Integer integer : nums1) {
            if (integer % 2 == 0) {
                numsList.add(integer);
            }
        }
        Set<Integer> numSet = new HashSet<>(Set.copyOf(numsList));
        System.out.println(numSet);
//------------------------------------------- 2-d DONE -------------------------------------------
//Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//
//В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//
//Код должен работать с любой последовательностью и объемом списка слов.
        List<String> stringsList = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));

        Set<String> stringSet = new HashSet<>(Set.copyOf(stringsList));
        System.out.println(stringSet);
//------------------------------------------- 3-d DONE -------------------------------------------


//        Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
//
//В качестве отладочной информации используйте:

        List<String> strings = new ArrayList<>(List.of("один", "один", "два",
                "два", "два", "три", "три",
                "три", "два", "два", "два",
                "дубль", "дубль"));

        Set<String> stringSet1 = new HashSet<>(Set.copyOf(strings));

        Map<String, Integer> stringMatchesMap = new HashMap<>();


        for (String stringKey : stringSet1) {
            Integer counter = 0;
            for (String stringMatch : strings) {
                if (stringKey.equals(stringMatch)) {
                    counter++;
                }
            }
            stringMatchesMap.put(stringKey, counter);
        }

        for ( Integer matches : stringMatchesMap.values() ) {
            System.out.println(matches);
        }
//------------------------------------------- 3-d DONE -------------------------------------------


    }


}