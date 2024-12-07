public class PasseggeroPremium extends Passeggero {
    private static int bonus = 10;  // Bonus punti che viene aggiunto quando il passeggero raggiunge 100 punti
    private boolean assegnato;      // Variabile ausiliaria che indica se il bonus è già stato assegnato

    // Costruttore: inizializza il passeggero premium con nome, cognome e assegna assegnato a false
    public PasseggeroPremium(String nome, String cognome){
        super(nome, cognome);  // Chiama il costruttore della classe padre Passeggero
        this.assegnato = false; // Imposta assegnato come false (il bonus non è stato ancora dato)
    }

    // Metodo statico per modificare il valore del bonus
    public static void setBonus(int n){
        bonus = n;  // Imposta un nuovo valore per il bonus
    }

    // Override di addPunti per aggiungere il bonus se i punti superano 100
    @Override
    public void addPunti(int n){
        super.addPunti(n);  // Aggiungi i punti al passeggero (comportamento normale)

        // Se i punti superano 100 e il bonus non è stato assegnato, aggiungi il bonus
        if(this.getPunti() >= 100 && !this.assegnato){
            super.addPunti(bonus);  // Aggiungi il bonus
            this.assegnato = true;   // Imposta assegnato a true per evitare di aggiungere il bonus nuovamente
        }
    }

    // Override di toString per aggiungere "*Premium*" alla stringa di rappresentazione
    @Override
    public String toString(){
        return super.toString() + " *Premium*";  // Aggiunge l'etichetta "Premium" alla rappresentazione del passeggero
    }
}//end class
