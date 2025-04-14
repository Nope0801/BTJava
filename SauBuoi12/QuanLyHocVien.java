package SauBuoi12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

// class SortByName implements Comparator{
//     public int compare(HocVien A, HocVien B){
//         HocVien test1 = (HocVien)A;
//         HocVien test2 = (HocVien)B;
//         // if(test1.name < test2.name) return -1;
//         // if(test1.name > test2.name) return 1;
//         return 0;
//     }
// }
public class QuanLyHocVien {
    private ArrayList<HocVien> danhSachHocViens = new ArrayList<>();

    public QuanLyHocVien() {
    }

    public void addStudentByInput() {
        HocVien hocVien = new HocVien();
        hocVien.nhapThongTin();
        danhSachHocViens.add(hocVien);
    }

    public void addStudentByFile() {
        String filePath = "SauBuoi12\\fileInput.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    String id = data[0].trim();
                    String classes = data[1].trim();
                    String name = data[2].trim();
                    int age = Integer.parseInt(data[3].trim());
                    float score = Float.parseFloat(data[4].trim());

                    HocVien hocVien = new HocVien(id, classes, name, age, score);
                    danhSachHocViens.add(hocVien);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing student data: " + e.getMessage());
        }
    }

    public void editStudentById(String findId) {
        boolean found = false;
        for (int i = 0; i < danhSachHocViens.size(); i++) {
            HocVien hocVien = danhSachHocViens.get(i);
            if (findId.equals(hocVien.getId())) {
                System.out.println("Hoc vien tim thay. Nhap thong tin moi:");
                HocVien updatedHocVien = new HocVien();
                updatedHocVien.nhapThongTin();
                danhSachHocViens.set(i, updatedHocVien);
                found = true;
                System.out.println("Thong tin hoc vien da duoc cap nhat.");
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay hoc vien voi ma ID: " + findId);
        }
    }

    public void deleteStudentById(String findId) {
        for (HocVien i : danhSachHocViens) {
            if (findId.equals(i.getId())) {
                danhSachHocViens.remove(i);
            }
        }
    }

    public void showStudent() {
        System.out.println("=== Danh sach sinh vien ===");
        for (HocVien i : danhSachHocViens) {
            i.xuatThongTin();
        }
    }

    // public void sortByName() {
    //     Collections.sort(danhSachHocViens, new Comparator<HocVien>() {
    //         @Override
    //         public int compare(HocVien hv1, HocVien hv2) {
    //             return hv1.getName().compareToIgnoreCase(hv2.getName());
    //         }
    //     });
    //     System.out.println("Danh sach hoc vien da duoc sap xep theo ten.");
    // }

    public void sortByName() {
        Collections.sort(danhSachHocViens,
                (HocVien hv1, HocVien hv2) -> hv1.getName().compareToIgnoreCase(hv2.getName()));
        System.out.println("Danh sach hoc vien da duoc sap xep theo ten.");
    }

    public void sortByScore() {
        Collections.sort(danhSachHocViens, (HocVien hv1, HocVien hv2) -> Float.compare(hv1.getScore(), hv2.getScore()));
        System.out.println("Danh sach hoc vien da duoc sap xep theo diem.");
    }

}
