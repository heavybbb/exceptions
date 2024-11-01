package ErrorPack;

public class DataLengthError extends Exception {


    public DataLengthError() {

        super("Ошибка количества данных,заполните все поля корректно!");
    }
}
