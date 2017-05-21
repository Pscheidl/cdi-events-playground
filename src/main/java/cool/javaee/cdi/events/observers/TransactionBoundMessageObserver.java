package cool.javaee.cdi.events.observers;

import cool.javaee.cdi.events.observers.qualifiers.Transaction;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Named;

/**
 * Contains method that only listens to
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class TransactionBoundMessageObserver {

    public void observeBeforeTransactionCompletion(@Observes(during = TransactionPhase.BEFORE_COMPLETION) @Transaction String message) {
        System.out.println("Message from within transaction received before completion: " + message);
    }

    public void observeAfterTransactionCompletion(@Observes(during = TransactionPhase.AFTER_SUCCESS) @Transaction String message) {
        System.out.println("Message from within transaction received after success: " + message);
    }

}
