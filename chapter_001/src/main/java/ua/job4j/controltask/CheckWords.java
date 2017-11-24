package ua.job4j.controltask;

/**
 * Class Класс проверяет, что одно слово содержится в другом слове.
 *
 * @author vfrundin
 * @version 1.0
 * @since 25.11.2017
 */
public class CheckWords {
    /**
     * Метод определяет факт вхождения одного слова в другое.
     *
     * @param  origin Слово внутри которого идет поиск.
     * @param  sub Искомое слово.
     * @return result - переменная типа boolean, в зависимости от результата поиска принимает значение: истина или ложь.
     */
    public boolean contains(String origin, String sub) {
        char[] lettersArray = (origin.toUpperCase()).toCharArray();
        char[] lettersSubArray = (sub.toUpperCase()).toCharArray();

        int lngthLetArr = lettersArray.length;
        int lngthLetSubArr = lettersSubArray.length;
        boolean result = false;

        if (lngthLetArr >= lngthLetSubArr) {
            for (int out = 0; lngthLetArr - out >= lngthLetSubArr && !result; out++) {
                int countMatches = 0;
                for (int in = 0, subOut = out; in < lngthLetSubArr && subOut < lngthLetArr; in++, subOut++) {
                    if (lettersArray[subOut] == lettersSubArray[in]) {
                        countMatches++;
                    } else {
                        countMatches = 0;
                    }
                }
                if (countMatches == lngthLetSubArr) {
                    result = true;
                }
            }
        }

        return result;
    }
}
