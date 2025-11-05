import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")  //Define que todas las rutas REST comenzarán con /api.
public class RestApplication extends Application {   //Activa el sistema de servicios web REST sin configuración adicional.