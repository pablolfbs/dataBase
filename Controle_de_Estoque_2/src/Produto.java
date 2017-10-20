/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Periceles.Vianna
 */

import java.sql.*;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Produto {
    
    String baseDeDados = "jdbc:mysql://127.0.0.1:3306/estoque"; 
    
    int codigo;
    String nome;
    int quantidade;
    
    Connection conexao;
    Statement stmt;
    
    Produto(){
        
        try {
            conexao = DriverManager.getConnection(baseDeDados, "root", "");
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    void cadastrar(){
        String instrucao;
        
        instrucao = "insert into produto values ( " + this.codigo + " , '" + this.nome + "'  , " + this.quantidade + " );";
        try {
            //JOptionPane.showMessageDialog(null, instrucao);
            stmt.execute(instrucao);
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void desconectar()
    {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
