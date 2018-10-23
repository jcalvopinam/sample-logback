package com.jcalvopinam.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author juanca <juan.calvopina@gmail.com>
 */
public class OS {

    private static final Logger logger = LoggerFactory.getLogger(OS.class);

    private String name = "undefined";
    private String version = "undefined";
    private String architecture = "undefined";

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        logger.info(String.format("%s - Architecture 64 bits", this.getName()));
        return architecture;
    }

}
