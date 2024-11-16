/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author enzoz
 */
public class DataBaseConnector {
    private final String URL = "jdbc:mysql://localhost:3306/agenda";
    private final String USER = "root";
    private final String PASSWD = "";
    //Objeto responsável por armazenar a conexão
    Connection connection = null;
    
    public Connection getConnection(){
        // se for nulo, não houve conexão
        //VERIFICA SE TEVE CONEXÃO
        if(this.connection == null){
            try {
                // Tenta realizar a conexão (por isso o try)
                this.connection = DriverManager.getConnection(URL, USER, PASSWD);
            } catch (SQLException e) {
                System.out.print("Erro ao tentar realizar conexão... Erro: " + e.getMessage());
            }
        }
        
        return this.connection;
    }
}
