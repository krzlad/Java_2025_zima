public class Samochod {
    String marka;
    String model;
    int rokProdukcji;
    double przebieg;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void uruchom(){
        System.out.println(this.marka + " " + this.model + " został uruchomiony!");
    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Rok: " + this.rokProdukcji);
        System.out.println("Przebieg: " + this.przebieg + " km");
    }

    // >>> TU jest punkt startowy programu <<<
    public static void main(String[] args) {
        Samochod s = new Samochod("BMW", "E46", 2004, 343456.0);
        s.uruchom();
        s.wyswietlInformacje();
    }
}
