package br.usjt.hellospringboot.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Clima implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String diaSemana;
	private Double tempMinima;
	private Double tempMaxima;
	private Double umidaRelativa;
	private String descricao;
	
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(Double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public Double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(Double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public Double getUmidaRelativa() {
		return umidaRelativa;
	}
	public void setUmidaRelativa(Double umidaRelativa) {
		this.umidaRelativa = umidaRelativa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}