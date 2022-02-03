/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escuela;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Direccion")
public class Direccion implements Serializable{
    
    @Id
    @Column(name="Id")
    private int id;
   
    @Column(name="Pueblo")
    private String pueblo;
    
    @Column(name="Calle")
    private String calle;

    public Direccion() {
    }

    public Direccion(int id, String pueblo, String calle) {
        this.id = id;
        this.pueblo = pueblo;
        this.calle = calle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    
    
    
}
