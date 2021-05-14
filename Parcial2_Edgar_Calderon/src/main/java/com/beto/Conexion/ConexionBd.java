package com.beto.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBd {

    private Connection coonec;
    
    public ConexionBd()
    {
    	
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        coonec = DriverManager.getConnection("jdbc:mysql://localhost/parcial2","root","root");
        System.out.println("CONECTADO A LA BASE DE DATOS");
        
    }catch (Exception e)
    {
        System.out.println("ERROR DE CONEXION A LA BASE DE DATOS "+ e);
    }
    }
    public Connection RetornarConexion(){   
        return coonec;   
    }
}
