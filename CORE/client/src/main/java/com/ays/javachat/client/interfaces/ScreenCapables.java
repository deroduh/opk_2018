/**
 * <p> ScreenCapables interface </p>
 */

package com.ays.javachat.client.interfaces;

import com.ays.javachat.common.messages.Message;


/**
 * This interface shows what can sreen object do  *
 */
public interface ScreenCapables {
    /**
     * Calls when server sent message object *
     */
    public void replyReceived(Message message);

    /**
     * Calls when connection is down or connection problem *
     */
    public void connectionDown();

    /**
     * Shows and init main frame *
     */
    public void start();
}
