package Ex06;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập tên người dùng: ");
            String name = scanner.nextLine();
            User user = new User(name);
            System.out.print("Nhập tuổi: ");
            String ageInput = scanner.nextLine();
            int age = Integer.parseInt(ageInput);
            user.setAge(age);
            user.printUserInfo();
            UserService.processUserData(user);

        }
        catch (NumberFormatException e) {
            LoggerUtil.logError("Tuổi phải là số hợp lệ.");

        }
        catch (InvalidAgeException e) {
            LoggerUtil.logError(e.getMessage());
        }
        catch (IOException e) {
            LoggerUtil.logError("Lỗi hệ thống: " + e.getMessage());
        }
        finally {

            System.out.println("Hoàn tất luồng xử lý đăng ký.");
            scanner.close();

        }
    }
}
