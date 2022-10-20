
package Practica03.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="estado")

public class Estado implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nom_estado;
    private String tel_estado;
    private String cap_estado;
    private Double pob_estado;

    public Estado() {
    }

    public Estado(Long idEstado, String nom_estado, String tel_estado, String cap_estado, Double pob_estado) {
        this.idEstado = idEstado;
        this.nom_estado = nom_estado;
        this.tel_estado = tel_estado;
        this.cap_estado = cap_estado;
        this.pob_estado = pob_estado;
    }




    
    
}
