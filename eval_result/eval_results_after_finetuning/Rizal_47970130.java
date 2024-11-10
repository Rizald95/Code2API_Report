

static String filterSecretKeyOutOfCommandLineLogString(final String[] args) {
    return joinArgsToString(filterOptionAndValueOutOfCommandLineLogString(SECRET_KEY, args));
}

private static String joinArgsToString(final String[] args) {
    return Joiner.on(ARG_JOINER_DELIMITER).join(args);
}

private static String[] filterOptionAndValueOutOfCommandLineLogString(final Option option, final String[] args) {
    final List<String> filteredList = new ArrayList<>();

    final int numArgs = args.length;

    for (int i = 0; i < numArgs; ++i) {
        if (Arguments.matchesOption(option, args[i])) {
            ++i;
         } else {
             filteredList.add(args[i]);
         }
     }

     return filteredList.toArray(new String[0]);
}

    
