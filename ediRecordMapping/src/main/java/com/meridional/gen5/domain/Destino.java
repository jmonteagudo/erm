/**
 * 
 */
package com.meridional.gen5.domain;

import java.math.*;

/**
 * @author jmonteag
 *
 */
public class Destino {
	
	// Atributos
	
	private static int itemCount = 0;
	private int itemNumber = 0;
	
	private int tipoRegistro; //0
	private int clientCode; // 1
	private String storeId; // 2
	private long certificateNumber; // 3
	private String planProductCoverageCode; // 4
	private String productPurchaseDate; // 5		
	private BigDecimal productPurchasePrice; // 6
	private BigDecimal chartisWarrantyPrice; // 7
	private String clientSpecificProductCode; // 8
	private String warrantyPurchaseDate; // 9	
	private String inServiceDate; //10
	private BigDecimal upc; //11
	private String consumerFirstName; // 12
	private String consumerLastname; // 13
	private String consumerAddressLine1; // 14
	private String consumerAddressLine2; // 15
	private String consumerAddressLine3; // 16	
	private String consumerCity; // 17
	private String consumerState; // 18
	private String consumerPostalCode; // 19
	private String consumerPhoneNumer; // 20
	private String consumerPhoneAlternative1; // 21
	private String consumerPhoneAlternative2; // 22
	private String consumerEMail; // 23
	private String reportedProductDescription; // 24
	private String reportedProductMake; // 25
	private String reportedProductModel; // 26
	private String cancellationDate; // 27	
	private String cancellationRemarks; // 28
	private String tax1; // 29	
	private String tax2; // 30
	private String tax3; // 31
	private String genericColumn1; //32
	private String genericColumn2; //33
	private String genericColumn3; //34
	
	// Constructor
	public Destino(){
		this.itemNumber = ++itemCount;
	}
	
	public static void reiniciarContador(){
		itemCount = 0;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}
	
	// Getters and Setters

	public int getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(int tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	
	public int getClientCode() {
		return clientCode;
	}
	
	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		try{
			this.storeId = Integer.parseInt(storeId)==0 ? "1" : storeId;
		}catch(NumberFormatException ex){
			this.storeId = "1";
		}
	}
	public long getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(long certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public String getPlanProductCoverageCode() {
		return planProductCoverageCode;
	}
	public void setPlanProductCoverageCode(String planProductCoverageCode) {
		this.planProductCoverageCode = planProductCoverageCode;
	}
	public String getProductPurchaseDate() {
		return productPurchaseDate;
	}
	public void setProductPurchaseDate(String productPurchaseDate) {
		this.productPurchaseDate = productPurchaseDate;
	}
	public BigDecimal getProductPurchasePrice() {
		return productPurchasePrice;
	}
	public void setProductPurchasePrice(BigDecimal productPurchasePrice) {
		this.productPurchasePrice = productPurchasePrice;
	}
	public BigDecimal getChartisWarrantyPrice() {
		return chartisWarrantyPrice;
	}
	public void setChartisWarrantyPrice(BigDecimal chartisWarrantyPrice) {
		this.chartisWarrantyPrice = chartisWarrantyPrice;
	}
	public String getClientSpecificProductCode() {
		return clientSpecificProductCode;
	}
	public void setClientSpecificProductCode(String clientSpecificProductCode) {
		this.clientSpecificProductCode = clientSpecificProductCode;
	}
	public String getWarrantyPurchaseDate() {
		return warrantyPurchaseDate;
	}
	public void setWarrantyPurchaseDate(String warrantyPurchaseDate) {
		this.warrantyPurchaseDate = warrantyPurchaseDate;
	}
	public String getInServiceDate() {
		return inServiceDate;
	}
	public void setInServiceDate(String inServiceDate) {
		this.inServiceDate = inServiceDate;
	}
	public BigDecimal getUpc() {
		return upc;
	}
	public void setUpc(BigDecimal upc) {
		this.upc = upc;
	}
	public String getConsumerFirstName() {
		return consumerFirstName;
	}
	public void setConsumerFirstName(String consumerFirstName) {
		this.consumerFirstName = consumerFirstName;
	}
	public String getConsumerLastname() {
		return consumerLastname;
	}
	public void setConsumerLastname(String consumerLastname) {
		this.consumerLastname = consumerLastname;
	}
	public String getConsumerAddressLine1() {
		return consumerAddressLine1;
	}
	public void setConsumerAddressLine1(String consumerAddressLine1) {
		this.consumerAddressLine1 = consumerAddressLine1;
	}
	public String getConsumerAddressLine2() {
		return consumerAddressLine2;
	}
	public void setConsumerAddressLine2(String consumerAddressLine2) {
		this.consumerAddressLine2 = consumerAddressLine2;
	}
	public String getConsumerAddressLine3() {
		return consumerAddressLine3;
	}
	public void setConsumerAddressLine3(String consumerAddressLine3) {
		this.consumerAddressLine3 = consumerAddressLine3;
	}
	public String getConsumerCity() {
		return consumerCity;
	}
	public void setConsumerCity(String consumerCity) {
		this.consumerCity = consumerCity;
	}
	public String getConsumerState() {
		return consumerState;
	}
	public void setConsumerState(String consumerState) {
		this.consumerState = consumerState;
	}
	public String getConsumerPostalCode() {
		return consumerPostalCode;
	}
	public void setConsumerPostalCode(String consumerPostalCode) {
		this.consumerPostalCode = consumerPostalCode;
	}
	public String getConsumerPhoneNumer() {
		return consumerPhoneNumer;
	}
	public void setConsumerPhoneNumer(String consumerPhoneNumer) {
		this.consumerPhoneNumer = consumerPhoneNumer;
	}
	public String getConsumerPhoneAlternative1() {
		return consumerPhoneAlternative1;
	}
	public void setConsumerPhoneAlternative1(String consumerPhoneAlternative1) {
		this.consumerPhoneAlternative1 = consumerPhoneAlternative1;
	}
	public String getConsumerPhoneAlternative2() {
		return consumerPhoneAlternative2;
	}
	public void setConsumerPhoneAlternative2(String consumerPhoneAlternative2) {
		this.consumerPhoneAlternative2 = consumerPhoneAlternative2;
	}
	public String getConsumerEMail() {
		return consumerEMail;
	}
	public void setConsumerEMail(String consumerEMail) {
		this.consumerEMail = consumerEMail;
	}
	public String getReportedProductDescription() {
		return reportedProductDescription;
	}
	public void setReportedProductDescription(String reportedProductDescription) {
		this.reportedProductDescription = reportedProductDescription;
	}
	public String getReportedProductMake() {
		return reportedProductMake;
	}
	public void setReportedProductMake(String reportedProductMake) {
		this.reportedProductMake = reportedProductMake;
	}
	public String getReportedProductModel() {
		return reportedProductModel;
	}
	public void setReportedProductModel(String reportedProductModel) {
		this.reportedProductModel = reportedProductModel;
	}
	public String getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	public String getCancellationRemarks() {
		return cancellationRemarks;
	}
	public void setCancellationRemarks(String cancellationRemarks) {
		this.cancellationRemarks = cancellationRemarks;
	}
	public String getTax1() {
		return tax1;
	}
	public void setTax1(String tax1) {
		this.tax1 = tax1;
	}
	public String getTax2() {
		return tax2;
	}
	public void setTax2(String tax2) {
		this.tax2 = tax2;
	}
	public String getTax3() {
		return tax3;
	}
	public void setTax3(String tax3) {
		this.tax3 = tax3;
	}
	public String getGenericColumn1() {
		return genericColumn1;
	}
	public void setGenericColumn1(String genericColumn1) {
		this.genericColumn1 = genericColumn1;
	}
	public String getGenericColumn2() {
		return genericColumn2;
	}
	public void setGenericColumn2(String genericColumn2) {
		this.genericColumn2 = genericColumn2;
	}
	public String getGenericColumn3() {
		return genericColumn3;
	}
	public void setGenericColumn3(String genericColumn3) {
		this.genericColumn3 = genericColumn3;
	}
	
}
