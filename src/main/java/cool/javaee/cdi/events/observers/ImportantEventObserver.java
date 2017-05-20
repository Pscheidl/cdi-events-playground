package cool.javaee.cdi.events.observers;

import cool.javaee.cdi.events.observers.qualifiers.Important;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * A bean with a method listening only to important messages.
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class ImportantEventObserver {

    /**
     * A method observing only events with important messages
     *
     * @param importantMessage Important message
     */
    public void observeSecretMessage(@Important String importantMessage) {
        System.out.println("Important message received: " + importantMessage);
    }

}
