package Com.Class.ClassWork.LoggerLaba;


import LoggerLaba.LogType;

public interface Logger {
    void log(String message);
    void log(Throwable t);
    void log(LogType type, String message);
}
