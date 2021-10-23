package com.easygift.rest.cliente.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente", catalog="easy_gift")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	public Integer IDCLIENTE;
	
	@Column(name = "cedulacliente")
	public String CEDULACLIENTE;
	
	@Column(name = "nombrecliente")
	public String NOMBRECLIENTE;
	
	@Column(name = "celularcliente")
	public String CELULARCLIENTE;
	
	@Column(name = "emailcliente")
	public String EMAILCLIENTE;
	
	@Column(name = "usuario")
	public String USUARIO;
	
	@Column(name = "action")
	public String ACTION;
	
	@Column(name = "fechacreacion")
	public Date FECHACREACION;
	
	@Column(name = "fechaactualizacion")
	public Date FECHAACTUALIZACION;
	
	
	//Constructor
	/**
	 * Constructor vacio
	 */
	public Cliente() {
	}

	/**
	 * Constructor con todos los campos
	 * @param iDCLIENTE
	 * @param cEDULACLIENTE
	 * @param nOMBRECLIENTE
	 * @param cELULARCLIENTE
	 * @param eMAILCLIENTE
	 * @param uSUARIO
	 * @param aCTION
	 * @param fECHACREACION
	 * @param fECHAACTUALIZACION
	 */
	public Cliente(Integer iDCLIENTE, String cEDULACLIENTE, String nOMBRECLIENTE, String cELULARCLIENTE,
			String eMAILCLIENTE, String uSUARIO, String aCTION, Date fECHACREACION, Date fECHAACTUALIZACION) {
		super();
		IDCLIENTE = iDCLIENTE;
		CEDULACLIENTE = cEDULACLIENTE;
		NOMBRECLIENTE = nOMBRECLIENTE;
		CELULARCLIENTE = cELULARCLIENTE;
		EMAILCLIENTE = eMAILCLIENTE;
		USUARIO = uSUARIO;
		ACTION = aCTION;
		FECHACREACION = fECHACREACION;
		FECHAACTUALIZACION = fECHAACTUALIZACION;
	}
	
	
	/**
	 * Constructor sin id y sin campos de auditoria
	 * @param cEDULACLIENTE
	 * @param nOMBRECLIENTE
	 * @param cELULARCLIENTE
	 * @param eMAILCLIENTE
	 */
	public Cliente(String cEDULACLIENTE, String nOMBRECLIENTE, String cELULARCLIENTE, String eMAILCLIENTE) {
		super();
		CEDULACLIENTE = cEDULACLIENTE;
		NOMBRECLIENTE = nOMBRECLIENTE;
		CELULARCLIENTE = cELULARCLIENTE;
		EMAILCLIENTE = eMAILCLIENTE;
	}

	//GETTERS AND SETTERS

	public Integer getIDCLIENTE() {
		return IDCLIENTE;
	}

	public void setIDCLIENTE(Integer iDCLIENTE) {
		IDCLIENTE = iDCLIENTE;
	}

	public String getCEDULACLIENTE() {
		return CEDULACLIENTE;
	}

	public void setCEDULACLIENTE(String cEDULACLIENTE) {
		CEDULACLIENTE = cEDULACLIENTE;
	}

	public String getNOMBRECLIENTE() {
		return NOMBRECLIENTE;
	}

	public void setNOMBRECLIENTE(String nOMBRECLIENTE) {
		NOMBRECLIENTE = nOMBRECLIENTE;
	}

	public String getCELULARCLIENTE() {
		return CELULARCLIENTE;
	}

	public void setCELULARCLIENTE(String cELULARCLIENTE) {
		CELULARCLIENTE = cELULARCLIENTE;
	}

	public String getEMAILCLIENTE() {
		return EMAILCLIENTE;
	}

	public void setEMAILCLIENTE(String eMAILCLIENTE) {
		EMAILCLIENTE = eMAILCLIENTE;
	}

	public String getUSUARIO() {
		return USUARIO;
	}

	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}

	public String getACTION() {
		return ACTION;
	}

	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}

	public Date getFECHACREACION() {
		return FECHACREACION;
	}

	public void setFECHACREACION(Date fECHACREACION) {
		FECHACREACION = fECHACREACION;
	}

	public Date getFECHAACTUALIZACION() {
		return FECHAACTUALIZACION;
	}

	public void setFECHAACTUALIZACION(Date fECHAACTUALIZACION) {
		FECHAACTUALIZACION = fECHAACTUALIZACION;
	}


	// MÉTODOS	
	@Override
	public String toString() {
		return "Cliente [IDCLIENTE=" + IDCLIENTE + ", CEDULACLIENTE=" + CEDULACLIENTE + ", NOMBRECLIENTE="
				+ NOMBRECLIENTE + ", CELULARCLIENTE=" + CELULARCLIENTE + ", EMAILCLIENTE=" + EMAILCLIENTE + ", USUARIO="
				+ USUARIO + ", ACTION=" + ACTION + ", FECHACREACION=" + FECHACREACION + ", FECHAACTUALIZACION="
				+ FECHAACTUALIZACION + "]";
	}
	
	
	
	
}



