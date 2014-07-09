/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Entidad.Profesor;
import java.sql.*;


/**
 *
 * @author gianco
 */
public class UsuarioDao {
    
    public boolean isUser(String nombre,String apellido){
        String consulta = String.format("SELECT * FROM Profesor WHERE Nombre = %d AND Apellidos = %s",nombre,apellido);
        boolean existe = false;
        try{
            Conexion.con = Conexion.conectar();
            Conexion.statement = Conexion.con.createStatement();
            ResultSet rs = Conexion.statement.executeQuery(consulta);
            while(rs.next()){
                existe = true;
            }
            rs.close();
            Conexion.statement.close();
            Conexion.con.close();
        }catch(Exception ex){}

        return existe;
    }
}