
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingrediente {
    @Id
    private Integer id;
    private String ingrediente;
    private Integer inventario;

    public Ingrediente() {
    }

    public Ingrediente(Integer id, String ingrediente, Integer inventario) {
        this.id = id;
        this.ingrediente = ingrediente;
        this.inventario = inventario;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }
}
