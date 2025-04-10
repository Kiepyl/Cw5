import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Klient> klientLista = new ArrayList<>();
    private ArrayList<Wydarzenie> wydarzenieLista = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie){
        this.wydarzenieLista.add(wydarzenie);
    }
    public void dodajWydarzenie(ArrayList<Wydarzenie> wydarzenie){
        this.wydarzenieLista.addAll(wydarzenie);
    }

    public void dodajKlienta(Klient klient){
        this.klientLista.add(klient);
    }
    public void dodajKlienta(ArrayList<Klient> klient){
        this.klientLista.addAll(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie){
        klient.dodajRezerwacje(wydarzenie);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa){
        for (Wydarzenie wydarzenie : wydarzenieLista) {
            if (wydarzenie.getNazwa().equals(nazwa)) {
                return wydarzenie;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String nazwisko){
        for (Klient klient : klientLista) {
            if (klient.getNazwisko().equals(nazwisko)) {
                return klient;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double cena){
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        wydarzenie.setCena(cena);
    }
}