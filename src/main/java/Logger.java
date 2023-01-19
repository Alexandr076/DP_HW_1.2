public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger != null) {
            return logger;
        }
        else {
            return logger =  new Logger();
        }
    }

    private Logger() {
        this.num++;
    }
}