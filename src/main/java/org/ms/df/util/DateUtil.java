package org.ms.df.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Mateusz on 2017-03-26.
 */
public class DateUtil {


    private static final String DATE_PATTERN = "dd.MM.yyyy";

    private static final DateTimeFormatter DATE_FORMATTER =
            DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static String format(LocalDate date) {
        if (date == null) {
            return null;
        }
        return DATE_FORMATTER.format(date);
    }
}
