import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/mensaje")   //Define que el servicio estará en http://localhost:8080/cesar-webapp/api/mensaje.

public class MensajeSource {

    @GET    //Define una operación REST para obtener datos.
    @Produces(MediaType.APPLICATION_JSON)  //Indica que la respuesta será JSON.
    public Mensaje getMensaje() {
        return new Mensaje("¡Hola desde Jakarta EE!"); //Crea un mensaje y lo devuelve.
    }
}
