package br.com.lanastacio.model;

import java.util.Date;

public class Auditoria {

	private String usuarioInclusao;
	private Date dataInclusao;
	private String usuarioEdicao;
	private Date dataEdicao;

	public String getUsuarioInclusao() {
		return usuarioInclusao;
	}

	public void setUsuarioInclusao(String usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getUsuarioEdicao() {
		return usuarioEdicao;
	}

	public void setUsuarioEdicao(String usuarioEdicao) {
		this.usuarioEdicao = usuarioEdicao;
	}

	public Date getDataEdicao() {
		return dataEdicao;
	}

	public void setDataEdicao(Date dataEdicao) {
		this.dataEdicao = dataEdicao;
	}

}
