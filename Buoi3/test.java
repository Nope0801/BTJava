import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int a[] = {9,3,8,7,3,9,4,2};
        System.out.println("Mang goc: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sau sort: " + Arrays.toString(a));
        int i = Arrays.binarySearch(a, 8);
        System.out.println("Vi tri cua 8 la " + i);
        Arrays.fill(a, 0);
        System.out.println("Sau fill: " + Arrays.toString(a));
    }
    
}