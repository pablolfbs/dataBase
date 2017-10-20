/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Periceles.Vianna
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeCadastro {
    
    JLabel labelTelaDeCadastro;
    
    JLabel labelCodigo, labelNome , labelQuantidade;
    
    JTextField campoCodigo, campoNome, campoQuantidade;
    
    JButton botaoCadastrar;
    
    TelaDeCadastro(Container tela)
    {
            labelTelaDeCadastro = new JLabel("TELA DE CADASTRO");
            labelTelaDeCadastro.setBounds(400, 80, 180, 25);
        
        tela.add(labelTelaDeCadastro);
        
            labelCodigo = new JLabel("Código");
            labelCodigo.setBounds(380, 115, 120, 20);
            
        tela.add(labelCodigo);    

            labelNome = new JLabel("Nome");
            labelNome.setBounds(380, 140, 120, 20);
            
        tela.add(labelNome); 

            labelQuantidade = new JLabel("Quantidade");
            labelQuantidade.setBounds(380, 165, 120, 20);
            
        tela.add(labelQuantidade); 
        
            campoCodigo = new JTextField();
            campoCodigo.setBounds(480, 115, 120, 20);
            
        tela.add(campoCodigo);  
        
            campoNome = new JTextField();
            campoNome.setBounds(480, 140, 120, 20);
            
        tela.add(campoNome);
        
            campoQuantidade = new JTextField();
            campoQuantidade.setBounds(480, 165, 120, 20);
            
        tela.add(campoQuantidade);

            botaoCadastrar = new JButton("CADASTRAR");
            botaoCadastrar.setBounds(480, 190, 120, 20);
            botaoCadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    Produto produto;
                    produto = new Produto();
                    
                    produto.codigo = Integer.parseInt(campoCodigo.getText());
                    produto.nome = campoNome.getText();
                    produto.quantidade = Integer.parseInt(campoQuantidade.getText());
                    
                    produto.cadastrar();
                    
                    produto.desconectar();
                    
                    //JOptionPane.showMessageDialog(null, "OK");
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            
        tela.add(botaoCadastrar); 
        
        tela.repaint();
        
    }
    
}
