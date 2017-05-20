package cool.javaee.cdi.events.listeners;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class SimpleEventListener {

    private void simplyListen(@Observes String message) {
        System.out.println("Simply listened to: " + message);
    }

}
