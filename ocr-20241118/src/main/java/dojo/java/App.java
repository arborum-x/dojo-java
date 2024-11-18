package dojo.java;

public class App 
{
    public static void main( String[] args )
    {
        FileReader reader = new OcrReader();
	reader.readFile(args[0]);
    }
}
