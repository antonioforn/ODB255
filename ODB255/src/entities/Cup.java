
package entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cup {
    @Id @Column (name= "championship") 
    private String championship;
    
    @ManyToMany
    @JoinTable(name="CUP_TEAM",
        joinColumns= 
                @JoinColumn(name="CupName", referencedColumnName="championship"),
        inverseJoinColumns=
                @JoinColumn(name="TeamName", referencedColumnName="teamName")            
    ) private Set<Team> teams;
    
}
