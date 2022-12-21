package ma.gov.douane.sdawsd.model;

public enum NatureTitre {
	
	ACTIONS("ACTIONS"), OBLIGATIONS("OBLIGATIONS"), BON_DE_CAISSE(
			"BON DE CAISSE"), AUTRES("AUTRES");

	/**
	 * Enumeration value
	 */
	private String enumValue;

	private NatureTitre(String enumValue) {
		this.enumValue = enumValue;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}
		

}
