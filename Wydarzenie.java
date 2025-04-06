public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

    public void wyswietlinfo(String nazwa, double cena) {
        System.out.println(nazwa + cena);
    }
    public void wyswietlinfo(String nazwa, double cena, String data) {
        System.out.println(nazwa + cena + data);
    }
    public void wyswietlinfo(String nazwa, double cena, String data, String miejsce) {
        System.out.println(nazwa + cena + data + miejsce);
    }
    public String toString(){

    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}