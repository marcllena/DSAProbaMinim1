package proba.part1;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    String nombre;
    List<Comanda> pedidosRealizados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        pedidosRealizados= new LinkedList<Comanda>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Comanda> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void afegirPedido(Comanda[] nuevosPedidos) {
        for(int i=0; i<nuevosPedidos.length;i++)
        {
            this.pedidosRealizados.add(nuevosPedidos[i]);
        }
    }
}
