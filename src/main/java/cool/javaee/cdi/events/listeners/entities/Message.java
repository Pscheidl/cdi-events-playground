package cool.javaee.cdi.events.listeners.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Entity
public class Message implements Serializable {

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntity() {
        return message;
    }

    public void setEntity(String entity) {
        this.message = entity;
    }

}
