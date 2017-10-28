
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Produto {

	String baseDeDados = "jdbc:mysql://127.0.0.1:3306/estoque";

	int codigo;
	String nome;
	int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	Connection conexao;
	Statement stmt;

	Produto() {

		try {
			conexao = DriverManager.getConnection(baseDeDados, "root", "");
			stmt = conexao.createStatement();
		} catch (SQLException ex) {
			Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	void cadastrar() {
		String instrucao;

		instrucao = "insert into produto values ( " + this.codigo + " , '" + this.nome + "'  , " + this.quantidade
				+ " );";
		try {
			stmt.execute(instrucao);
			JOptionPane.showMessageDialog(null, "SUCESSO");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "FALHA: " + ex.toString());
		}
	}

	void atualizar() {
		String instrucao;

		instrucao = " UPDATE produto SET nome = '" + this.nome + "', quantidade = " + this.quantidade
				+ " where codigo = " + this.codigo + ";";

		try {
			stmt.execute(instrucao);
			JOptionPane.showMessageDialog(null, "SUCESSO");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "FALHA: " + ex.toString());
		}
	}

	void excluir(int codigo) {
		String instrucao;

		instrucao = "delete from produto WHERE codigo = " + codigo;
		try {
			// JOptionPane.showMessageDialog(null, instrucao);
			stmt.execute(instrucao);
		} catch (SQLException ex) {
			Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	void listar() {
		String instrucao;

		instrucao = "select * from produto;";

		try {
			ResultSet rs = stmt.executeQuery(instrucao);

			while (rs.next()) {
				System.out.println(
						rs.getString("codigo") + ", " + rs.getString("nome") + ", " + rs.getString("quantidade"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// void buscarPorCodigo() {
	// String instrucao;
	//
	// instrucao = "select * from produto" + "WHERE codigo = " + codigo;
	// try {
	// stmt.execute(instrucao);
	// } catch (SQLException ex) {
	// Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
	// }
	//
	// }

	void desconectar() {
		try {
			conexao.close();
		} catch (SQLException ex) {
			Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
