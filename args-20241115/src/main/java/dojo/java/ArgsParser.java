package dojo.java;

public class ArgsParser {
    public boolean isFlag(String arg) {
        return false;
    }

    public boolean isValue(String arg) {
        return arg.length() > 0;
    }
}
