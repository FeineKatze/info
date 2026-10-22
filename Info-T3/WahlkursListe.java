public class WahlkursListe
{
    private Listenelement anfang;
    
    public WahlkursListe() {
        anfang = new Abschluss();
    }
    
    public int anzahlKurseGeben(String fachgebiet) {
        return anfang.anzahlKurseGeben(fachgebiet);
    }
    
    public void zuKleineKurseLoeschen(int minTeilnehmerzahl) {
        anfang = anfang.zuKleineKurseLoeschen(minTeilnehmerzahl);
    }
    
    public void add(Wahlkurs k) {
        anfang = anfang.add(k);
    }
    
    public void hintenEinfuegen2(WahlkursListe l) {
        Listenelement a = l.anfang;
        while (a instanceof Knoten) {
            this.add(((Knoten) a).kurs);
            a = a.getNach();
        }
    }
    
    public void hintenEinfuegen(WahlkursListe l) {
        anfang = anfang.hintenEinfuegen(l);
    }
    
    public Listenelement anfangGeben() {return anfang;}
}