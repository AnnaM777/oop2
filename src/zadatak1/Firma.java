package zadatak1;

import java.util.ArrayList;

/*
Kreirati klasu Firma koja ima privatne atribute:
●	kalendarksa godina za koju beleži svoj rad na projektima
●	listu stambenih jedinica koji treba da se realizuju u toku godine
●	objekat kvalitet gradnje koji definiše koji kvalitet gradnje firma zeli da koristi u izradi projekata,
●	godišnji budzet firme,
dok od javnih:
●	default-ni konstuktor i konstuktor koji postavlja sve parametre
●	gettere i settere
●	metodu koja štampa najskuplji stambeni objekat koji se isplati raditi(pokriva ga budžet firme) sa težinom izrade ADVANCED.

 */
public class Firma {

    private int kalendarskaGodina;
    private ArrayList<StambeniObjekat> stambeniObjekat = new ArrayList<>();
    private KvalitetGradnje kvalitetGradnje;

    public Firma() {
    }

    public Firma(int kalendarskaGodina, ArrayList<StambeniObjekat> stambeniObjekat, KvalitetGradnje kvalitetGradnje) {
        this.kalendarskaGodina = kalendarskaGodina;
        this.stambeniObjekat = stambeniObjekat;
        this.kvalitetGradnje = kvalitetGradnje;
    }

    public int getKalendarskaGodina() {
        return kalendarskaGodina;
    }

    public void setKalendarskaGodina(int kalendarskaGodina) {
        this.kalendarskaGodina = kalendarskaGodina;
    }

    public ArrayList<StambeniObjekat> getStambeniObjekat() {
        return stambeniObjekat;
    }

    public void setStambeniObjekat(ArrayList<StambeniObjekat> stambeniObjekat) {
        this.stambeniObjekat = stambeniObjekat;
    }

    public KvalitetGradnje getKvalitetGradnje() {
        return kvalitetGradnje;
    }

    public void setKvalitetGradnje(KvalitetGradnje kvalitetGradnje) {
        this.kvalitetGradnje = kvalitetGradnje;
    }
    //metodu koja štampa najskuplji stambeni objekat koji se isplati raditi(pokriva ga budžet firme) sa težinom izrade ADVANCED.
    public void najskupljiStambeniObjekat(){
        ArrayList<StambeniObjekat> stambeniObjekat = new ArrayList<>();
        for (int i = 0; i < stambeniObjekat.size(); i++){

        }

    }
}
