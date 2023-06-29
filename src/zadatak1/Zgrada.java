package zadatak1;
/*
) Kreirati klasu Zgrada koja nasleđuje klasu StambeniObjekat. Klasa dodatno pamti još neke informacije i sadrži:
●	broj stanova (ne sme biti negativna vrednost)
●	broj lokala (ne sme biti negativna vrednost)
●	default-ni konstruktor i konstuktor koji postavlja sve parametre
●	gettere i settere za sve attribute.
●	Cena izgradnje zgrade se računa tako što se  podrazumeva da je 80% ukupne kvadrature stanovi, a 20% lokali.
 Cena za lokala je 15% veći od regularne cene koja se računa u odnosu na kvadraturu  i cenu po kvadratu.
●	Tekstualni podaci o zgradi se vraćaju u sledećem formatu:
Zgrada: (adresa broj)
Kvadratura: (kvadratura)
Stanovi/lokali: (broj stanova/broj lokala)

 */
public abstract class Zgrada extends StambeniObjekat {
    private int brojStanova;
    private int brojLokala;

    public Zgrada() {

    }

    public Zgrada(String adresa, int broj, double kvadratura, int brojStanova, int brojLokala) {
        super(adresa, broj, kvadratura);
        setBrojStanova(brojStanova);
        setBrojLokala(brojLokala);
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        if (brojStanova > 0) {
            this.brojStanova = brojStanova;
        }else {
            System.out.println("Ne sme biti negativna vrednost!");
        }
    }

    public int getBrojLokala() {
        return brojLokala;
    }

    public void setBrojLokala(int brojLokala) {
        if (brojLokala > 0) {
            this.brojLokala = brojLokala;
        }else {
            System.out.println("Ne sme biti negativna vrednost!");
        }
    }
    //Cena izgradnje zgrade se računa tako što se  podrazumeva da je 80% ukupne kvadrature stanovi, a 20% lokali.
    // Cena za lokala je 15% veći od regularne cene koja se računa u odnosu na kvadraturu  i cenu po kvadratu.
   // public void izracunajCenuGradnje




    @Override
    public String toString() {
        return super.toString() + "Zgrada{" +
                "kvadratura" + kvadratura +
                "brojStanova=" + brojStanova +
                ", brojLokala=" + brojLokala +
                "} ";
    }
}
