import java.util.Scanner;

public class HW3{
    public static void main(String[] args){
        // вывести пояснение к программе
        System.out.println("Данная программа реализует вычисления n-ого треугольного числа.");
        // запрос данных от пользователя
        int userNumber = getPositiveIntNumber("Для рассчета пожалуйста ведите целое положительное число -> ");
        // если пользователь ввел число корректно
        if (userNumber > 0){
            triangularNumber(userNumber);
        }
    }

    // метод для расчета треугольного числа и его вывода в консоль
    public static void triangularNumber(int order){
        int answerT = order * (order + 1) / 2;
        System.out.println(String.format("Для числа %d треугольное число равно %d.", order, answerT));
    }

    // метод для получения числа от пользователя
    public static int getPositiveIntNumber(String msg){
        Scanner userInput = new Scanner(System.in);
        // вывести строку с приглашением msg
        System.out.print(msg);
        // считать строку
        String userAnswer = userInput.nextLine();
        int outputNumber = 0;
        // получить integer
        try {
            outputNumber = Integer.parseInt(userAnswer);
        }
        // если integer получить не удалось вывести пользователю информацию и вернуть 0
        catch (Exception e) {
            System.out.println("Введенные данные не являются целым положительным числом.");
        }
        return outputNumber;
    }
}