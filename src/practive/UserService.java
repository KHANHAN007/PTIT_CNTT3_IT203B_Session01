package practive;

import java.io.FileNotFoundException;

public class UserService {
    public static String registerUser(String name, String ageInput, String email)
            throws InvalidAgeException, InvalidEmailException {
        int age;
        try{
            age = Integer.parseInt(ageInput);
        }catch (NumberFormatException e){
            throw e;
        }
        if(age < 18){
            throw new InvalidAgeException("Lỗi nghiệp vụ: Tuổi không đủ để đăng ký hệ thống.");
        }
        if(!email.contains("@")){
            throw new InvalidEmailException("Lỗi nghiệp vụ: Email không hợp lệ (phải chứa @).");
        }

        return "Tên: " + name + ", Tuổi: " + age + ", Email: " + email;
    }

    public static void saveUserToFile(String userData) throws FileNotFoundException {
        System.out.println("Đang lưu dữ liệu người dùng...");
        throw new FileNotFoundException("Không tìm thấy file lưu trữ.");
    }
}
