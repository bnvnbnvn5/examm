https://chatgpt.com/c/677dd6f8-d06c-8000-aa9c-97f763a7434d
Nguyễn Tùng Dương - 22se1

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
Tính lũy thừa (power(double base, double exponent))
Tính căn bậc hai với kiểm tra số âm (squareRoot(double number))

![image](https://github.com/user-attachments/assets/ae4c93e0-261d-4850-a5ff-2b735ffd53b5)

# CalculatorTest.java
File kiểm thử sử dụng JUnit framework để kiểm tra tính đúng đắn của các phương thức:
![image](https://github.com/user-attachments/assets/d82c8d82-07a6-4fc6-bd7d-8d8513de5312)

# Kết quả kiểm thử
Sau khi chạy các test case, tất cả các phương thức đều pass:
![image](https://github.com/user-attachments/assets/8d1cb5f5-d433-4160-a0c0-5a9109076db7)

Chi tiết kết quả kiểm thử:

- testAdd(): ✅ Pass
Kiểm tra cộng hai số dương.
Kiểm tra cộng hai số âm.
Kiểm tra cộng số âm và dương.
Kiểm tra cộng với 0.
Kiểm tra trường hợp overflow.


- testSubtract(): ✅ Pass
Kiểm tra trừ hai số bằng nhau.
Kiểm tra trừ số lớn hơn.
Kiểm tra trừ số nhỏ hơn.
Kiểm tra underflow.

- testMultiply(): ✅ Pass
Kiểm tra nhân hai số dương.
Kiểm tra nhân với số âm.
Kiểm tra nhân với 0.
Kiểm tra overflow khi nhân các số lớn.

- testDivide(): ✅ Pass
Kiểm tra chia số nguyên.
Kiểm tra chia ra số thập phân.
Kiểm tra chia với số âm.
Kiểm tra ngoại lệ khi chia cho 0.

- testDivideByZero(): ✅ Pass
Test xử lý ngoại lệ khi chia cho 0

- testPower(): ✅ Pass
Kiểm tra lũy thừa cơ bản.
Kiểm tra lũy thừa với số mũ âm.
Kiểm tra lũy thừa của số âm với số mũ chẵn và lẻ.
Kiểm tra lũy thừa với số thập phân.
Kiểm tra lũy thừa với cơ số và số mũ lớn.

- testSquareRoot(): ✅ Pass
Test căn bậc hai của số dương.
Test căn bậc hai của 0.
Test ngoại lệ khi tính căn bậc hai của số âm.

