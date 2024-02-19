public class Mitarbeiter extends Person {
  
  private String personalnummer;

  public Mitarbeiter(String buergerID){
    super(buergerID);
  }

  public Mitarbeiter(String buergerID, String name, String nachname, String personalnummer){
    super(buergerID,name,nachname);
    this.personalnummer=personalnummer;
  }

  public String getPersonalnummer() {
	  return this.personalnummer;
  }

  public void setPersonalnummer(String personalnummer) {
	  this.personalnummer = personalnummer;
  }  

  public String toString(){
    String mi = getBuergerID() + ": " + getName() + " " + getNachname();
    return mi;
  }
}