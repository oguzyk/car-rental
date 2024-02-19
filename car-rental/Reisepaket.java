public class Reisepaket {

  private String paketID;
  private String destination;
  private String datum;
  private int dauer;
  private double preis;
  private String paketnummer;

  public Reisepaket(String paketID, String destination, String datum, int dauer, double preis, String paketnummer){
    this.paketID = paketID;
    this.destination = destination;
    this.datum = datum;
    this.dauer = dauer;
    this.preis = preis;
    this.paketnummer = paketnummer;
  }

  public Reisepaket(String paketID){
    this.paketID = paketID;  
  }

  public String getPaketID(){
    return this.paketID;
  }

  public void setPaketID(String paketID){
    this.paketID = paketID;
  }

  public String getDestination(){
    return this.destination;
  }

  public void setDestination(String destination){
    this.destination = destination;
  }

  public String getDatum(){
    return this.datum;
  }

  public void setDatum(String datum){
    this.datum = datum;
  }

  public int getDauer(){
    return this.dauer;
  }

  public void setDauer(int dauer){
    this.dauer = dauer;
  }

  public double getPreis(){
    return this.preis;
  }

  public void setPreis(double preis){
    this.preis = preis;
  }

  public String getPaketnummer(){
    return this.paketnummer;
  }

  public void setPaketnummer(String paketnummer){
    this.paketnummer = paketnummer;
  }

  public String toString(){
    String inf = getPaketnummer() + " : " + getPaketID() + " , " + getDestination() + " " + getDatum() + " " + getDauer() + " " + getPreis();
    return inf;
  }

  @Override
  public boolean equals(Object o){       //type casting 
    if(o instanceof Reisepaket){
      Reisepaket rpi = (Reisepaket) o;
      if(getPaketID().equals(rpi.getPaketID())){
        return true;
      }
    }
    return false;
  }
}