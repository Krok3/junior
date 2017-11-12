package ua.job4j.loop;

/**
 * Class Класс для построения пирамиды заданной высоты при помощи псевдографики.
 * @author vfrundin
 * @since 10.11.2017
 * @version 1.0
 */
public class Paint {

    /**
     * Метод формирует строку result для отрисовки в псевдографике пирамиды, высота которой здана параметром h.
     * @param h Высота пирамиды.
     * @return result - результирующая строка в виде пирамиды.
     */
    public String piramid(int h) {
        final String line = System.getProperty("line.separator");
        final int w = (h > 0) ? h * 2 - 1 : 0;
        StringBuilder builder = new StringBuilder();

        for (int j = 1; j <= h; j++) {
            for (int i = 1; i <= w; i++) {
                if ((i <= (w - (j * 2 - 1)) / 2) || (i > (w + (j * 2 - 1)) / 2))  {
                    builder.append(" ");
                } else {
                    builder.append("^");
                }
            }
            if (j < h) {
                builder.append(line);
            }
        }

        String result = builder.toString();
        return result;
    }
}
