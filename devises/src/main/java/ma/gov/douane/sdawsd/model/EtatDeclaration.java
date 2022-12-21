package ma.gov.douane.sdawsd.model;

public enum EtatDeclaration {

	VALIDE("Validé"), ANNULE("Annulé") ;
	
	/**
	 * Enumeration value
	 */
	private String enumValue;

	private EtatDeclaration(String enumValue) {
		this.enumValue = enumValue;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}
}
