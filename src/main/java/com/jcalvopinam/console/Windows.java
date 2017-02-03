package com.jcalvopinam.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class Windows extends OS {

    private static final Logger logger = LoggerFactory.getLogger(Windows.class);

    @Override
    public String getName() {
        return "Windows";
    }

    @Override
    public String getVersion() {
        logger.error(String.format("%s 10", this.getName()));
        return "10";
    }

}
