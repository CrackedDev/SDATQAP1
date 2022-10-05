package com.qap1SDAT;

public class Calculator {
       public Calculator() {
        }
       public int add(int a, int b) {
            return a + b;
        }
       public int subtract(int a, int b) {
            return a - b;
        }
        public double multiply(int a, int b) {
            return a * b;
        }
        public double divide(int a, int b) {
            double result;
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero!!!");
            } else {
                result = Double.valueOf(a)/Double.valueOf(b);
            }
            return result;
        }
    }

