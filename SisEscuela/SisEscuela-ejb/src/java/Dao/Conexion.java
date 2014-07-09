/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.sql.*;
/**
 *
 * @author ruddy
 */
public class Conexion {
    public static Connection con;
    public static Statement statement;
    
    public static Connection conectar(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor="jdbc:mysql://localhost/Colegio";
            String usuarioDB="root";
            String passwordDB="helsinky";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }catch(Exception ex){
            conexion=null;
        }
        return conexion;
    }
}