package Task004;

import java.io.FileWriter;
import java.io.IOException;

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
*/
public class Task004 {
    public static void main(String[] args) {
        String filePath = "src/task004.txt";
        String s = "task004";
        int n = 10;
        String res = repeat(s, n);
        writeInFile(res, filePath);
    }

    static void writeInFile(String res, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String repeat(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
