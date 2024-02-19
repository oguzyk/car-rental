import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;

public class Main {

  public static void main(String[] args) {

    ArrayList<Mitarbeiter> mitarbeiter = new ArrayList();
    ArrayList<Kunde> kunden = new ArrayList();
    ArrayList<Reisepaket> pakete = new ArrayList();
    
    Scanner sc = new Scanner(System.in);

    int operation = 0;
    while (operation != 100) {

      System.out.println("Welche Operation moechten Sie durchfuehren?");
      System.out.println("  1- Mitarbeiter hinzufuegen");
      System.out.println("  2- Mitarbeiter auflisten");
      System.out.println("  3- Mitarbeiter suchen");
      System.out.println("  4- Kunden hinzufuegen");
      System.out.println("  5- Kunden auflisten");
      System.out.println("  6- Kunde suchen");
      System.out.println("  7- Reisepaket hinzufuegen");
      System.out.println("  8- Alle Reisepakete auflisten");
      System.out.println("  9- Reisepaket suchen");
      System.out.println("  10- Reisepaketpreis aendern");
      System.out.println("  11- Reisepaket an Kunden verkaufen");
      System.out.println("  12- Alle Reisepakete eines Kunden auflisten");
      System.out.println("  100 - Programm beenden");

      try{
        operation = sc.nextInt(); sc.nextLine();
        
      }catch(InputMismatchException exc){
        System.out.println("Bitte geben Sie eine gueltige Option ein.");
        sc.nextLine();
      }catch(Exception e){
        System.out.println("Bitte geben Sie eine gueltige Option ein.");
        sc.nextLine();
      }
      
      if (operation == 1) {
        System.out.println("Bitte geben Sie ihre 7 stellige BuergerID ein: ");
        String b = sc.nextLine();
        
        if(Person.checkBuergerID(b) == true){
          System.out.println("Bitte geben Sie ihre Namen ein: ");
          String n = sc.nextLine();
          
          if(Person.checkName(n) == true){
            System.out.println("Bitte gebe Sie ihre Nachnamen ein: ");
            String nn = sc.nextLine();
            
            if(Person.checkNachname(nn) == true){
              Mitarbeiter m = new Mitarbeiter(b, n, nn, String.valueOf(mitarbeiter.size() + 1));
              mitarbeiter.add(m);
            }
          }
        }
      }else if (operation == 2) {

        for(int i = 0;i< mitarbeiter.size();i = i+1){
          System.out.println(mitarbeiter.get(i));
        }
    
      } else if (operation == 3){
        System.out.println("Bitte geben Sie einen BuergerID ein:");
        String sm = sc.nextLine();

        int index = mitarbeiter.indexOf(new Mitarbeiter(sm));
        if(index == -1){
          System.out.println("Person konnte nicht gefunden werden.");
        }else {
          System.out.println(mitarbeiter.get(index));
        }
        
      }else if (operation == 4) {
        System.out.println("Bitte geben Sie ihre 7 stellige BuergerID ein: ");
        String bb = sc.nextLine();
        
        if(Person.checkBuergerID(bb) == true){
          System.out.println("Bitte geben Sie ihre Namen ein: ");
          String nm = sc.nextLine();
          
          if(Person.checkName(nm) == true){
            System.out.println("Bitte geben Sie ihre Nachnamen ein: ");
            String nnm = sc.nextLine();
            
            if(Person.checkNachname(nnm) == true){
              System.out.println("Bitte geben Sie ihre Alter ein:");
              int alt = sc.nextInt();
              Kunde k = new Kunde(bb,nm,nnm,alt,String.valueOf(kunden.size() +1));
              kunden.add(k);
            }
          }
        }
      }else if (operation == 5){
        for(int i = 0;i< kunden.size();i = i+1){
          System.out.println(kunden.get(i));   //.toString()
        }
      }else if (operation == 6){
        System.out.println("Bitte geben Sie einen BuergerID ein:");
        String sk= sc.nextLine(); 

        int index = kunden.indexOf(new Kunde(sk));
        if(index == -1){
          System.out.println("Person konnte nicht gefunden werden.");
        }else {
          System.out.println(kunden.get(index));
        }
      }else if (operation == 7){
        System.out.println("Bitte geben Sie einen PaketID ein: ");
        String pı = sc.nextLine();
        
        System.out.println("Bitte geben Sie eine Destination ein: ");
        String ds = sc.nextLine();
          
        System.out.println("Bitte geben Sie einen Datum ein: ");
        String dm = sc.nextLine();
            
        System.out.println("Bitte geben Sie einen Dauer ein:");
        int du = sc.nextInt();

        System.out.println("Bitte geben Sie Preis ein:");
        double pr = sc.nextDouble();
        Reisepaket r = new Reisepaket(pı,ds,dm,du,pr,String.valueOf(pakete.size() +1));
        pakete.add(r);
            
      }else if (operation == 8){
        for(int i = 0;i< pakete.size();i = i+1){
          System.out.println(pakete.get(i));   
        }
      }else if (operation == 9){
        System.out.println("Bitte geben Sie einen PaketID ein:");
        String pus= sc.nextLine(); 

        int index = pakete.indexOf(new Reisepaket(pus));
        if(index == -1){
          System.out.println("Reisepaket konnte nicht gefunden werden.");
        }else {
          System.out.println(pakete.get(index));
        }
      }else if (operation == 10){
        System.out.println("Bitte geben Sie einen paketID ein:");
        String pıds= sc.nextLine();

        int index1 = pakete.indexOf(new Reisepaket(pıds));
        if(index1 == -1){
          System.out.println("Reisepaket konnte nicht gefunden werden");
        }else{
          System.out.println(pakete.get(index1));
          System.out.println("Bitte geben Sie neuen preis geben:");
          double prs = sc.nextDouble();
          pakete.get(index1).setPreis(prs);
          System.out.println(pakete.get(index1));
        }
      }else if (operation == 11){
        System.out.println("Bitte geben Sie die BuergerID des Kunden ein:");
        String bıds= sc.nextLine();
  
        System.out.println("Bitte geben Sie die ID des Reisepakets ein:");
        String rpıds= sc.nextLine();
        
        int index2 = kunden.indexOf(new Kunde(bıds));
        if(index2 >= 0){
          Kunde nk = kunden.get(index2);
          index2 = pakete.indexOf(new Reisepaket(rpıds));
          if(index2 >= 0){
            Reisepaket nrp = pakete.get(index2);
            nk.addPaket(nrp);
          } else {
            System.out.println("Reisepaket konnte nicht gefunden werden");
          }
        }else{
          System.out.println("Kunde konnte nicht gefunden werden");
        }
        
      }else if (operation == 12){
        System.out.println("Bitte geben Sie die BuergerID des Kunden ein:");
        String buds= sc.nextLine();

        int index3 = kunden.indexOf(new Kunde(buds));
        Kunde klm = kunden.get(index3);
        for(int i = 0;i< klm.getPaket().size();i = i+1){
          System.out.println(klm.getPaket().get(i));   
        }
      }
    }
  }
}