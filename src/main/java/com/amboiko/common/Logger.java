package com.amboiko.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void info(final String message) {
        System.out.println(
                "[INFO: "
                        + (LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))
                        + "]: "
                        + message
        );
    }

    public static void coloredInfo(final String message) {
        System.out.println(
                "[INFO: "
                        + (LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))
                        + "]: "
                        + ANSI_GREEN
                        + message
                        + ANSI_RESET
        );
    }

    public static void error(final String message) {
        System.out.println(
                "[ERROR: "
                        + (LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))
                        + "]: "
                        + ANSI_RED
                        + message
                        + ANSI_RESET
        );
    }
}
