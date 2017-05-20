package cool.javaee.cdi.events.listeners;

import cool.javaee.cdi.events.listeners.qualifiers.Important;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class ImportantEventListener {

    public void listenToSecretMessage(@Important String secretMessage) {
        System.out.println("Important message received: " + secretMessage);
    }

}
