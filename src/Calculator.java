import java.util.Scanner;

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
        return sum;
    }
}

class Subtract extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        int difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        return difference;
    }
}

class Multiply extends CalculationMethods {
    @Override
    double compute(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
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
        double result=0;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("请选择计算方式：1.加法 2.减法 3.乘法 4.除法");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("请输入数字个数：");
            int n = scanner.nextInt();
            if (result != 0) {
                n++;
            }
            int[] numbers = new int[n];
            System.out.println("请输入数字：");
            int j = 0;
            if (result != 0) {
                numbers[0] = (int) result;
                j = 1;
            }
            for (int i=j;i< n; i++) {
                numbers[i] = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    CalculationMethods add = new Add();
                    result += add.compute(numbers);
                    break;
                case 2:
                    CalculationMethods subtract = new Subtract();
                    result += subtract.compute(numbers);
                    break;
                case 3:
                    CalculationMethods multiply = new Multiply();
                    result += multiply.compute(numbers);
                    break;
                case 4:
                    CalculationMethods divide = new Divide();
                    result += divide.compute(numbers);
                    break;
                default:
                    System.out.println("没有此选项，期待以后开发");
            }
            System.out.println("当前结果: " + result);
            System.out.println("是否继续计算？1.是 2.否");
            int isContinueChoice = scanner.nextInt();
            if (isContinueChoice == 2) {
                isContinue = false;
            }
        }
    }
}
