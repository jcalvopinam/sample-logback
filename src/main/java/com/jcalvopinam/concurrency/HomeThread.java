package com.jcalvopinam.concurrency;

import com.jcalvopinam.console.Linux;
import com.jcalvopinam.console.Mac;
import com.jcalvopinam.console.Windows;
import com.jcalvopinam.utils.Commons;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class HomeThread {

    private final static Logger logger = LoggerFactory.getLogger(HomeThread.class);

    public static void main(String[] args) {

        for (int spin = 1; spin <= Commons.SPIN; spin++) {
            // Clean the MDC data
            MDC.clear();
            // Set additional metadata
            MDC.put(Commons.PID, String.format("PID: [%s]", Commons.generatePid()));

            createThread(spin, new Windows().getName());
            createThread(spin, new Linux().getName());
            createThread(spin, new Mac().getName());
        }

    }

    private static void createThread(int spin, String name) {
        Runnable task = new MyRunnable(name, spin);
        Thread thread = new Thread(task);
        thread.setName(String.format("%s", name));
        thread.start();
        logger.info("The thread [{}] {} has started", spin, thread.getName());
    }

}
