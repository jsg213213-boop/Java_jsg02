package PR_260124_260125;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

class Radio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("라디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끕니다.");
    }
}

public class Inverter {
    public static void main(String[] args) {
        RemoteControl myTV = new TV();
        RemoteControl myRadio = new Radio();

        myTV.turnOn();
        myRadio.turnOn();
        myTV.turnOff();
    }
}