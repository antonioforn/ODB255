
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cup {
    @Id @GeneratedValue  private long id;
    
}
