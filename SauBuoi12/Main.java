package SauBuoi12;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        QuanLyHocVien quanLyHocVien = new QuanLyHocVien();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Show students");
            System.out.println("5. Sort students by name");
            System.out.println("6. Sort students by score");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    quanLyHocVien.addStudentByFile();
                    break;
                case 2:
                    System.out.print("Nhap ma hoc vien de sua: ");
                    String editId = scanner.nextLine();
                    quanLyHocVien.editStudentById(editId);
                    break;
                case 3:
                    System.out.print("Nhap ma hoc vien de xoa: ");
                    String deleteId = scanner.nextLine();
                    quanLyHocVien.deleteStudentById(deleteId);
                    break;
                case 4:
                    quanLyHocVien.showStudent();
                    break;
                case 5:
                    quanLyHocVien.sortByName();
                    break;
                case 6:
                    quanLyHocVien.sortByScore();
                    break;
                case 0:
                    System.out.println("Thoat...");
                    break;
                default:
                    System.out.println("Lua chon khong phu hop! Vui long chon lai");
            }
        } while (choice != 0);

        scanner.close();
    }
}
