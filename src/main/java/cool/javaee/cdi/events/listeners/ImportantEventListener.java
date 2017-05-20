/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
