package ErrorPack;

public class NumberParsingError extends Exception{

    public NumberParsingError() {
        super("Некорректный формат номера!");
    }
}
