import java.util.ArrayList;

public class Kunde extends Person{
  
  private String kundennummer;
  private ArrayList<Reisepaket> pakete = new ArrayList();

  public Kunde(String buergerID, String name, String nachname){
    super(buergerID, name, nachname);
  }

  public Kunde(String buergerID, String name, String nachname, String kundennummer){
    super(buergerID, name, nachname);
    this.kundennummer= kundennummer;
  }

  public Kunde(String buergerID, String name, String nachname, int alter){
    super(buergerID, name, nachname,alter);
    
  }

  public Kunde(String buergerID, String name, String nachname, int alter, String kundennummer){
    super(buergerID, name, nachname,alter);
    this.kundennummer= kundennummer;
  }

  public Kunde(String buergerID){
    super(buergerID);
  }

  public String getKundennummer() {
	  return this.kundennummer;
  }

  public void setKundennummer(String kundennummer) {
	  this.kundennummer = kundennummer;
  }
  
  
  public String toString(){
    String ki = getBuergerID() + ": " + getName() + " " + getNachname();
    return ki;
  }

  public void addPaket(Reisepaket paket){
    pakete.add(paket);
  }

  public ArrayList<Reisepaket> getPaket(){
    return this.pakete;
  }

  public void setPaket(ArrayList<Reisepaket> pakete) {
    this.pakete = pakete;
  }
}