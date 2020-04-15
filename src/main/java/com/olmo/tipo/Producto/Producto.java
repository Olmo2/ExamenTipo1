package com.olmo.tipo.Producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@NotNull
	@Min(1)
	@Max(1000)
	private Integer num_albaran;
	
	@Column
	private String tipo;
	
	@Column
	@NotNull
	@Min(1)
	@Max(100)
	private Float importe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNum_albaran() {
		return num_albaran;
	}

	public void setNum_albaran(Integer num_albaran) {
		this.num_albaran = num_albaran;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}
	
	
	
	
	

}
