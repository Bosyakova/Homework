package Com.Class.ClassWork.LoggerLaba;


import LoggerLaba.BaseLogger;
import LoggerLaba.LogType;
import LoggerLaba.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = new BaseLogger("log.txt");
        logger.log("Hello");
        logger.log(new Exception("shit happened"));
        logger.log(LogType.WARNING, "ALLOOO");
    }
}

