import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        listaRezerwacji = new ArrayList<>();
    }
    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaRezerwacji = new ArrayList<>();
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie){
        listaRezerwacji.add(wydarzenie);
    }

    public void wyswietlRezerwacje(){
        System.out.println("Rezerwacje klienta " + imie + " " + nazwisko + ":");
        for (Wydarzenie wydarzenie : listaRezerwacji) {
            System.out.println(wydarzenie.toString());
        }
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie){
        listaRezerwacji.remove(wydarzenie);
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }
    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }
}

