package org.key.dao.impl;

import java.util.ArrayList;
import org.key.model.Cliente;
import org.key.dao.ClienteDAO;

import org.key.util.Conexion;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAOImpl implements ClienteDAO{

     @Override
    public List<Cliente> listarTodos() {
        //crear lista
        List<Cliente> clientes = new ArrayList<>();//null
        //crear nustras consulta
        String consulta = "{call sp_listarclientes()}";
        //maperar el resultado de la consulta a objeto y lo agregamos a la lista
        //try with resources / intentar con recursos --> cierra el recurso al completar el intento
        //recurso: Conexion, al final se cierra
        try (Connection conexion = Conexion.getInstancia().conectar();
                CallableStatement consultaCall = conexion.prepareCall(consulta);
                ResultSet tablaResultado = consultaCall.executeQuery();) {
            //ciclo para rellenar mi lista
            //verificar cada filta del result set
            //va a guarda cada celda dentro de cada atributo de mi objeto
            while (tablaResultado.next()) {
                clientes.add(new Cliente(
                        tablaResultado.getLong("cui"),
                        tablaResultado.getString("nombre_cliente"),
                        tablaResultado.getString("apellido_cliente"),
                        tablaResultado.getString("correo_electronico")
                ));
            }
         } catch (SQLException e) {
             System.err.print("Error al listar Clientes: " + e.getMessage());
         }
        
        //retornamos un alista
        return clientes;
    }
    
    @Override
    public boolean crear(Cliente cliente) {
        return false;
    }

   

    @Override
    public Cliente buscarPorId(long cui) {
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
