public interface Listenelement
{
    public abstract int anzahlKurseGeben(String fachgebiet);
    public abstract Listenelement zuKleineKurseLoeschen(int minTeilnehmerzahl);
    public abstract Listenelement add(Wahlkurs k);
    public abstract void setNach(Listenelement l);
    public abstract Listenelement getNach();
    public abstract Listenelement hintenEinfuegen(WahlkursListe l);
}