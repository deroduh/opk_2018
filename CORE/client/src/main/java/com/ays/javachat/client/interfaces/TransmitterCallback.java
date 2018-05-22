/**
 * <p> TransmitterCallback interface </p>
 */

package com.ays.javachat.client.interfaces;

/**
 * Is using to pass received objects and notify about connection problem *
 */
public interface TransmitterCallback {
    /**
     * Receives object *
     */
    public void receiveObject(Object o);

    /**
     * Notifies about connection problem *
     */
    public void connectionDown();
}
