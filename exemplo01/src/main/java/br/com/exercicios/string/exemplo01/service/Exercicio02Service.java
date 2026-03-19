package br.com.exercicios.string.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio02Service {
    public int romanToDecimal(String roman) {

        int total = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {

            int current = valueOfRoman(roman.charAt(i));

            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }

    private int valueOfRoman(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Número romano inválido");
        }
    }
}
