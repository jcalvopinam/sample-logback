package com.jcalvopinam.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class Mac extends OS {

    private static final Logger logger = LoggerFactory.getLogger(Mac.class);

    @Override
    public String getName() {
        return "Mac OS Sierra";
    }

    @Override
    public String getVersion() {
        logger.debug(String.format("%s 10.12.3", this.getName()));
        return "10.12.3";
    }

}
