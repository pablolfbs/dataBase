
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class InterfaceGrafica {

	JFrame janela;

	JMenuBar barraDeMenu;

	JMenu menuCadastrar, menuAtualizar, menuExcluir, menuListar, menuSair;

	public InterfaceGrafica() {

		janela = new JFrame("CONTROLE DE ESTOQUE");

		// janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		janela.setSize(600, 400);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		barraDeMenu = new JMenuBar();

		menuCadastrar = new JMenu("CADASTRAR");
		menuCadastrar.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaDeCadastro(janela.getContentPane());
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		menuAtualizar = new JMenu("ATUALIZAR");
		menuAtualizar.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaAtualizar(janela.getContentPane());
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		menuListar = new JMenu("LISTAR");
		menuListar.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaListar(janela.getContentPane());
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		menuExcluir = new JMenu("EXCLUIR");
		menuExcluir.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaExcluir(janela.getContentPane());
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		barraDeMenu.add(menuCadastrar);

		barraDeMenu.add(menuAtualizar);
		
		barraDeMenu.add(menuExcluir);
		
		barraDeMenu.add(menuListar);

		janela.setJMenuBar(barraDeMenu);

		janela.setVisible(true);
	}

}
