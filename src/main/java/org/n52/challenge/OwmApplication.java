
package org.n52.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Matthes Rieke <m.rieke@52north.org>
 */
public class OwmApplication {
    
    private static final Logger LOG = LoggerFactory.getLogger(OwmApplication.class);
    
    public static void main(String[] args) {
        LOG.info("{} started", OwmApplication.class.getSimpleName());
    }

}
