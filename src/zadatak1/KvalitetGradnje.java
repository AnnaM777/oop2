package zadatak1;
/*Kreirati klasu KvalitetGradnje i koja od privatnih atributa ima:

●	identifikacioni kod
●	inicijalnu cenu gradnje po kvadratu
a od javnih metoda:
●	default-ni konstruktor i konstuktor koji postavlja sve parametre
●	gettere i settere za sve attribute.
●	metodu koja prima oznaku težine izrade projekta (basic, medium, advanced) i vraća ukupnu cenu gradnje po kvadratu ako znamo da:
o	basic uvećava incijalnu cenu za 25%
o	medium uvećava incijalnu cenu za 45%
o	advanced uvećava incijalnu cenu za 70%

 */
public class KvalitetGradnje {
    private String identifikacioniKod;
    private double inicijalnaCenaGradnje;
    private TezinaIzrade tezinaIzrade;

    public KvalitetGradnje() {
    }

    public KvalitetGradnje(String identifikacioniKod, double inicijalnaCenaGradnje, TezinaIzrade tezinaIzrade) {
        this.identifikacioniKod = identifikacioniKod;
        this.inicijalnaCenaGradnje = inicijalnaCenaGradnje;
        this.tezinaIzrade = tezinaIzrade;
    }

    public String getIdentifikacioniKod() {
        return identifikacioniKod;
    }

    public void setIdentifikacioniKod(String identifikacioniKod) {
        this.identifikacioniKod = identifikacioniKod;
    }

    public double getInicijalnaCenaGradnje() {
        return inicijalnaCenaGradnje;
    }

    public void setInicijalnaCenaGradnje(double inicijalnaCenaGradnje) {
        this.inicijalnaCenaGradnje = inicijalnaCenaGradnje;
    }

    public TezinaIzrade getTezinaIzrade() {
        return tezinaIzrade;
    }

    public void setTezinaIzrade(TezinaIzrade tezinaIzrade) {
        this.tezinaIzrade = tezinaIzrade;
    }
    //metodu koja prima oznaku težine izrade projekta (basic, medium, advanced) i vraća ukupnu cenu gradnje
    // po kvadratu ako znamo da:
    // basic uvećava incijalnu cenu za 25%
    //o	medium uvećava incijalnu cenu za 45%
    //o	advanced uvećava incijalnu cenu za 70%


    public double ukupnaCenaGradnje(TezinaIzrade tezinaIzrade){

      if (tezinaIzrade == tezinaIzrade.BASIC){
          return inicijalnaCenaGradnje + inicijalnaCenaGradnje * 0.25;
      } else if (tezinaIzrade == tezinaIzrade.MEDIUM) {
          return inicijalnaCenaGradnje + inicijalnaCenaGradnje * 0.45;

      }else if (tezinaIzrade == tezinaIzrade.ADVANCED){
          return inicijalnaCenaGradnje + inicijalnaCenaGradnje * 0.7;
      }
        return inicijalnaCenaGradnje;
    }
}
