package ErrorPack;

public class DateError extends Exception{

    public DateError() {
        super("Не корректный формат даты!");
    }
}
