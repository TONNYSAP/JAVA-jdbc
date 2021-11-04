package classes;

import java.util.Objects;

public class profissao {
	private Integer id;
	private Integer ct;
	private String profissao;
	private Integer cpf;
	private Integer rg;
	
	
	public profissao() {
		super();
	}
	
		
	public profissao(Integer ct, String profissao, Integer cpf, Integer rg) {
		super();
		this.ct = ct;
		this.profissao = profissao;
		this.cpf = cpf;
		this.rg = rg;
	}


	public profissao(Integer id, Integer ct, String profissao, Integer cpf, Integer rg) {
		super();
		this.id = id;
		this.ct = ct;
		this.profissao = profissao;
		this.cpf = cpf;
		this.rg = rg;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the ct
	 */
	public Integer getCt() {
		return ct;
	}
	/**
	 * @param ct the ct to set
	 */
	public void setCt(Integer ct) {
		this.ct = ct;
	}
	/**
	 * @return the profissao
	 */
	public String getProfissao() {
		return profissao;
	}
	/**
	 * @param profissao the profissao to set
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	/**
	 * @return the cpf
	 */
	public Integer getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public Integer getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(Integer rg) {
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		profissao other = (profissao) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
