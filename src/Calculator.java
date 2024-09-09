abstract class CalculationMethods {
    abstract double compute(int[] numbers);
}

class Add extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        return 0;
    }
}

class Subtract extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        int difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        System.out.println("Difference: " + difference);
        return 0;
    }
}

class Multiply extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product: " + product);
        return 0;
    }
}

class Divide extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        double quotient = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            quotient /= numbers[i];
        }
        return quotient;
    }
}

public class Calculator {
    public static void main(String[] args){
        System.out.println("请选择计算方式：1.加法 2.减法 3.乘法 4.除法");
        
    }
}
