package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogFIle("First log...");
        ProgramLogger.getProgramLogger().addLogFIle("Second log...");
        ProgramLogger.getProgramLogger().addLogFIle("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
