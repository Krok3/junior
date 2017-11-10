package ua.job4j.loop;

/**
 * Class Класс для построения шахматной доски произвольного размера.
 * @author vfrundin
 * @since 08.11.2017
 * @version 1.0
 */
public class Board {
    /**
     * Метод формирует строку result для отрисовки в псевдографике шахматной с количеством клеток,
     * заданным параметрами width и height.
     * @param width Ширина шахматной доски.
     * @param height Высота шахматной доски.
     * @return result - результирующая строка в виде шахматной доски.
     */
    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        final String line = System.getProperty("line.separator");
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (j % 2 == 0) {
                    if (i % 2 == 0) {
                        builder.append("x");
                    } else {
                        builder.append(" ");
                    }
                } else if (i % 2 == 0) {
                    builder.append(" ");
                } else {
                    builder.append("x");
                }
            }
            builder.append(line);
        }
        String result = builder.toString();
        return result;
    }
}
