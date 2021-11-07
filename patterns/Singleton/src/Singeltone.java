public class Singeltone {

    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("1 log...");
        ProgramLogger.getProgramLogger().addLogInfo("2 log...");
        ProgramLogger.getProgramLogger().addLogInfo("3 log...");

        ProgramLogger.getProgramLogger().showLogFile();


    }
}