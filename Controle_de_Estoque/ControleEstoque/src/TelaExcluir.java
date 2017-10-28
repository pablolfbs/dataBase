
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaExcluir {

	JLabel labelTelaExcluir;

	JLabel labelCodigo, labelNome, labelQuantidade;

	JTextField campoCodigo, campoNome, campoQuantidade;

	JButton botaoExcluir;

	TelaExcluir(Container tela) {

		tela.removeAll();

		labelTelaExcluir = new JLabel("TELA EXCLUIR");
		labelTelaExcluir.setBounds(200, 80, 180, 25);

		tela.add(labelTelaExcluir);

		labelCodigo = new JLabel("Código");
		labelCodigo.setBounds(180, 115, 120, 20);

		tela.add(labelCodigo);

		// labelNome = new JLabel("Nome");
		// labelNome.setBounds(180, 140, 120, 20);
		//
		// tela.add(labelNome);
		//
		// labelQuantidade = new JLabel("Quantidade");
		// labelQuantidade.setBounds(180, 165, 120, 20);
		//
		// tela.add(labelQuantidade);
		
		campoCodigo = new JTextField();
		campoCodigo.setBounds(280, 115, 120, 20);

		tela.add(campoCodigo);

		// campoNome = new JTextField();
		// campoNome.setBounds(280, 140, 120, 20);
		//
		// tela.add(campoNome);
		//
		// campoQuantidade = new JTextField();
		// campoQuantidade.setBounds(280, 165, 120, 20);
		//
		// tela.add(campoQuantidade);

		botaoExcluir = new JButton("EXCLUIR");
		botaoExcluir.setBounds(280, 140, 120, 20);
		botaoExcluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Produto produto;
				produto = new Produto();

				produto.codigo = Integer.parseInt(campoCodigo.getText());
				// produto.nome = campoNome.getText();
				// produto.quantidade = Integer.parseInt(campoQuantidade.getText());

				produto.excluir(produto.codigo);

				JOptionPane.showMessageDialog(labelTelaExcluir, "Cadastro excluído com sucesso", "Confirmação",
						JOptionPane.INFORMATION_MESSAGE);

				produto.desconectar();

				// JOptionPane.showMessageDialog(null, "OK");
			}
		});

		tela.add(botaoExcluir);

		tela.repaint();

	}

}
