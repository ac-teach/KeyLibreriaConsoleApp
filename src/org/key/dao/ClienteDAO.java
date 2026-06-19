
package org.key.dao;

import java.util.List;
import org.key.model.Cliente;

public interface ClienteDAO {
    //firmas de metodos
    //CRUD
    boolean insertar(Cliente cliente);
    List<Cliente> listar();
    Cliente buscar(long cui);
    boolean actualizar(Cliente cliente);
    boolean eliminar(long cui);
    
}
