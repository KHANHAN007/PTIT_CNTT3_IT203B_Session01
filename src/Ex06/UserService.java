package Ex06;

import java.io.IOException;

public class UserService {
    public static void saveToFile(String data) throws IOException {
        System.out.println("Đang lưu dữ liệu...");
        throw new IOException("Không thể ghi file.");
    }

    public static void processUserData(User user) throws IOException {

        if (user != null) {
            saveToFile("User data");
        }
    }
}
