public abstract class Person{

  private String name;
  private String nachname;
  private String buergerID;
  private int alter;
  
  public Person(String buergerID){
    this.buergerID = buergerID;
  }

  public Person (String buergerID, String name, String nachname){
    this.buergerID= buergerID;
    this.name= name;
    this.nachname = nachname;
  }

  public Person(String buergerID, String name, String nachname, int alter){
    this.buergerID= buergerID;
    this.name= name;
    this.nachname= nachname;
    this.alter= alter;
  }

  public void setPersonendaten(String buergerID, String name, String nachname, int alter){
    this.buergerID= buergerID;
    this.name= name;
    this.nachname=nachname;
    this.alter=alter;
  }

  public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getBuergerID() {
		return this.buergerID;
	}

	public void setBuergerID(String buergerID) throws BadBuergerIDFormatException {
		if(checkBuergerID(buergerID) ==true){
      this.buergerID = buergerID;
    }else{
      throw new BadBuergerIDFormatException("ada");
    }
	}

	public int getAlter() {
		return this.alter;
	}

	public void setAlter(int alter) {
    if(alter >= 0 && alter <= 120){
      this.alter = alter;
    }	
    else{
      System.out.println("Alter ist nicht zwischen 0 und 120");
    }
	}

  public void printAlter(){
    System.out.println(this.alter);
  }

  public void printInfo(){
    System.out.println("name: " + name);
    System.out.println("nachname: " + nachname);
    System.out.println("buerger id: " + buergerID);
    System.out.println("alter: " + alter);
  }

  public static boolean checkBuergerID(String b){
    if(b.length() == 7){
          if(b.charAt(0) != '0' && Character.isDigit(b.charAt(0)) && Character.isDigit(b.charAt(1)) && Character.isDigit(b.charAt(3)) && Character.isDigit(b.charAt(3)) && Character.isDigit(b.charAt(4)) && Character.isDigit(b.charAt(5)) && Character.isDigit(b.charAt(6))){
            
            return true;
          }else{
            System.out.println("BuergerID muss aus Ziffern bestehen und darf nicht mit einer 0 beginnen");
            return false;
          }
    }else{
      System.out.println("BuergerID muss 7-stellig sein.");
      return false;
    }
  }

  public static boolean checkName(String n) {
    if(n.length() >= 2){
      for(int i=0; i < n.length(); i++) {
        if(Character.isLetter(n.charAt(i)) == true || n.charAt(i) == '.' || n.charAt(i) == ' '){
          
        }else{
          System.out.println("Zeichen darf nur aus Buchstaben, Punkt oder Leerzeichen bestehen.");
          return false;
        }
      }
      return true;
    }else{
      System.out.println("Namen müssen eine Länge von mindestens 2 haben");
      return false;
    }
  }
  
  public static boolean checkNachname(String nn){
    if(nn.length() >= 2){
      return true;
    }else{
      System.out.println("Nachnamen müssen eine Länge von mindestens 2 haben");
      return false;
    }
  }
  
  @Override
  public boolean equals(Object obj){
    if(obj instanceof Person){
      Person m = (Person) obj;
      if(getBuergerID().equals(m.getBuergerID())){
        return true;
      }
    }
    return false;
  }
  
}