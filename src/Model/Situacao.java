//Classe de Dom�nio referente a tabela SITUACAO da base.

package Model;

import java.sql.SQLException;
import java.util.List;

import Model.dao.DaoFactory;
import Model.dao.SituacaoDao;


public class Situacao {
	
	SituacaoTO dadosSituacao;
	
	public Situacao(SituacaoTO dadosSituacao) {
		this.dadosSituacao = dadosSituacao;
	}
	
	/*
	public String toString() {
		return String.format(" %d - %s", getCodigo(), getNome());
	}
	*/
	
	public List<SituacaoTO> consultarSituacao() throws SQLException {
		DaoFactory factory = DaoFactory.getInstance();
		SituacaoDao dao = (SituacaoDao) factory.getSituacaoDao();
		return dao.consultarSituacao();
	}
}
