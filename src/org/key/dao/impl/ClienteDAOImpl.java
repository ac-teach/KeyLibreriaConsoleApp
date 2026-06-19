package org.key.dao.impl;

import org.key.model.Cliente;
import org.key.dao.ClienteDAO;

import java.util.List;

public class ClienteDAOImpl implements ClienteDAO{

    @Override
    public boolean insertar(Cliente cliente) {
        return false;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente buscar(long cui) {
        return null;
    }

    @Override
    public boolean actualizar(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminar(long cui) {
        return false;
    }
    
}
