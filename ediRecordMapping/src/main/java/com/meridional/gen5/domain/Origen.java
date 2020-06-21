/**
 * 
 */
package com.meridional.gen5.domain;

import java.math.*;

/**
 * @author jmonteag
 *
 */
public class Origen {
		
	// Atributos
	
	private static int itemCount = 0;
	private int itemNumber = 0;
	private static char contar='S';
	
	private int codigoBroker; // 1
	private int codigoCompania; // 2
	private int codigoRamo; // 3
	private int numeroPoliza; // 4
	private long numeroCertificado; // 5
	private char codigoEstado; // 6
	private String fechaEmision; // 7
	private String fechaVigenciaDesde; // 8
	private String fechaVigenciaHasta; // 9
	private BigDecimal precioVentaArticulo; // 10
	private BigDecimal tarifa; // 11
	private String tipoArticulo; // 12
	private String codigoMarcaArticulo; // 13
	private String codigoModeloArticulo; // 14
	private String condicionArticulo; // 15
	private String fechaCompraArticulo; // 16
	private String fechaVentaGarantia; // 17
	private int unidadPlazoGarantiaFabricante; // 18
	private int plazoGarantiaFabricante; // 19
	private int unidadPlazoGarantiaExtendida; // 20
	private int plazoGarantiaExtendida; // 21
	private int codigoVendador; // 22
	private String nombreVendedor; // 23
	private String fechaBaja; // 24
	private String tipoComprobante; // 25
	private String numeroComprobante; // 26
	private int tipoGarantia; // 27
	private String cobertura; // 28
	private String codigoArticuloTienda; // 29
	private String codigoSucursal; // 30
	private String lugarReparacion; // 31
	private BigDecimal precioVentaGarantia; // 32
	private int codigoClienteBroker; // 33
	private String nombreCliente; // 34
	private String apellidoCliente; // 35
	private String codigoTipoDocumento; // 36
	private String abreviaturaTipoDocumento; // 37
	private String numeroDocumento; // 38
	private String numeroCuit; // 39
	private String telefonoParticular; // 40
	private String calleDomicilio; // 41
	private String numeroDomicilio; // 42
	private String pisoDomicilio; // 43
	private String departamentoDomicilio; // 44
	private String codigoProvinciaDomicilio; // 45
	private String localidadDomicilio; // 46
	private String codigoPostalDomicilio; // 47
	private String fechaNacimiento; // 48
	private String codigoEstadoCivil; // 49
	private String codigoOcupacion; // 50
	private String descripcionOcupacion; // 51
	private String tipoPersona; // 52
	private String sexo; // 53
	private String eMail; // 54
	/*private String telefonoAlternativo; // 55
	private String telefonoAlternativo2; // 56
	private String notasCancelacion; // 57*/
	
	// Constructor
	public Origen(){
		if(contar == 'S'){
			this.itemNumber = ++itemCount;
		}
	}

	public static void reiniciarContador(){
		itemCount = 0;
		contar = 'N';
	}
	
	public void ignorarUltimoRegistro(){
		--itemCount;
	}
	
	public static char getContar(){
		return contar;
	}
	
	public static void setContar(char value){
		contar = value;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}
	
	// Métodos Getter y Setter
	/**
	 * @return the codigoBroker
	 */
	public int getCodigoBroker() {
		return codigoBroker;
	}
	/**
	 * @param codigoBroker the codigoBroker to set
	 */
	public void setCodigoBroker(int codigoBroker) {
		this.codigoBroker = codigoBroker;
	}
	/**
	 * @return the codigoCompania
	 */
	public int getCodigoCompania() {
		return codigoCompania;
	}
	/**
	 * @param codigoCompania the codigoCompania to set
	 */
	public void setCodigoCompania(int codigoCompania) {
		this.codigoCompania = codigoCompania;
	}
	/**
	 * @return the codigoRamo
	 */
	public int getCodigoRamo() {
		return codigoRamo;
	}
	/**
	 * @param codigoRamo the codigoRamo to set
	 */
	public void setCodigoRamo(int codigoRamo) {
		this.codigoRamo = codigoRamo;
	}
	/**
	 * @return the numeroPoliza
	 */
	public int getNumeroPoliza() {
		return numeroPoliza;
	}
	/**
	 * @param numeroPoliza the numeroPoliza to set
	 */
	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	/**
	 * @return the numeroCertificado
	 */
	public long getNumeroCertificado() {
		return numeroCertificado;
	}
	/**
	 * @param numeroCertificado the numeroCertificado to set
	 */
	public void setNumeroCertificado(long numeroCertificado) {
		this.numeroCertificado = numeroCertificado;
	}
	/**
	 * @return the codigoEstado
	 */
	public char getCodigoEstado() {
		return codigoEstado;
	}
	/**
	 * @param codigoEstado the codigoEstado to set
	 */
	public void setCodigoEstado(char codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	/**
	 * @return the fechaEmision
	 */
	public String getFechaEmision() {
		return fechaEmision;
	}
	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	/**
	 * @return the fechaVigenciaDesde
	 */
	public String getFechaVigenciaDesde() {
		return fechaVigenciaDesde;
	}
	/**
	 * @param fechaVigenciaDesde the fechaVigenciaDesde to set
	 */
	public void setFechaVigenciaDesde(String fechaVigenciaDesde) {
		this.fechaVigenciaDesde = fechaVigenciaDesde;
	}
	/**
	 * @return the fechaVigenciaHasta
	 */
	public String getFechaVigenciaHasta() {
		return fechaVigenciaHasta;
	}
	/**
	 * @param fechaVigenciaHasta the fechaVigenciaHasta to set
	 */
	public void setFechaVigenciaHasta(String fechaVigenciaHasta) {
		this.fechaVigenciaHasta = fechaVigenciaHasta;
	}
	/**
	 * @return the precioVentaArticulo
	 */
	public BigDecimal getPrecioVentaArticulo() {
		return precioVentaArticulo;
	}
	/**
	 * @param precioVentaArticulo the precioVentaArticulo to set
	 */
	public void setPrecioVentaArticulo(BigDecimal precioVentaArticulo) {
		this.precioVentaArticulo = precioVentaArticulo;
	}
	/**
	 * @return the tarifa
	 */
	public BigDecimal getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(BigDecimal tarifa) {
		this.tarifa = tarifa;
	}
	/**
	 * @return the tipoArticulo
	 */
	public String getTipoArticulo() {
		return tipoArticulo;
	}
	/**
	 * @param tipoArticulo the tipoArticulo to set
	 */
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	/**
	 * @return the codigoMarcaArticulo
	 */
	public String getCodigoMarcaArticulo() {
		return codigoMarcaArticulo;
	}
	/**
	 * @param codigoMarcaArticulo the codigoMarcaArticulo to set
	 */
	public void setCodigoMarcaArticulo(String codigoMarcaArticulo) {
		this.codigoMarcaArticulo = codigoMarcaArticulo;
	}
	/**
	 * @return the codigoModeloArticulo
	 */
	public String getCodigoModeloArticulo() {
		return codigoModeloArticulo;
	}
	/**
	 * @param codigoModeloArticulo the codigoModeloArticulo to set
	 */
	public void setCodigoModeloArticulo(String codigoModeloArticulo) {
		this.codigoModeloArticulo = codigoModeloArticulo;
	}
	/**
	 * @return the condicionArticulo
	 */
	public String getCondicionArticulo() {
		return condicionArticulo;
	}
	/**
	 * @param condicionArticulo the condicionArticulo to set
	 */
	public void setCondicionArticulo(String condicionArticulo) {
		this.condicionArticulo = condicionArticulo;
	}
	/**
	 * @return the fechaCompraArticulo
	 */
	public String getFechaCompraArticulo() {
		return fechaCompraArticulo;
	}
	/**
	 * @param fechaCompraArticulo the fechaCompraArticulo to set
	 */
	public void setFechaCompraArticulo(String fechaCompraArticulo) {
		this.fechaCompraArticulo = fechaCompraArticulo;
	}
	/**
	 * @return the fechaVentaGarantia
	 */
	public String getFechaVentaGarantia() {
		return fechaVentaGarantia;
	}
	/**
	 * @param fechaVentaGarantia the fechaVentaGarantia to set
	 */
	public void setFechaVentaGarantia(String fechaVentaGarantia) {
		this.fechaVentaGarantia = fechaVentaGarantia;
	}
	/**
	 * @return the unidadPlazoGarantiaFabricante
	 */
	public int getUnidadPlazoGarantiaFabricante() {
		return unidadPlazoGarantiaFabricante;
	}
	/**
	 * @param unidadPlazoGarantiaFabricante the unidadPlazoGarantiaFabricante to set
	 */
	public void setUnidadPlazoGarantiaFabricante(int unidadPlazoGarantiaFabricante) {
		this.unidadPlazoGarantiaFabricante = unidadPlazoGarantiaFabricante;
	}
	/**
	 * @return the plazoGarantiaFabricante
	 */
	public int getPlazoGarantiaFabricante() {
		return plazoGarantiaFabricante;
	}
	/**
	 * @param plazoGarantiaFabricante the plazoGarantiaFabricante to set
	 */
	public void setPlazoGarantiaFabricante(int plazoGarantiaFabricante) {
		this.plazoGarantiaFabricante = plazoGarantiaFabricante;
	}
	/**
	 * @return the unidadPlazoGarantiaExtendida
	 */
	public int getUnidadPlazoGarantiaExtendida() {
		return unidadPlazoGarantiaExtendida;
	}
	/**
	 * @param unidadPlazoGarantiaExtendida the unidadPlazoGarantiaExtendida to set
	 */
	public void setUnidadPlazoGarantiaExtendida(int unidadPlazoGarantiaExtendida) {
		this.unidadPlazoGarantiaExtendida = unidadPlazoGarantiaExtendida;
	}
	/**
	 * @return the plazoGarantiaExtendida
	 */
	public int getPlazoGarantiaExtendida() {
		return plazoGarantiaExtendida;
	}
	/**
	 * @param plazoGarantiaExtendida the plazoGarantiaExtendida to set
	 */
	public void setPlazoGarantiaExtendida(int plazoGarantiaExtendida) {
		this.plazoGarantiaExtendida = plazoGarantiaExtendida;
	}
	/**
	 * @return the codigoVendador
	 */
	public int getCodigoVendador() {
		return codigoVendador;
	}
	/**
	 * @param codigoVendador the codigoVendador to set
	 */
	public void setCodigoVendador(int codigoVendador) {
		this.codigoVendador = codigoVendador;
	}
	/**
	 * @return the nombreVendedor
	 */
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	/**
	 * @param nombreVendedor the nombreVendedor to set
	 */
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	/**
	 * @return the fechaBaja
	 */
	public String getFechaBaja() {
		return fechaBaja;
	}
	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	/**
	 * @return the tipoComprobante
	 */
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	/**
	 * @return the numeroComprobante
	 */
	public String getNumeroComprobante() {
		return numeroComprobante;
	}
	/**
	 * @param numeroComprobante the numeroComprobante to set
	 */
	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	/**
	 * @return the tipoGarantia
	 */
	public int getTipoGarantia() {
		return tipoGarantia;
	}
	/**
	 * @param tipoGarantia the tipoGarantia to set
	 */
	public void setTipoGarantia(int tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}
	/**
	 * @return the cobertura
	 */
	public String getCobertura() {
		return cobertura;
	}
	/**
	 * @param cobertura the cobertura to set
	 */
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	/**
	 * @return the codigoArticuloTienda
	 */
	public String getCodigoArticuloTienda() {
		return codigoArticuloTienda;
	}
	/**
	 * @param codigoArticuloTienda the codigoArticuloTienda to set
	 */
	public void setCodigoArticuloTienda(String codigoArticuloTienda) {
		this.codigoArticuloTienda = codigoArticuloTienda;
	}
	/**
	 * @return the codigoSucursal
	 */
	public String getCodigoSucursal() {
		return codigoSucursal;
	}
	/**
	 * @param codigoSucursal the codigoSucursal to set
	 */
	public void setCodigoSucursal(String codigoSucursal) {
		if(codigoSucursal.equals("")){
			codigoSucursal = "1";
		}
		this.codigoSucursal = codigoSucursal;
	}
	/**
	 * @return the lugarReparacion
	 */
	public String getLugarReparacion() {
		return lugarReparacion;
	}
	/**
	 * @param lugarReparacion the lugarReparacion to set
	 */
	public void setLugarReparacion(String lugarReparacion) {
		this.lugarReparacion = lugarReparacion;
	}
	/**
	 * @return the precioVentaGarantia
	 */
	public BigDecimal getPrecioVentaGarantia() {
		return precioVentaGarantia;
	}
	/**
	 * @param precioVentaGarantia the precioVentaGarantia to set
	 */
	public void setPrecioVentaGarantia(BigDecimal precioVentaGarantia) {
		this.precioVentaGarantia = precioVentaGarantia;
	}
	/**
	 * @return the codigoClienteBroker
	 */
	public int getCodigoClienteBroker() {
		return codigoClienteBroker;
	}
	/**
	 * @param codigoClienteBroker the codigoClienteBroker to set
	 */
	public void setCodigoClienteBroker(int codigoClienteBroker) {
		this.codigoClienteBroker = codigoClienteBroker;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the apellidoCliente
	 */
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	/**
	 * @param apellidoCliente the apellidoCliente to set
	 */
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	/**
	 * @return the codigoTipoDocumento
	 */
	public String getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}
	/**
	 * @param codigoTipoDocumento the codigoTipoDocumento to set
	 */
	public void setCodigoTipoDocumento(String codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}
	/**
	 * @return the abreviaturaTipoDocumento
	 */
	public String getAbreviaturaTipoDocumento() {
		return abreviaturaTipoDocumento;
	}
	/**
	 * @param abreviaturaTipoDocumento the abreviaturaTipoDocumento to set
	 */
	public void setAbreviaturaTipoDocumento(String abreviaturaTipoDocumento) {
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
	}
	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	/**
	 * @return the numeroCuit
	 */
	public String getNumeroCuit() {
		return numeroCuit;
	}
	/**
	 * @param numeroCuit the numeroCuit to set
	 */
	public void setNumeroCuit(String numeroCuit) {
		this.numeroCuit = numeroCuit;
	}
	/**
	 * @return the telefonoParticular
	 */
	public String getTelefonoParticular() {
		return telefonoParticular;
	}
	/**
	 * @param telefonoParticular the telefonoParticular to set
	 */
	public void setTelefonoParticular(String telefonoParticular) {
		this.telefonoParticular = telefonoParticular;
	}
	/**
	 * @return the calleDomicilio
	 */
	public String getCalleDomicilio() {
		return calleDomicilio;
	}
	/**
	 * @param calleDomicilio the calleDomicilio to set
	 */
	public void setCalleDomicilio(String calleDomicilio) {
		this.calleDomicilio = calleDomicilio;
	}
	/**
	 * @return the numeroDomicilio
	 */
	public String getNumeroDomicilio() {
		return numeroDomicilio;
	}
	/**
	 * @param numeroDomicilio the numeroDomicilio to set
	 */
	public void setNumeroDomicilio(String numeroDomicilio) {
		this.numeroDomicilio = numeroDomicilio;
	}
	/**
	 * @return the pisoDomicilio
	 */
	public String getPisoDomicilio() {
		return pisoDomicilio;
	}
	/**
	 * @param pisoDomicilio the pisoDomicilio to set
	 */
	public void setPisoDomicilio(String pisoDomicilio) {
		this.pisoDomicilio = pisoDomicilio;
	}
	/**
	 * @return the departamentoDomicilio
	 */
	public String getDepartamentoDomicilio() {
		return departamentoDomicilio;
	}
	/**
	 * @param departamentoDomicilio the departamentoDomicilio to set
	 */
	public void setDepartamentoDomicilio(String departamentoDomicilio) {
		this.departamentoDomicilio = departamentoDomicilio;
	}
	/**
	 * @return the codigoProvinciaDomicilio
	 */
	public String getCodigoProvinciaDomicilio() {
		return codigoProvinciaDomicilio;
	}
	/**
	 * @param codigoProvinciaDomicilio the codigoProvinciaDomicilio to set
	 */
	public void setCodigoProvinciaDomicilio(String codigoProvinciaDomicilio) {
		this.codigoProvinciaDomicilio = codigoProvinciaDomicilio;
	}
	/**
	 * @return the localidadDomicilio
	 */
	public String getLocalidadDomicilio() {
		return localidadDomicilio;
	}
	/**
	 * @param localidadDomicilio the localidadDomicilio to set
	 */
	public void setLocalidadDomicilio(String localidadDomicilio) {
		this.localidadDomicilio = localidadDomicilio;
	}
	/**
	 * @return the codigoPostalDomicilio
	 */
	public String getCodigoPostalDomicilio() {
		return codigoPostalDomicilio;
	}
	/**
	 * @param codigoPostalDomicilio the codigoPostalDomicilio to set
	 */
	public void setCodigoPostalDomicilio(String codigoPostalDomicilio) {
		this.codigoPostalDomicilio = codigoPostalDomicilio;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the codigoEstadoCivil
	 */
	public String getCodigoEstadoCivil() {
		return codigoEstadoCivil;
	}
	/**
	 * @param codigoEstadoCivil the codigoEstadoCivil to set
	 */
	public void setCodigoEstadoCivil(String codigoEstadoCivil) {
		this.codigoEstadoCivil = codigoEstadoCivil;
	}
	/**
	 * @return the codigoOcupacion
	 */
	public String getCodigoOcupacion() {
		return codigoOcupacion;
	}
	/**
	 * @param codigoOcupacion the codigoOcupacion to set
	 */
	public void setCodigoOcupacion(String codigoOcupacion) {
		this.codigoOcupacion = codigoOcupacion;
	}
	/**
	 * @return the descripcionOcupacion
	 */
	public String getDescripcionOcupacion() {
		return descripcionOcupacion;
	}
	/**
	 * @param descripcionOcupacion the descripcionOcupacion to set
	 */
	public void setDescripcionOcupacion(String descripcionOcupacion) {
		this.descripcionOcupacion = descripcionOcupacion;
	}
	/**
	 * @return the tipoPersona
	 */
	public String getTipoPersona() {
		return tipoPersona;
	}
	/**
	 * @param tipoPersona the tipoPersona to set
	 */
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}
	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}	
}
