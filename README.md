https://claude.ai/chat/9cae447f-2762-41b2-adcc-f8af57515692 

Nguyễn Tùng Dương - 22it1

# Calculator Project - Dự án này là một ứng dụng máy tính đơn giản được viết bằng Java, bao gồm các phép tính cơ bản và bộ kiểm thử unit test.

# Cấu trúc Project
Project bao gồm hai file chính:
- Calculator.java: Class chính chứa các phương thức tính toán
- CalculatorTest.java: Class kiểm thử sử dụng JUnit framework

# Calculator.java
Class Calculator cung cấp 4 phương thức tính toán cơ bản:
Cộng hai số nguyên (add)
Trừ hai số nguyên (subtract)
Nhân hai số nguyên (multiply)
Chia hai số nguyên (divide)
![image](https://github.com/user-attachments/assets/ae4c93e0-261d-4850-a5ff-2b735ffd53b5)

# CalculatorTest.java
File kiểm thử sử dụng JUnit framework để kiểm tra tính đúng đắn của các phương thức:
![image](https://github.com/user-attachments/assets/d82c8d82-07a6-4fc6-bd7d-8d8513de5312)

# Kết quả kiểm thử
Sau khi chạy các test case, tất cả các phương thức đều pass:
![image](https://github.com/user-attachments/assets/8d1cb5f5-d433-4160-a0c0-5a9109076db7)

Chi tiết kết quả kiểm thử:

- testAdd(): ✅ Pass
Test cộng số dương
Test cộng số âm
Test cộng số âm và dương


- testSubtract(): ✅ Pass
Test trừ hai số bằng nhau
Test trừ số lớn hơn
Test trừ số nhỏ hơn


- testMultiply(): ✅ Pass
Test nhân số dương
Test nhân với số âm
Test nhân với số 0


- testDivide(): ✅ Pass
Test chia số nguyên
Test chia ra số thập phân
Test chia với số âm


- testDivideByZero(): ✅ Pass
Test xử lý ngoại lệ khi chia cho 0



