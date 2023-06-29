package zadatak1;
/*
Kreirati apstraktnu klasu StambeniObjekat koja od zaštićenih atributa ima:
●	adresu
●	broj
●	kvadraturu (ne sme biti negativna vrednost)
 dok od javnih metoda:
●	default-ni i konstruktor koji postavlja sve atribute klase.
●	gettere i settere (atribute klase adresa i broj nije moguće menjati, nakon inicijalizacije tj. posle
njihovog postavljanja u konstruktoru)
●	apstraktnu metodu izracunajCenuGradnje koja vraća cenu za izgradnju stambenog objekta na osnovu prosleđenog
objekta kvaliteta gradnje i tezine gradnje  koji se metodi prosleđuju kao parametar.

 */
public abstract class StambeniObjekat {
    protected String adresa;
    protected int broj;
    protected double kvadratura;

    public StambeniObjekat() {
    }

    public StambeniObjekat(String adresa, int broj, double kvadratura) {
        this.adresa = adresa;
        this.broj = broj;
        setKvadratura(kvadratura);
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        if (kvadratura > 0) {
            this.kvadratura = kvadratura;
        } else {
            System.out.println("Kvadratura ne sme biti negativna vrednost!");
        }
    }
    //apstraktnu metodu izracunajCenuGradnje koja vraća cenu za izgradnju stambenog objekta na osnovu prosleđenog
    //objekta kvaliteta gradnje i tezine gradnje  koji se metodi prosleđuju kao parametar.
    public abstract double izracunajCenuGradnje(StambeniObjekat stambeniObjekat, KvalitetGradnje kvalitetGradnje);



}
