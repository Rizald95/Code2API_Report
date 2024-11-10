package com.stackoverflow.api;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Human50277971 {

  public static String weekdayMonthDate(Locale loc) {
    String formatPattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
      FormatStyle.FULL,
      null,
      IsoChronology.INSTANCE,
      loc
    );
    formatPattern =
      formatPattern.replaceFirst("^.*?([MLdEec].*[MLdEec]).*$", "$1");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(
      formatPattern,
      loc
    );
    return LocalDate.now(ZoneId.of("Pacific/Johnston")).format(dateFormatter);
  }
}
