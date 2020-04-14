package Com.Class.ClassWork.LoggerLaba;

import LoggerLaba.LogType;
import LoggerLaba.Logger;


public abstract class AbstractLogger implements Logger {

    protected abstract String constructLogMessage(LogType type, String message);
    protected abstract boolean writeLog(String message);

    @Override
    public void log(String message) {
        String LogMessage = constructLogMessage(LogType.INFO, message);
        writeLog(LogMessage);
    }
    @Override
    public void log(LogType type, String message) {
        String LogMessage = constructLogMessage(LogType.WARNING, message);
        writeLog(LogMessage);
    }
    @Override
    public void log(Throwable t)   {
        String LogMessage = constructLogMessage(LogType.ERROR, t.getMessage());
        writeLog(LogMessage);
    }
}


