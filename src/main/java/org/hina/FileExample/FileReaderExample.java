package org.hina.FileExample;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // tạo liên kết file
        File file = new File("src/main/java/org/hina/FileExample/file.txt");
        try {
            // tạo kết nối
            FileReader fileReader = new FileReader(file);

            // đưa dữ liệu vào bộ đệm
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //dọc đữ liệu xử lý dữ liệu
            String line;
            double sum = 0;
            int cnt = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    try {
                        double v = Double.parseDouble(number);
                        sum += v;
                        cnt++;
                    } catch (NumberFormatException e) {

                    }
                }
            }
            System.out.println("Tổng các số là: " + sum);
            System.out.println("Số các số là: " + cnt);

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
