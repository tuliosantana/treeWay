package threeway.projeto.service.Dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import threeway.projeto.modelo.Conta;
import threeway.projeto.service.conexao.FabricaConexao;

public class ContaDao implements Dao<Conta> {
	
	Connection conexao;
	
	public ContaDao(){
		
		try{
			conexao = FabricaConexao.getConexao();
		}catch (SQLException e){
			System.out.println("Erro ao conectar com banco de dados" + e.getMessage());
		}
	}
	
	private Collection<Conta> contasMemoria = new ArrayList<Conta>();

	@Override
	public Conta obter(Serializable identificador) {

		return null;
	}

	@Override
	public void alterar(Conta entidade) {


	}

	@Override
	public void salvar(Conta entidade) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO conta");
		sql.append("(dataabertura, numero, saldo, tipoconta, id_agencia, id_titular) VALUES (?,?,?,?,?,?)");
		
		try{
			PreparedStatement consulta = conexao.prepareStatement(sql.toString());
			
			consulta.setTimestamp(1, (Timestamp) entidade.getDataAbertura());
			consulta.setInt(2, entidade.getNumero());
			consulta.setDouble(3, entidade.getSaldo());
			consulta.setString(4, entidade.getTipoConta());
			consulta.setInt(5, entidade.getTitular());
			consulta.executeUpdate();
																																																																																																																																
		}catch (SQLException e){
			System.out.println("Erro ao realizar Insert: " + e.getMessage());
		}
	}

	@Override
	public void remover(Conta entidade) {


	}

	@Override
	public Collection<Conta> consultar(Conta entidade) {

		return null;
	}

	@Override
	public Collection<Conta> listar() {

		return contasMemoria;
	}

}
