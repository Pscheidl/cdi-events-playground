package cool.javaee.cdi.events.observers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;

/**
 * A class containing a method listening to all events of String type
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class SimpleEventObserver {

    /**
     * Observes all events with String generic type.
     *
     * @param message Message from the event
     */
    private void simplyObserve(@Observes String message) {
        System.out.println("Simply observed: " + message);
    }

}
