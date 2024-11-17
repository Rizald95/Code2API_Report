Title: How do I launch a completely independent process from a Java program?
Question: 
                
I am working on a program written in Java which, for some actions, launches external programs using user-configured command lines.  Currently it uses Runtime.exec() and does not retain the Process reference (the launched programs are either a text editor or archive utility, so no need for the system in/out/err streams).

There is a minor problem with this though, in that when the Java program exits, it doesn't really quit until all the launched programs are exited.  

I would greatly prefer it if the launched programs were completely independent of the JVM which launched them.

The target operating system is multiple, with Windows, Linux and Mac being the minimum, but any GUI system with a JVM is really what is desired (hence the user configurability of the actual command lines).

Does anyone know how to make the launched program execute completely independently of the JVM?



Edit in response to a comment

The launch code is as follows.  The code may launch an editor positioned at a specific line and column, or it may launch an archive viewer.  Quoted values in the configured command line are treated as ECMA-262 encoded, and are decoded and the quotes stripped to form the desired exec parameter.

The launch occurs on the EDT.

static Throwable launch(String cmd, File fil, int lin, int col) throws Throwable {
    String frs[][]={
        { "$FILE$"  ,fil.getAbsolutePath().replace('\\','/') },
        { "$LINE$"  ,(lin>0 ? Integer.toString(lin) : "") },
        { "$COLUMN$",(col>0 ? Integer.toString(col) : "") },
        };
    String[] arr; // array of parsed tokens (exec(cmd) does not handle quoted values)

    cmd=TextUtil.replace(cmd,frs,true,"$$","$");
    arr=(String[])ArrayUtil.removeNulls(TextUtil.stringComponents(cmd,' ',-1,true,true,true));
    for(int xa=0; xa<arr.length; xa++) {
        if(TextUtil.isQuoted(arr[xa])) {
            arr[xa]=arr[xa].substring(1,arr[xa].length()-1);
        }
    }

    Process p=Runtime.getRuntime().exec(arr);
    return null;
}

    
Answer: 
You can try to use ProcessBuilder instead of Runtime.exec().

Here is a simple example:

Process p = new ProcessBuilder("cmd", "/c", "dir").start();

    
Code: Process p = new ProcessBuilder("cmd", "/c", "dir").start();

Complete the code as a full Java method.

# Answer

You can try to use