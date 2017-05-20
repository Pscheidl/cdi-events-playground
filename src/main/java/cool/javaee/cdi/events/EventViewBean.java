package cool.javaee.cdi.events;

import cool.javaee.cdi.events.database.MessageSaver;
import cool.javaee.cdi.events.observers.qualifiers.Important;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@RequestScoped
public class EventViewBean implements Serializable {

    @Inject
    private Event<String> simpleMessageEvent;

    @Inject
    @Important
    private Event<String> importantMessageEvent;

    @Inject
    private MessageSaver messageSaver;

    /**
     *
     * @param message Fires simple event with the message received from the
     * website frontend. Event listeners without any additional qualifiers will
     * receive this event.
     */
    public void sendSimpleMessage(String message) {
        simpleMessageEvent.fire(message);
    }

    /**
     *
     * @param message Fires simple event with the message received from the
     * website frontend. Event listeners without any additional qualifiers will
     * receive this event.
     */
    public void sendImportantMessage(String message) {
        importantMessageEvent.fire(message);

    }

    /**
     *
     * @param message Fires simple event with the message received from the
     * website frontend. Event listeners without any additional qualifiers will
     * receive this event.
     */
    public void sendImportantMessageAlternatively(String message) {
        simpleMessageEvent.select(new AnnotationLiteral<Important>() {
        })
                .fire(message);

    }

    /**
     *
     * @param message Persists a message into database. Inside the
     * saveMessageToDatabase method, an event is fired.
     */
    public void sendMessageToTransactionEvent(String message) {
        messageSaver.saveMessageToDatabase(message);
    }

}
