public class Abschluss implements Listenelement
{
    public Abschluss() {
        
    }
    
    public int anzahlKurseGeben(String fachgebiet) {
        return 0;
    }
    
    public Listenelement zuKleineKurseLoeschen(int minTeilnehmerzahl) {
        return this;
    }
    
    public void setNach(Listenelement l) {
        
    }
    
    public Listenelement getNach() {
        return null;
    }
    
    public Listenelement add(Wahlkurs k) {
        Knoten kNeu = new Knoten(k);
        kNeu.nachfolger = this;
        return kNeu;
    }
    
    public Listenelement hintenEinfuegen(WahlkursListe l) {
        return l.anfangGeben();
    }
}