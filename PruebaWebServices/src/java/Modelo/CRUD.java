    
package Modelo;

import java.util.List;

public interface CRUD {
    
    public List listar();
    public Usuario listarId(int id);
    public String add (String nombre,String clave);
    public String editar(int id,String nombre , String clave);
    public Usuario eliminar (int id);
}
