/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {
  public void writeIncidentToFile(Incident incident) {
    try {
      tryWriteIncidentToFile(incident);
    } catch (Exception e) {
      System.err.println("HIBA! A fájl íréása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
  
  public void tryWriteIncidentToFile(Incident incident) throws IOException  {
    FileWriter fw = new FileWriter("incidents.txt");
    fw.write(incident.name + ":" + incident.message + "\n");
    fw.close();
  }
}
