import java.util.Scanner;

public class Main1111 {

//    public String text;
//    public int numb;
//
//    public static void main(String[] args) {
//        new Main1111().run();
//    }
//
//    private void run() {
//        convertString();
//    }
//
//
//    //конвертация строки String в Int
//    public int convertString(){
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите число");
//            text = scanner.nextLine();
//            numb = Integer.parseInt(text);
//            int sum = sumNumber(numb);
//            checkMultiplicity(sum);
//        }catch (NumberFormatException e) {
//            System.err.println("В строке не число");
//        }
//        return numb;
//    }
//
//    //    подготовка числа
//    public int sumNumber(int numb){
//        int sum = 0;
//        while ( numb != 0){
//            sum += numb % 10;
//            numb /= 10;
//        }
//        int sum1=0;
//        while (sum !=0){
//            sum1 = sum1 + sum % 10;//краткая запись sum1 += sum % 10
//            sum = sum / 10;//краткая запись sum /= 10
//        }
//        return sum1;
//    }
//
//    //проверка кратности
//    public boolean checkMultiplicity(int sum) {
//
//        if (sum % 3 == 0) {
//            System.out.println("Число: " + text + " кратно 3");
//            return true;
//        } else {
//            System.out.println("Число -" + text + " не кратно 3");
//            return false;
//        }
//
//    }
}
