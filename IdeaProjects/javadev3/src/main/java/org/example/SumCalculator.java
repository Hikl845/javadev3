package org.example;

public class SumCalculator {

    public int sum(int numb) {
        if (numb <= 0) {
            throw new IllegalArgumentException("Wrong number, number must be > 0");
        }

        int result = 0;
        for (int i = 1; i <= numb; i++) {
            result += i;   // ✅ складываем
        }
        return result;
    }
}
