package com.jcalvopinam.concurrency;

import com.jcalvopinam.utils.Commons;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author juanca <juan.calvopina+dev@gmail.com>
 */
public class MyRunnable implements Runnable {

    private final static Logger logger = LoggerFactory.getLogger(MyRunnable.class);
    private final String threadName;
    private final int threadId;

    MyRunnable(String threadName, int threadId) {
        logger.info("Creating new thread: {} with id: [{}]", threadName, threadId);
        this.threadName = threadName;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        logger.info("Running {}, [{}]", threadId, threadName);
        try {
            for (int i = Commons.SPIN; i >= 1; i--) {
                logger.info("Thread [{}] {} is sleeping", threadId, threadName);
                Thread.sleep(Commons.SLEEP);
            }
        } catch (InterruptedException e) {
            logger.info("Thread [{}] {} interrupted", threadId, threadName);
        }
        logger.info("Thread [{}] {} exiting", threadId, threadName);
    }

}
