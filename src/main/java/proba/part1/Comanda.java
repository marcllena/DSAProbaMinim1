package proba.part1;

public class Comanda {
    int cantitat;
    Producto producte;

    public Comanda(Producto producte, int cantitat) {
        this.cantitat = cantitat;
        this.producte = producte;
    }
    public Comanda(){};

    public int getCantitat() {
        return cantitat;
    }

    public void setCantitat(int cantitat) {
        this.cantitat = cantitat;
    }

    public Producto getProducte() {
        return producte;
    }

    public void setProducte(Producto producte) {
        this.producte = producte;
    }

    @Override
    public String toString() {
        return "Producte: "+producte.getNom() + " Cantitat: "+cantitat;
    }
}
