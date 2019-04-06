package pl.wszib.model;


public class Samochód {

    private String marka;
    private String model;
    private Integer rocznik;
    private Double cena;
    private Double przebieg;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRocznik() {
        return rocznik;
    }

    public void setRocznik(Integer rocznik) {
        this.rocznik = rocznik;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(Double przebieg) {
        this.przebieg = przebieg;
    }
}
