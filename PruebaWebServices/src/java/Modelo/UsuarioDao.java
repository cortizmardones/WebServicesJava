
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conexion = new Conexion();

    @Override
    public List listar(){
        List<Usuario> lista = new ArrayList<>();
        String sql = "select * from usuario";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("user"));
                usuario.setPass(rs.getString("pass"));
                lista.add(usuario);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Usuario listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String nombre, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String editar(int id, String nombre, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
