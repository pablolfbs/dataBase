/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 36115142016.2N
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfaceGrafica {
    
    JFrame janela;
    JMenuBar barraDeMenu;
    JMenu menuCadastrar, menuAtualizar, menuExcluir, menuListar, menuSair;
    
    public InterfaceGrafica(){
        janela = new JFrame("CONTROLE DE ESTOQUE");
        
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        barraDeMenu = new JMenuBar();
        
        menuCadastrar = new JMenu("CADASTRAR");
        menuCadastrar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new TelaDeCadastro(janela.getContentPane());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        barraDeMenu.add(menuCadastrar);
        
        janela.setJMenuBar(barraDeMenu);
        
        janela.setVisible(true);
    }
    
}
