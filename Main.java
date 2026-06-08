import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        while (true) {

            System.out.println("\n===== 學生成績管理系統 =====");
            System.out.println("1. 新增學生");
            System.out.println("2. 顯示全部學生");
            System.out.println("3. 搜尋學生");
            System.out.println("0. 離開");

            System.out.print("請輸入選項：");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("姓名：");
                    String name = sc.nextLine();

                    System.out.print("成績：");
                    int score = sc.nextInt();

                    manager.addStudent(
                        new Student(name, score)
                    );

                    System.out.println("新增成功！");
                    break;

                case 2:
                    manager.showAllStudents();
                    break;

                case 3:
                    System.out.print("請輸入姓名：");
                    String searchName = sc.nextLine();
                    manager.searchStudent(searchName);
                    break;

                case 0:
                    System.out.println("系統結束");
                    return;

                default:
                    System.out.println("輸入錯誤");
            }
        }
    }
}