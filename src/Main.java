import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int arraySize = inputStream.nextInt();

        if(arraySize < 0) {
            System.out.println("Размерность массива не может быть меньше 1.");
            return;
        }

        double[] array = new double[arraySize];
        double middle = 0;

        System.out.println("Заполните массив элементами с плавающей точкой:");
        for(int idx = 0; idx < arraySize; idx++){
            array[idx] = inputStream.nextDouble();
            middle += array[idx];
        }

        middle /= arraySize;
        System.out.println("Среднее арифметическое:" + middle);

        for(double value : array){
            System.out.println(value + " * " + middle + " = " + value * middle );
        }

    }
}