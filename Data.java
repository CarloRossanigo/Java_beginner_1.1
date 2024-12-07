public class Data implements Comparable<Data>{
    private int g;  // Giorno
    private int m;  // Mese
    private int a;  // Anno
    
    // Costruttore: inizializza giorno, mese e anno
    public Data(int g, int m, int a){
        this.g = g;
        this.m = m;
        this.a = a;
    }

    // Metodo toString: restituisce una rappresentazione in formato stringa della data
    @Override
    public String toString(){
        return "Data : " + this.g + "/" + this.m + "/" + this.a;
    }

    // Metodo equals per confrontare due oggetti Data
    public boolean equals(Data o){
        return this.g == o.g && this.m == o.m && this.a == o.a;
    }

    // Override di equals per l'oggetto generico
    @Override
    public boolean equals(Object o){
        return o instanceof Data && this.equals((Data) o);
    }

    // Metodo compareTo per comparare due date
    @Override
    public int compareTo(Data d){
        // Primo confronto sull'anno
        if (this.a == d.a){
            // Se gli anni sono uguali, confronto il mese
            if (this.m == d.m)
                // Se mese è uguale, confronto il giorno
                return Integer.compare(this.g, d.g);
            return Integer.compare(this.m, d.m);
        }
        // Se gli anni sono diversi, confronto l'anno
        return Integer.compare(this.a, d.a);
    }
     
}//end class



