import java.util.Scanner;

public class main {


    public static class Main {
        public static void main(String[]args){
            System.out.println("Введите ip-адрес:");
            Scanner scan=new Scanner(System.in);
            String input= scan.nextLine();
            boolean result=input.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
            if (result){
                System.out.println("OK");
            }
            else{
                System.out.println("ERROR");
            }
        }
    }
}
