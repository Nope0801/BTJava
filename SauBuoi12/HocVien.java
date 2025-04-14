package SauBuoi12;

import java.util.Scanner;

public class HocVien{
    // private static final long serialVersionUID = 1L;
    private String id;
    private String classes;
    private String name;
    private int age;
    private float score;

    public HocVien(){}
    public HocVien(String id, String classes, String name, int age, float score){
        this.id = id;
        this.classes = classes;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma hoc vien: "); this.id = sc.nextLine();
        System.out.print("Nhap vao lop hoc vien: "); this.classes = sc.nextLine();
        System.out.print("Nhap vao ho ten hoc vien: "); this.name = sc.nextLine();
        System.out.print("Nhap vao tuoi hoc vien: "); this.age = sc.nextInt();
        System.out.print("Nhap vao diem hoc vien: "); this.score = sc.nextFloat();
    }
    public void xuatThongTin(){
        // System.out.println("Ma: " + id);
        // System.out.println("Lop hoc: " + classes);
        // System.out.println("Ten sinh vien: " + name);
        // System.out.println("Tuoi: " +  age);
        // System.out.println("Diem so: " + score);
        System.out.println("Ma: " + id + "\t| Lop hoc: " + classes + "\t| Ten: " + name + "\t| Tuoi: " + age + "\t| Diem: " + score);
        // return "Student@[id=" + id + " , class = "+ classes +", name=" + name + ", age =" + age + ", score = "+ score +"]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

}
