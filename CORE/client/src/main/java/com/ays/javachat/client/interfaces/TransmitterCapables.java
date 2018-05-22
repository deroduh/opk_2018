/**
 * <p> TransmitterCapables interface </p>
 */


package com.ays.javachat.client.interfaces;

import com.ays.javachat.common.datatypes.IPPort;


/**
 * Shows what communication object ( transmitter ) can do *
 */
public interface TransmitterCapables {
    /**
     * Connects to the ip-port. If case of success returns 0 *
     */
    public int connect(IPPort ipport);

    /**
     * Disconnects from server *
     */
    public void disconnect();

    /**
     * Sends object to the server. In case of success returns 0 *
     */
    public int sendObject(Object o); // must be a synchronized
}
