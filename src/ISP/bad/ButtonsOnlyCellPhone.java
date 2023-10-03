package ISP.bad;

public class ButtonsOnlyCellPhone implements MobileDevice {
    @Override
    public void makeCall() {
        System.out.println("Я звоню");
    }

    @Override
    public void sendSms() {
        System.out.println("Я посылаю смски");
    }

    @Override
    public void takePicture() throws Exception {
        throw new Exception("У меня нет камеры!");
    }

    @Override
    public void surfTheWeb() {
        throw new Exception("У меня нет браузера!");
    }

    @Override
    public void playMusic() {
        throw new Exception("У меня нет карты памяти чтобы хранить музыку!");
    }
}
