public class Osoba {
    public String imie;
    public String nazwisko;

    private Osoba(String imie, String nazwisko) {
        if (imie == null || imie.isEmpty()) this.imie = "";
        else this.imie = imie;

        if (nazwisko == null || nazwisko.isEmpty()) this.nazwisko = "";
        else this.nazwisko = nazwisko;
    }

    public static Osoba stworzOsobe(String imie, String nazwisko) {
        return new Osoba(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Osoba: " + imie + " " + nazwisko;
    }
}
