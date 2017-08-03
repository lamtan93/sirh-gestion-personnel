package dev.sgp.entite;

public enum TypeCollabEvt {
	
	CREATION_COLLAB("creation_collab"), MODIFICATION_COLLAB("modification_collab");
	
	
	
	private String libelle;
	
	 private TypeCollabEvt(String libelle){
		 this.libelle = libelle;
	 }

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	 
	public static TypeCollabEvt valueByLabel(String label){
		
		for (TypeCollabEvt collabEvt : values()) {
			if(collabEvt.getLibelle().equals(label)){
				return collabEvt;
			}
		}
		return null;
	}

}
