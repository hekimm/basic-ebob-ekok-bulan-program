# GCD and LCM Calculator

## Overview

This Java program calculates the **Greatest Common Divisor (GCD)** and **Least Common Multiple (LCM)** of two integers provided by the user. The user is prompted to input two numbers, and the program computes their GCD and LCM using a loop.

## How It Works

1. **Input**: The user is prompted to enter two integers (`a` and `b`).
2. **Identify the Smaller Number**: The program determines which of the two numbers is smaller (`küçükSayı`). This is used to start the search for the GCD.
3. **Calculate GCD**:
   - The program iterates from the smaller number down to `1`, checking for the largest number that divides both `a` and `b` without leaving a remainder.
   - When such a number (`i`) is found, it is set as the GCD (`ebob`), and the loop is terminated.
4. **Calculate LCM**:
   - The LCM (`ekok`) is then calculated using the formula: **LCM(a, b) = (a * b) / GCD(a, b)**.
5. **Output**: The program prints the GCD and LCM values to the console.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter two integer values when prompted, and the program will calculate and display the GCD and LCM of the two numbers.

## Example Output

```
Birinci sayıyı girin: 24
İkinci sayıyı girin: 36
EBOB: 12
EKOK: 72
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.

