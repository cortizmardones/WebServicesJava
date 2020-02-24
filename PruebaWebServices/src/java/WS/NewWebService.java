
package WS;

import java.util.List;
import Modelo.Usuario;
import Modelo.UsuarioDao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "NewWebService")
public class NewWebService {
    
    UsuarioDao usuarioDao = new UsuarioDao();
 
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "Listar")
    public List<Usuario> Listar() {
        List datos = usuarioDao.listar();
        return datos;
    }
}
