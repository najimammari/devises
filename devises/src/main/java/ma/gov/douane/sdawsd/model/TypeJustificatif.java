package ma.gov.douane.sdawsd.model;

public enum TypeJustificatif {

	DECLARATION("Déclaration"), BORDEREAU("Bordereau de change");
	
	/**
	 * Enumeration value
	 */
	private String enumValue;

	private TypeJustificatif(String enumValue) {
		this.enumValue = enumValue;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}
		
}
