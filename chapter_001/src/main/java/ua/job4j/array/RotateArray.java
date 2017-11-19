package ua.job4j.array;

/**
 * Class Класс выполняет поворот двухмерного массива.
 *
 * @author vfrundin
 * @version 1.0
 * @since 19.11.2017
 */
public class RotateArray {
    /**
     * Метод поворачивает полученный на вход двумерный целочисленный массив по часовой стрелке.
     *
     * @param array Исходный двумерный массив.
     * @return outArray - двумерный массив после поворота.
     */
    public int[][] rotate(int[][] array) {
        int countRows = array.length;
        int countColumns = array[0].length;
        int[][] outArray = new int[countColumns][countRows];
        // i - количество строк в исходном массиве,
        // j - количество столбцов в исходном массиве.
        for (int j = 0; j < countRows; j++) {
            for (int i = 0; i < countColumns; i++) {
                outArray[i][countRows - 1 - j] = array[j][i];
            }
        }
        return outArray;
    }
}
