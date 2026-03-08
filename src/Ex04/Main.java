package Ex04;

import java.io.IOException;

public class Main {
    public static void saveToFile(String data) throws IOException {
        System.out.println("Đang lưu dữ liệu vào file...");
        throw new IOException("Không thể ghi dữ liệu vào file.");
    }

    public static void processUserData(String data) throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng...");

        saveToFile(data);
    }

    public static void main(String[] args) {
        try {
            processUserData("User: An, Age: 20");
        } catch (IOException e) {
            System.out.println("Lỗi hệ thống: " + e.getMessage());
        }
        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}

// main() -> processUserData() -> saveToFile() -> throw IOException -> processUserData không xử lý -> main() catch IOException -> in lỗi