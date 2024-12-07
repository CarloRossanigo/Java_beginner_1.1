public class Passeggero implements Comparable<Passeggero>{
    private String n;  // Nome del passeggero
    private String c;  // Cognome del passeggero
    private int punti; // Punti accumulati dal passeggero
    
    // Costruttore: inizializza nome, cognome e imposta i punti iniziali a 0
    public Passeggero(String nome, String cognome){
        this.n = nome;
        this.c = cognome;
        this.punti = 0;  // Imposta i punti iniziali a 0
    }

    // Aggiunge punti al passeggero
    public void addPunti(int n){
        this.punti += n;
    }

    // Restituisce i punti accumulati dal passeggero
    public int getPunti(){
        return this.punti;
    }

    // Metodo toString: restituisce una rappresentazione in formato stringa del passeggero
    @Override
    public String toString(){
        return this.n + "," + this.c + ",punti: " + this.punti;
    }

    // Metodo equals per confrontare due oggetti Passeggero
    public boolean equals(Passeggero o){
        return this.n.equals(o.n) && this.c.equals(o.c);
    }

    // Override di equals per l'oggetto generico
    @Override
    public boolean equals(Object o){
        return o instanceof Passeggero && this.equals((Passeggero) o);
    }

    // Metodo compareTo per confrontare due passeggeri (per cognome e nome)
    @Override
    public int compareTo(Passeggero o){
        return (this.c + this.n).compareTo(o.c + o.n);  // Confronta il cognome e poi il nome
    }
}//end class



