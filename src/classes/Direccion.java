package classes;

public class Direccion {

    private String zipcode;
    private String calle;
    private String distrito;
    private String provincia;

    public Direccion(String zipcode, String calle, String distrito, String provincia) {
        this.zipcode = zipcode;
        this.calle = calle;
        this.distrito = distrito;
        this.provincia = provincia;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
