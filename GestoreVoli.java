import java.util.*;

public class GestoreVoli {
    private List<Volo> listaV;  // Lista dei voli gestiti dal sistema

    // Costruttore: inizializza la lista dei voli
    public GestoreVoli() {
        this.listaV = new ArrayList<Volo>();  // Crea una nuova lista di voli
    }

    // Metodo per aggiungere un volo alla lista se non è già presente
    public void add(Volo v) {
        if (!this.listaV.contains(v))  // Controlla se il volo non è già nella lista
            this.listaV.add(v);  // Aggiunge il volo alla lista
    }

    // Metodo per aggiungere un passeggero a un volo esistente
    public void add(Volo v, Passeggero p) {
        int index = this.listaV.indexOf(v);  // Trova l'indice del volo
        if (index != -1)  // Se il volo esiste nella lista
            v.add(p);  // Aggiunge il passeggero al volo
    }

    // Metodo toString: restituisce una rappresentazione testuale di tutti i voli
    @Override
    public String toString() {
        String s = "";
        for (Volo v : this.listaV)  // Per ogni volo nella lista
            s += v.toString() + "\n";  // Aggiunge la rappresentazione del volo alla stringa
        return s;
    }

    // ES2: Metodo per ottenere la lista di tutti i passeggeri
    public List<Passeggero> listaPasseggeri() {
        List<Passeggero> lP = new ArrayList<Passeggero>();  // Crea una lista per i passeggeri
        for (Volo v : this.listaV) {  // Per ogni volo
            List<Passeggero> aux = v.getListaP();  // Ottiene la lista dei passeggeri del volo
            for (Passeggero p : aux)  // Per ogni passeggero nel volo
                if (!lP.contains(p))  // Se il passeggero non è già nella lista
                    lP.add(p);  // Aggiunge il passeggero alla lista
        }
        return lP;  // Restituisce la lista dei passeggeri unici
    }

    // Metodo per ottenere la lista dei passeggeri non premium
    public List<Passeggero> listaPasseggeriRegolari() {
        List<Passeggero> lP = new ArrayList<Passeggero>();  // Lista dei passeggeri regolari
        for (Volo v : this.listaV) {  // Per ogni volo
            List<Passeggero> aux = v.getListaP();  // Ottiene la lista dei passeggeri del volo
            for (Passeggero p : aux)  // Per ogni passeggero
                if (!(lP.contains(p)) && !(p instanceof PasseggeroPremium))  // Se non è già nella lista e non è premium
                    lP.add(p);  // Aggiunge il passeggero regolare alla lista
        }
        return lP;  // Restituisce la lista dei passeggeri regolari
    }

    // ES3: Metodo per ottenere la lista di tutti i voli unici
    public List<Volo> listaVoli() {
        List<Volo> lV = new ArrayList<Volo>();  // Lista dei voli unici
        for (Volo v : this.listaV)  // Per ogni volo
            if (!(lV.contains(v)))  // Se il volo non è già presente
                lV.add(v);  // Aggiunge il volo alla lista
        return lV;  // Restituisce la lista dei voli unici
    }

} //end class
