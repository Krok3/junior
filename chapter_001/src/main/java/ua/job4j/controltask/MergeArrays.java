package ua.job4j.controltask;

/**
 * Class MergeArrays
 *
 * Дополнительное задание:
 * Есть два одномерных массива, отсортированных по возрастанию.
 * Создать класс с методом, позволяющим скопировать оба массива в третий.
 * Элементы третьего массива должны быть также отсортированы по возрастанию.
 * @author vfrundin
 * @since 26.11.2017
 * @version 1.0
 */
public class MergeArrays {
    /**
     * Метод выполняет копирование двух отсортированных целочисленных массивов в третий,
     * и сортирует его элементы по возростанию.
     *
     * @param  firstArray Первый отсортированный целочисленный массив.
     * @param  secondArray Второй отсортированный целочисленный массив.
     * @return joinedArray - результат объединения первого и второго массива, так же отсортированнй по возростанию.
     */
    public int[] merge(int[] firstArray, int[] secondArray) {
        int lengthFirst = firstArray.length;
        int lengthSecond = secondArray.length;
        int lengthResult = lengthFirst + lengthSecond;
        int[] joinedArray = new int[lengthResult];

        for (int res = 0, fst = 0, snd = 0, fstFin = 0, sndFin = 0; res < lengthResult; res++) {
            if ((firstArray[fst] <= secondArray[snd] && fstFin == 0) || sndFin == 1) {
                joinedArray[res] = firstArray[fst];
                if (fst + 1 < lengthFirst) {
                    fst++;
                } else {
                    fstFin = 1;
                }
            } else if (sndFin == 0) {
                joinedArray[res] = secondArray[snd];
                if (snd + 1 < lengthSecond) {
                    snd++;
                } else {
                    sndFin = 1;
                }
            }
        }
        return joinedArray;
    }
}
