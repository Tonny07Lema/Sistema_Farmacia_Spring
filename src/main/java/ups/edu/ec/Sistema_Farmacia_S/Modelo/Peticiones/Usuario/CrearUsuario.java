package ups.edu.ec.Sistema_Farmacia_S.Modelo.Peticiones.Usuario;

import com.fasterxml.jackson.annotation.JsonProperty;
import ups.edu.ec.Sistema_Farmacia_S.Modelo.Entidad;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

public class CrearUsuario {
    @JsonProperty
    private String usuario;
    @JsonProperty
    private String contrasenia;
    @JsonProperty
    private String cedula;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
