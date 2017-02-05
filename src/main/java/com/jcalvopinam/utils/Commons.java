package com.jcalvopinam.utils;

import java.util.UUID;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class Commons {

    public static final String PID = "PID";
    public static final int SPIN = 3;
    public static final int SLEEP = 50;

    public static String generatePid() {
        return UUID.randomUUID().toString();
    }

}
