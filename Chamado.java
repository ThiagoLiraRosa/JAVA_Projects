import java.util.Date;
import java.text.DateFormat;

public class Chamado {
	public int numero;
	public String nome;
	public String cpf;
	public String descricaoProblema = "Sem descrição";
	public Date abertura;
	public String situacao;
	public Date previsao;
	public int numeroEscolhe;
	public String cpfTecnico = "123.456.789/10";
	public String solucaoProblema = "Não resolvido";

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	
	public String getDescricaoProblema() {
		return descricaoProblema;
	}
	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	
	public int getNumeroEscolhe() {
		return numeroEscolhe;
	}
	public void setNumeroEscolhe(int numeroEscolhe) {
		this.numeroEscolhe = numeroEscolhe;
	}

	
	public String getCpfTecnico() {
		return cpfTecnico;
	}
	public void setCpfTecnico(String cpfTecnico) {
		this.cpfTecnico = cpfTecnico;
	}

	
	public Date getAbertura() {
		return abertura;
	}
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}

	
	public Date getPrevisao() {
		return previsao;
	}
	public void setPrevisao(Date previsao) {
		this.previsao = previsao;
	}

	
	public String getSolucaoProblema() {
		return solucaoProblema;
	}
	public void setSolucaoProblema(String solucaoProblema) {
		this.solucaoProblema = solucaoProblema;
	}

	public String toString() {
		return "Nome: " + nome + "" + "\n" + "Cpf: " + cpf + "" + "\n" + "Numero: " + numero + "" + "\n" + "Situacao: "
				+ situacao + "" + "\n" + "DescricaoProblema: " + descricaoProblema + "\n" + "SolucaoProblema: " + solucaoProblema + "\n"
				+ "CPF Tecnico: " + cpfTecnico;
	}

}