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

  /*
   * A be() függvény indítja a bekérést,
   * és a tárolást.
   */
  public void be(){
    Scanner b = new Scanner(System.in);
    System.out.print("Bejelentő neve: ");
    String da = b.nextLine();
    System.out.print("Hiba leírása: ");
    //A la a hiba szövege
    String la = b.nextLine();
    Store a = new Store();
    Incident i = new Incident();
    i.name = da;
    i.error = la;

    /*
     * Hibakezelő rész, ami fájlbaírás
     * műveletnél használt FileWriter 
     * esetleges hibáját kezeli. A FileWriter
     * az java.io csomagban van. A kivétel
     * amit dob: IOException.
     */
    
    try {
      a.doit(i);
    } catch (Exception e) {
      System.out.println(da + " hiba leírt: " + la);
    }
    b.close();
  }
}
