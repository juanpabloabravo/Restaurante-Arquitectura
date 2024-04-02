
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class IngredienteReceta {
    @Id
    private Integer id;
    private Integer cantidad;
    
    @ManyToOne
    private Ingrediente ingrediente;

    @ManyToOne
    private Receta receta;

    public IngredienteReceta() {
    }

    public IngredienteReceta(Integer id, Integer cantidad, Ingrediente ingrediente, Receta receta) {
        this.id = id;
        this.cantidad = cantidad;
        this.ingrediente = ingrediente;
        this.receta = receta;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
