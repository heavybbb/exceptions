package ErrorPack;

public class PhoneNumberError extends Exception{

    public PhoneNumberError() {
        super("Некорректная длина номера!");
    }
}
