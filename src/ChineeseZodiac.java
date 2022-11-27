import java.util.Scanner;

public class ChineeseZodiac {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir
Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
ve yıldızlarla pek bir ilgisi yoktur.
Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

Senaryo
         */

        // Declare variables and create a new object
        Scanner sc = new Scanner(System.in);
        int birthDate, remainder;
        String result = "";

        // Prompt the user to input the date of birth
        System.out.print(" Please, enter your birth date : ");
        birthDate = sc.nextInt();

        // Calculate Chineese Zodiac Sign and display the result
        remainder = birthDate % 12;


        switch (remainder) {
            case 0:
                result = " Monkey ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 1:
                result = " Rooster ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 2:
                result = " Dog ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 3:
                result = " Pig ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 4:
                result = " Rat ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 5:
                result = " Ox ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 6:
                result = " Tiger ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 7:
                result = " Rabbit ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 8:
                result = " Dragon ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 9:
                result = " Snake ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 10:
                result = " Horse ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            case 11:
                result = " Goat ";
                System.out.println( " Your Chinese Zodiac : " + result);
                break;
            default:
                System.out.println(" Please, enter a number that is greater than 0.");

        }
    }
}