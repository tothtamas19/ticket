/*
* File: Console.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.util.Scanner;

public class Console {

  public void startApp(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bejelentő neve: ");
    String name = scanner.nextLine();

    System.out.print("Hiba leírása: ");
    String message = scanner.nextLine();

    Store store = new Store();
    Incident incident = new Incident();
    incident.name = name;
    incident.message = message;
  

    try {
      store.tryWriteIncidentToFile(incident);
    } catch (Exception e) {
      System.out.println(name + " hiba leírt: " + message);
    }
    scanner.close();
  }
}
