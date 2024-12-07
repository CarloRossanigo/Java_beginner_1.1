import java.util.*;
public class  Esercizio2 {
// Comparator per confrontare due oggetti Passeggero in base ai punti
// Confronta prima i punti del passeggero in ordine decrescente.
// Se i punti sono uguali, confronta il passeggero in ordine alfabetico (secondo il metodo compareTo() di Passeggero).
public static class CmpPerpunti implements Comparator<Passeggero> {
    @Override
    public int compare(Passeggero p1, Passeggero p2) {
        // Confronta prima i punti in modo decrescente
        if (Integer.compare(p1.getPunti(), p2.getPunti()) == 0)
            // Se i punti sono uguali, confronta il passeggero in ordine alfabetico
            return p1.compareTo(p2);
        // Restituisce il confronto dei punti in ordine decrescente
        return -Integer.compare(p1.getPunti(), p2.getPunti());
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
       List<Passeggero> listaTot=gv.listaPasseggeri();
       List<Passeggero> listaP=gv.listaPasseggeriRegolari();
       Collections.sort(listaTot);
       Collections.sort(listaP);
       //ordine alfabetico totale
       System.out.println("=======   ELENCO PASSEGGERI (ORDINE ALFABETICO) ======");
       
       for(Passeggero p:listaTot)
	   System.out.println(p.toString());

        //ordine comparatore totale
       Collections.sort(listaTot,new CmpPerpunti());
        System.out.println("=======   ELENCO PASSEGGERI (ORDINE PER PUNTI DECRESCENTE)  ======");
	for(Passeggero p:listaTot)
	   System.out.println(p.toString());

        //ordine alfabetico regolari
       System.out.println("=======   ELENCO PASSEGGERI REGOLARI (ORDINE ALFABETICO) ======");
       for(Passeggero p:listaP)
	   System.out.println(p.toString());
    } // end main
} //end class
