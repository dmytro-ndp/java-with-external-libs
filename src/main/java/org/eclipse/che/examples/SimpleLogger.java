package org.eclipse.che.examples;

import java.util.logging.Level;

public class SimpleLogger {
    public static void main(String[] argvs) {
        // external lib java logger with sources placed into JDK; don'r need to download sources additionally.
        java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger(SimpleLogger.class.getSimpleName());
        javaLogger.log(Level.INFO, "Info from java logger");

        // external lib ch.qos.logback with sources which are accessible by maven; need to download sources from maven repo.
        org.slf4j.Logger logbackLogger = org.slf4j.LoggerFactory.getLogger(SimpleLogger.class);
        logbackLogger.info("Info from {}", "logbackLogger");

        // external lib org.apache.log4j with sources which are NOT accessible by maven
        org.apache.log4j.Logger log4jLogger = org.apache.log4j.Logger.getLogger(SimpleLogger.class);
        log4jLogger.info("Info from log4jLogger");
    }
}
