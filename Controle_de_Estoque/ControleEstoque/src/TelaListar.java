
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaListar {

    JLabel labelTelaListar;

    JLabel labelCodigo, labelNome, labelQuantidade;
    
    JLabel campoCodigo, campoNome, campoQuantidade;
    
	JButton botaoListar;

    TelaListar(Container tela) {
        
        tela.removeAll();
        
        labelTelaListar = new JLabel("TELA LISTAR");
        labelTelaListar.setBounds(240, 30, 180, 25);

        tela.add(labelTelaListar);

        labelCodigo = new JLabel("Código");
        labelCodigo.setBounds(150, 60, 120, 20);

        tela.add(labelCodigo);

        labelNome = new JLabel("Nome");
        labelNome.setBounds(250, 60, 120, 20);

        tela.add(labelNome);

        labelQuantidade = new JLabel("Quantidade");
        labelQuantidade.setBounds(350, 60, 120, 20);

        tela.add(labelQuantidade);

        botaoListar = new JButton("LISTAR");
        botaoListar.setBounds(220, 190, 120, 20);
        botaoListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Produto produto = new Produto();
				
//				produto.codigo = Integer.parseInt(campoCodigo.getText());
//				produto.nome = campoNome.getText();
//				produto.quantidade = Integer.parseInt(campoQuantidade.getText());

				produto.listar();

				produto.desconectar();

				// JOptionPane.showMessageDialog(null, "OK");
			}
		});

		tela.add(botaoListar);

		tela.repaint();

    }

}

