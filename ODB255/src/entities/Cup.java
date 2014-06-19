
package entities;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cup {
    @Id @Column (name= "championship") 
    private String championship;
    
    @ManyToMany (fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(name="CUP_TEAM",
        joinColumns= 
                @JoinColumn(name="C", referencedColumnName="championship"),
        inverseJoinColumns=
                @JoinColumn(name="T", referencedColumnName="teamName")            
    ) private Set<Team> teams;

    public Cup() {
    }

    public Cup(String championship) {
        this.championship = championship;
    }

    public String getChampionship() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
    
    
    
}
