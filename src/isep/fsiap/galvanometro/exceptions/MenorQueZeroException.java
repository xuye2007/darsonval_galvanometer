/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isep.fsiap.galvanometro.exceptions;

/**
 *
 * @author Daniel Lopes
 */
public class MenorQueZeroException extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public MenorQueZeroException() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MenorQueZeroException(String msg) {
        super(msg);
    }
}
