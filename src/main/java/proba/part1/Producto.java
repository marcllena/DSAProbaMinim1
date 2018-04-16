package proba.part1;

public class Producto {

    String nom;
    int preu;
    int vendas;

    public Producto(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
        this.vendas = 0;
    }

    //Necesitem un ConstructorBuit pel JSON
    public Producto(){
    };
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int compareTo(Producto in){
        if(this.preu>= in.preu)
            return 0;
        else
            return -1;
    }
}
