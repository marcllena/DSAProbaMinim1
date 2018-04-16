package proba.part1;

import java.util.List;

public interface ProductManager {
    public List<Producto> llistatProductesPreu();
    public List<Producto> llistatProductesVentes();
    public int realitzarPedido(Comanda[] comandes, String usuari);
    public int servirPedido();
    public List<Comanda> llistatPedidosRealitzats(String usuari);

}
