import java.util.Scanner;

public class Data {

    enum Miesiac {
        STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ, CZERWIEC,
        LIPIEC, SIERPIEN, WRZESIEN, PAZDZIERNIK, LISTOPAD, GRUDZIEN
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dzień: ");
        int dzien = sc.nextInt();

        System.out.print("Podaj miesiąc (1-12): ");
        int m = sc.nextInt();

        System.out.print("Podaj rok: ");
        int rok = sc.nextInt();

        // Zamiana liczby na enum
        Miesiac miesiac = Miesiac.values()[m - 1];

        int maxDni;

        switch (miesiac) {
            case STYCZEN, MARZEC, MAJ, LIPIEC, SIERPIEN, PAZDZIERNIK, GRUDZIEN:
                maxDni = 31;
                break;

            case KWIECIEN, CZERWIEC, WRZESIEN, LISTOPAD:
                maxDni = 30;
                break;

            case LUTY:
                if (rokPrzestepny(rok)) {
                    maxDni = 29;
                } else {
                    maxDni = 28;
                }
                break;

            default:
                maxDni = -1;
        }

        if (dzien >= 1 && dzien <= maxDni) {
            System.out.println("Data poprawna.");
        } else {
            System.out.println("Data NIEpoprawna.");
        }
    }

    // Sprawdzanie roku przestępnego
    public static boolean rokPrzestepny(int rok) {
        return (rok % 400 == 0) || (rok % 4 == 0 && rok % 100 != 0);
    }
}
