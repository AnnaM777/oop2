package zadatak1;
/*
Kreirati klasu Kuća koja nasleđuje klasu StambeniObjekat i koja dodatno pamti informaciju o veličini dvorišta
(ne sme biti negativna vrednost). Cena za gradnju se računa tako množenjem kvadrature i cene po kvadratu u skladu
sa težinom projekta (pravila iz klase KvalitetGradnje). Teksutalne informacije o kuci se vraćaju u obliku:
	Kuca: (adresa broj)
	Kvadratura: (kvadratura)
Dvorište (veličina dvorišta)

 */
public abstract class Kuca extends StambeniObjekat {

    private double VelicinaDvorista;

    public Kuca(double velicinaDvorista) {
        VelicinaDvorista = velicinaDvorista;
    }

    public Kuca(String adresa, int broj, double kvadratura, double velicinaDvorista) {
        super(adresa, broj, kvadratura);
        VelicinaDvorista = velicinaDvorista;
    }

    @Override
    public String toString() {
        return "Kuca{" + ", adresa='" + adresa + '\'' +
                ", broj=" + broj +
                ", kvadratura=" + kvadratura +
                "VelicinaDvorista=" + VelicinaDvorista +
                "} " + super.toString();
    }
}
