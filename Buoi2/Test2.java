package Buoi2;
import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        int a, b, s;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap vao so nguyen thu nhat: ");
        str = br.readLine();
        a = Integer.parseInt(str);

        System.out.print("Nhap vao so nguyen thu hai: ");
        str = br.readLine();
        b = Integer.parseInt(str);
        s = a + b;
        System.out.println("Tong cua hai so = " + s);
    }
}
