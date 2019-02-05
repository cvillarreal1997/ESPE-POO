
package ec.edu.espe.STPCSProject.model;

/**
 *  This clase save the information of any type of material
 * @author Jose
 * @since 0.1
 * @version 1.0
 */
public class Material 
{
    private String typeOfMaterial;
    private Provider provider;
    private String identificationCode;//Agregar el modelo

    Material() {
        
    }

    /**
     * @return the typeOfMaterial
     */
    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    /**
     * @param typeOfMaterial the typeOfMaterial to set
     */
    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    /**
     * @return the provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Material(String typeOfMaterial, Provider provider) {
        this.typeOfMaterial = typeOfMaterial;
        this.provider = provider;
    }

    /**
     * @return the identificationCode
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /**
     * @param identificationCode the identificationCode to set
     */
    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }
    
}
