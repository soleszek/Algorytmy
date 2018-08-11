package Zad3;

public class Osoby {
    private String imie;
    private Long stanKonta;

    public Osoby(String imie, Long stanKonta) {
        this.imie = imie;
        this.stanKonta = stanKonta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Long getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(Long stanKonta) {
        this.stanKonta = stanKonta;
    }
}
