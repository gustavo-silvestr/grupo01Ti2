package com.ti2cc;

public class Usuario {
	private int codigo;
	private String email;
	private String senha;
	private char sexo;
	private String cpf;
	private String nome;
	private String sobrenome;
	private String cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	
	public Usuario() {
		this.codigo = -1;
		this.email = "";
		this.senha = "";
		this.sexo = '*';
		this.cpf = "";
		this.nome = "";
		this.sobrenome = "";
		this.cep = "";
		this.estado = "";
		this.cidade = "";
		this.bairro = "";
		this.rua = "";
	}
	
	public Usuario(int codigo, String email, String senha, char sexo, String cpf, String nome, String sobrenome, String cep
			, String estado, String cidade, String bairro, String rua) {
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", email=" + email + ", senha=" + senha + ", sexo=" + sexo + ", cpf=" + cpf + 
				 ", nome=" + nome +  ", sobrenome=" +sobrenome + ", cep=" + cep + ", estado="+ estado + ", cidade=" + cidade 
				 + ", bairro=" + bairro + ", rua=" + rua +"]";
	}	
}
