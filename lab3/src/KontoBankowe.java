public class KontoBankowe {
    String wlasciciel;
    double saldo;

    public KontoBankowe(String wlasciciel, double saldoPoczatkowe) {
        this.wlasciciel = wlasciciel;
        this.saldo = saldoPoczatkowe;
    }

    public void wplata(double kwota) {
        saldo += kwota;
        System.out.println("Wpłacono " + kwota + " zł. Nowe saldo: " + saldo);
    }

    public void wyplata(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Wypłacono " + kwota + " zł. Nowe saldo: " + saldo);
        } else {
            System.out.println("Brak środków na koncie!");
        }
    }

    public void pokazSaldo() {
        System.out.println("Saldo konta " + wlasciciel + ": " + saldo + " zł");
    }
}

    class Main{
        public static void main(String[] args){
        KontoBankowe konto = new KontoBankowe("Wiktor Czarnota",10000);
        konto.pokazSaldo();
        konto.wplata(1000);
        konto.wyplata(3000);
        konto.wyplata(15000);
        }
    }
