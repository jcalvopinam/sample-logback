package com.jcalvopinam.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final String PID = "123-CONSOLE-987";

    public static void main(String[] args) {

        MDC.put("PID", String.format("PID: [%s]", PID));
        logger.debug("OS from Console");

        OS windows = new Windows();
        windows.getName();
        windows.getVersion();
        windows.getArchitecture();

        OS linux = new Linux();
        linux.getName();
        linux.getVersion();
        linux.getArchitecture();

        OS mac = new Mac();
        mac.getName();
        mac.getVersion();
        mac.getArchitecture();
    }
}
