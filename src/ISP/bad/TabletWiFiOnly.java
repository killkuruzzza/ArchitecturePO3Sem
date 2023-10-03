package ISP.bad;

public class TabletWiFiOnly implements MobileDevice{

    @Override
    public void makeCall() {
        throw new Exception("У меня нет модуля мобильной связи!");

    }

    @Override
    public void sendSms() {
        throw new Exception("У меня нет модуля мобильной связи!");
    }
    ublic void takePicture() {
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
