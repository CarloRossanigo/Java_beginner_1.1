import java.util.*;

public class Volo {
    private String codice;              // Codice del volo
    private Data data;                  // Data del volo
    private int punt;                   // Punti assegnati per il volo
    private List<Passeggero> listaP;    // Lista dei passeggeri

    // Costruttore con codice volo, data e punti
    public Volo(String cod, Data d, int punt) {
        this.codice = cod;
        this.data = d;
        this.punt = punt;
        this.listaP = new ArrayList<Passeggero>();  // Inizializza la lista dei passeggeri
    }

    // Costruttore con codice volo, giorno, mese, anno e punti
    public Volo(String cod, int g, int m, int a, int punt) {
        this(cod, new Data(g, m, a), punt);  // Richiama il costruttore principale con la data
    }

    // Metodo per aggiungere un passeggero al volo
    public boolean add(Passeggero p) {
        if (!listaP.contains(p)) {  // Controlla se il passeggero non è già nella lista
            listaP.add(p);           // Aggiunge il passeggero alla lista
            p.addPunti(this.punt);   // Aggiunge i punti al passeggero
            return true;             // Aggiunta riuscita
        }
        return false;  // Il passeggero non è stato aggiunto (era già presente)
    }

    // Metodo toString per rappresentare il volo con i passeggeri e i punti
    @Override
    public String toString() {
        String s = "VOLO " + this.codice + " " + this.data.toString() + " Punti: " + this.punt + "\n";
        for (Passeggero p : this.listaP) {
            s += p.toString() + "\n";  // Aggiunge la rappresentazione di ciascun passeggero
        }
        return s;
    }

    // Confronto per uguaglianza tra due voli (data e codice devono essere uguali)
    public boolean equals(Volo o) {
        return this.data.equals(o.data) && this.codice.equals(o.codice);
    }

    @Override
    // Override del metodo equals per oggetti generici
    public boolean equals(Object o) {
        return o instanceof Volo && this.equals((Volo) o);
    }

    // Metodo che restituisce la lista dei passeggeri
    public List<Passeggero> getListaP() {
        return this.listaP;
    }

    // ES3: Metodi getter per la data e il codice del volo
    public Data getData() {
        return this.data;
    }

    public String getCodice() {
        return this.codice;
    }

    // Metodo toString senza i punti, solo data e codice volo
    public String toString(String aux) {
        return this.data.toString() + "--VOLO " + this.codice;
    }
}//end class
