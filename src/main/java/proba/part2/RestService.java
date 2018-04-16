package proba.part2;

import proba.part1.*;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("service")
public class RestService {

    ProductManagerImpl productManager;

    public RestService(){
        productManager = productManager.getInstance();
    }


    //Apart de les funcions demanades implemento:
    @POST
    @Path("/nouprod")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response afagirProducte(Producto producto)
    {
        productManager.afagirProducte(producto);
        return Response.status(200).build();
    }

    @GET
    @Path("/nou/{nom}")
    @Produces(MediaType.TEXT_HTML)
    public Response afagirUsuari(@PathParam("nom") String nom)
    {
        productManager.afagirUsuari(new Usuario(nom));
        return Response.status(200).build();
    }

    //Funcions Demanades
    @GET
    @Path("/prodpreu")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> llistatProductesPreu(){
        return productManager.llistatProductesPreu();
    }

    @GET
    @Path("/prodventes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> llistatProductesVentes(){
        return productManager.llistatProductesVentes();
    }

    @POST
    @Path("/pedido/{nom}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response realitzarPedido(Comanda[] comandes,@PathParam("nom") String nom){
        int res =productManager.realitzarPedido(comandes,nom);
        if(res==0)
            return Response.status(200).build();
        else
            return Response.status(204).entity("No existeix el producte").build();
    }

    @GET
    @Path("/servir")
    @Produces(MediaType.TEXT_HTML)
    public Response servirPedido(){
        int res = productManager.servirPedido();
        switch (res){
            case 0: return Response.status(200).build();
            case -1: return Response.status(204).entity("No existeix el producte").build();
            default: return Response.status(204).entity("Cap pedido per servir").build();
        }
    }

    @GET
    @Path("/llistapedidos/{nom}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comanda>  llistatPedidosRealitzats(@PathParam("nom") String nom){
        return productManager.llistatPedidosRealitzats(nom);
    }

}
