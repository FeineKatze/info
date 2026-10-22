public class Knoten implements Listenelement
{
    Listenelement nachfolger;
    Wahlkurs kurs;
    
    public Knoten(Wahlkurs kurs) {
        this.kurs = kurs;
        nachfolger = new Abschluss();
    }
    
    public int anzahlKurseGeben(String fachgebiet) {
        int x = nachfolger.anzahlKurseGeben(fachgebiet);
        if (this.kurs.fachgebiet == fachgebiet) {
            return x+1;
        } else {return x;}
    }
    
    public Listenelement zuKleineKurseLoeschen(int minTeilnehmerzahl) {
        nachfolger = nachfolger.zuKleineKurseLoeschen(minTeilnehmerzahl);
        if (this.kurs.teilnehmerzahl < minTeilnehmerzahl) {
            return this.nachfolger;
        } else {return this;}
    }
    
    public void setNach(Listenelement l) {
        this.nachfolger = l;
    }    
    
    public Listenelement getNach() {
        return this.nachfolger;
    }
    
    public Listenelement add(Wahlkurs k) {
        nachfolger = nachfolger.add(k);
        return this;
    }
    
    public Listenelement hintenEinfuegen(WahlkursListe l) {
        nachfolger = nachfolger.hintenEinfuegen(l);
        return this;
    }
}