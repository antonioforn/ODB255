

package entities;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Team {
    @Id String teamName;
    @ManyToMany (mappedBy="teams",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Cup> cups;

    public Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<Cup> getCups() {
        return cups;
    }

    public void setCups(Set<Cup> cups) {
        this.cups = cups;
    }
    
}
