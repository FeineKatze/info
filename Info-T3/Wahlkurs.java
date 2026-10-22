public class Wahlkurs
{
    String name;
    int teilnehmerzahl;
    String lehrkraft;
    String fachgebiet;
    
    public Wahlkurs(String name, int teilnehmerzahl, String lehrkraft, String fachgebiet) {
        this.name = name;
        this.teilnehmerzahl = teilnehmerzahl;
        this.lehrkraft = lehrkraft;
        this.fachgebiet = fachgebiet;
    }
    
    public boolean fachgebieIstGleich(String fachgebiet) {
        return false;
    }
}