package ErrorPack;

public class FullNameError extends Exception{

    public FullNameError() {
        super("Заполните ФИО корректно!");
    }
}
