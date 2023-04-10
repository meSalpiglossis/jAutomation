package maxima.homework20221106.firstpackage;

// class StringHelper
// class StringUtils
// class FSUtils
// generateFName
// getDefaultTemporaryDir


// class AppUtils
// class DBUtils

import java.io.FileNotFoundException;
import java.io.FilePermission;

public class StaticClass {
    static public boolean doSomething1(){
        return true;
    }

    static public boolean doSomething1(int inputInteger){
        return true;
    }

    static public boolean doSomething1(String inputString){
        return true;
    }

    static public boolean doSomething2(){
        return true;
    }

    static public boolean doSomething3(){
        return true;
    }

    static public boolean checkFile(String fileNamePath) throws FileNotFoundException, Exception{
        // 1) Open file
        // 1.5) Can't find file
        // 2) - 522) Read data from file and check

        boolean findFile = false;
        // Can't find file
        if(!findFile){
            throw new FileNotFoundException(fileNamePath + " not found");
        }

        boolean openFile = false;
        // Can't open file
        if(!openFile){
            throw new Exception();
        }

        return false;
    }
}
