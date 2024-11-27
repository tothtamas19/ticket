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

public class Store {
  public void doit(Incident i) throws Exception {
    FileWriter a = new FileWriter("incidents.txt");
    a.write(i.name + ":" + i.error + "\n");
    a.close();
  }
}
