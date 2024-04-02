

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {
    @Id
    private Integer id;
    private String estado;

    public Estado() {
    }

    public Estado(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
