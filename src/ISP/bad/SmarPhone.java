package ISP.bad;

public class SmarPhone implements MobileDevice {
    @Override
    public void makeCall() {
        System.out.println("Я звоню");
    }

    @Override
    public void sendSms() {
        System.out.println("Я  посылаю смски");
    }

    @Override
    public void takePicture() {
        System.out.println("Я фотографирую");
    }

    @Override
    public void surfTheWeb() {
        System.out.println("Я просматриваю интернет-страницы");
    }

    @Override
    public void playMusic() {
        System.out.println("Я проигрываю музыку");
    }
}
