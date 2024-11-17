Title: Java: How to display weekday, month and date and no year in locale sensitive manner
Question: 
                
In my app I need to display dates in a locale-sensitive manner. So "Thursday, May 10, 2018" should display as is in en_US but should display as "Thursday, 10 May 2018" in en_GB (English Great Britain).

In most cases I can use the following style of code with java.time API classes:

public String toString(ZonedDateTime input) {
    DateTimeFormatter dateTimeFormatter = getDateTimeFormatter(FormatStyle.MEDIUM, FormatStyle.SHORT);
    return input.format(dateTimeFormatter);
}

private DateTimeFormatter getDateTimeFormatter(FormatStyle dateStyle, FormatStyle timeStyle) {
    String pattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
            dateStyle, timeStyle, IsoChronology.INSTANCE, Locale.getDefault());

    return DateTimeFormatter.ofPattern(pattern);
}


In such cases I do not specify an explicit date pattern but instead specify a symbolic FormatStyle.

I am not sure of the best way to handle case where there is no standard FormatStyle that meets my needs.

A concrete example is where I need to show Day of Week, Month and Date but no year.

So "Thursday, May 10, 2018" should display as "Thursday, May 10" in en_US but should display as "Thursday, 10 May" in en_GB (English Great Britain).

Any suggestions on how to handle this requirement?
    
Answer: 
    String formatPattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
            FormatStyle.FULL, null, IsoChronology.INSTANCE, loc);
    formatPattern = formatPattern.replaceFirst("^.*?([MLdEec].*[MLdEec]).*$", "$1");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(formatPattern, loc);
    System.out.println(LocalDate.now(ZoneId.of("Pacific/Johnston")).format(dateFormatter));


Output with loc equal to Locale.US:

Thursday, May 10

Output with loc equal to Locale.UK:

Thursday, 10 May


Complete the code as a full Java method.

# Answer

String formatPattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
        FormatStyle.FULL, null, IsoChronology.INSTANCE, loc);
formatPattern = formatPattern.replaceFirst("^.*?([MLdEec].*[MLdEec]).*$", "$1");
DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(formatPattern, loc);
System.out.println(LocalDate.now(ZoneId.of("Pacific/John