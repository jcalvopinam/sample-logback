package com.jcalvopinam.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class Linux extends OS {

    private static final Logger logger = LoggerFactory.getLogger(Linux.class);

    @Override
    public String getName() {
        return "Linux Ubuntu";
    }

    @Override
    public String getVersion() {
        logger.info(String.format("%s 16", this.getName()));
        return "16";
    }

}
