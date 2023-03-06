public class BinOps {


    public String sum(String a, String b) {
        System.out.println("Начинаем перевод в десятиричную систему...");
        int firstValue = Integer.parseInt(a, 2);
        int secondValue =Integer.parseInt(b, 2);
        System.out.println("Вы ввели : " + firstValue + " и " + secondValue);
        int result = firstValue + secondValue;
        System.out.println("Сумма чисел : " + result);
        System.out.println("Перевод результата в двоичную систему...");
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        System.out.println("Начинаем перевод в десятиричную систему...");
        int firstValue = Integer.parseInt(a, 2);
        int secondValue =Integer.parseInt(b, 2);
        System.out.println("Вы ввели : " + firstValue + " и " + secondValue);
        int result = firstValue * secondValue;
        System.out.println("Результат уможения : " + result);
        System.out.println("Перевод результата в двоичную систему...");
        return Integer.toBinaryString(result);
    }
}