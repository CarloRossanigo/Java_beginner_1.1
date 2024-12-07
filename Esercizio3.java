import java.util.*;
public class  Esercizio3 {
    // Comparator per confrontare due oggetti Volo
// Confronta prima la data del volo, utilizzando il metodo compareTo() della classe Data.
// Se le date sono uguali, confronta il codice del volo (codice alfanumerico).
public static class CmpPerVoli implements Comparator<Volo> {
    @Override
    public int compare(Volo v1, Volo v2) {
        // Confronta prima la data dei voli
        if ((v1.getData()).compareTo(v2.getData()) == 0)
            // Se le date sono uguali, confronta il codice del volo
            return (v1.getCodice()).compareTo(v2.getCodice());
        // Altrimenti, restituisce il confronto tra le date
        return (v1.getData()).compareTo(v2.getData());
    }
}
    public static void main(String[] args)  {
	
       Passeggero pA = new Passeggero( "Alberto", "Rossi");
       Passeggero pAbis = new Passeggero( "Alberto", "Rossi");
       Passeggero pAter = new PasseggeroPremium( "Alberto", "Rossi");
       Passeggero pB = new Passeggero( "Barbara", "Verdi");
       Passeggero pC = new PasseggeroPremium( "Carlo", "Bianchi");
       Passeggero pD = new PasseggeroPremium( "Donatella", "Bianchi");
       Passeggero pE = new Passeggero( "Elisa", "Verdi");
       Passeggero pF = new Passeggero( "Fabio", "Verdi");
       GestoreVoli gv = new GestoreVoli();
       Volo v1_1 = new Volo( "V1", 6, 7, 2023,20);
       Volo v1_2 = new Volo( "V1", 10, 1, 2024,30);
       Volo v2_1 = new Volo( "V2", 6, 7, 2023,25);
       Volo v2_2 = new Volo( "V2", 13, 10, 2023,20);
       Volo v3_1 = new Volo( "V3", 6, 7, 2023,10);
       Volo v3_2 = new Volo( "V3", 13, 10, 2023,40);
       Volo v4 = new Volo( "V4", 5, 12, 2023,102);
       gv.add( v1_1 );
       gv.add( new Volo(  "V1", 6, 7, 2023, 40  ) ); // non aggiunto (duplicato)
       gv.add(v1_2);
       gv.add(v2_1);
       gv.add(v2_2);
       gv.add(v3_1);
       gv.add(v3_2);
       gv.add(v1_1, pA);
       gv.add(v1_1, pAbis);  // non aggiunto (pA e pAbis sono la stessa persona)
       gv.add(v1_1, pAter);  // non aggiunto (pA e pAter sono la stessa persona)
       gv.add(v1_1, pB);
       gv.add(v1_1, pC);
       gv.add(v1_1, pD);
       gv.add(v1_1,pD);
       gv.add(v1_1,pC);
       gv.add(v2_1, pA);
       gv.add(v2_1, pC);
       gv.add(v3_1, pB);
       gv.add(v3_1, pC);
       gv.add(v3_1, pD);
       gv.add(v3_2, pD);
       gv.add(v3_2,pE);
       gv.add(v3_2,pF);
       gv.add(v4,pC);  // non aggiunto (il volo v4 non e’ nel gestore)
       gv.add(v4);
       gv.add(v4,pA);
       gv.add(v4,pB);
       gv.add(v4,pE);
       gv.add(v4,pF);
       
       gv.add(v1_2,pD);
       gv.add(v1_2,pC);
      
       PasseggeroPremium.setBonus(40);
       gv.add(v2_2,pC);
       gv.add(v4,pD);
       // **** FINE INSERIMENTO VOLI ****
       List<Volo> lV=gv.listaVoli();
       Collections.sort(lV,new CmpPerVoli());
       System.out.println("=======   ELENCO VOLI (ORDINE CRONOLOGICO)   ======");
       for(Volo v:lV)
	   System.out.println(v.toString("SENZA PUNTI E PASSEGGERI"));
    } // end main
} //end class
