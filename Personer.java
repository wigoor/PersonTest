public class Personer {
    private String förnamn;
    private String efternamn;
    private String personnummer;
    private String kön;
    private String längd;

    public void setPerson(String förnamn, String efternamn, String personnummer, String kön, String längd) {
        this.förnamn = förnamn;
        this.efternamn = efternamn;
        this.personnummer = personnummer;
        this.kön = kön;
        this.längd = längd;

    }

    public String getPerson() {
        return "Namn: " + förnamn + " " + efternamn + "\n Personnummer: " + personnummer + "\n Kön: " + kön + "\n Längd: " + längd;
    }


    public String getFörnamn() {
        return förnamn;
    }

    public void setFörnamn(String förnamn) {
        this.förnamn = förnamn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getKön() {
        return kön;
    }

    public void setKön(String kön) {
        this.kön = kön;
    }

    public String getLängd() {
        return längd;
    }

    public void setLängd(String längd) {
        this.längd = längd;
    }
}
