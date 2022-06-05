package src.innerclass;

interface Bell {
    void ring();
}

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarm(() -> System.out.println("you can get up!"));

        Bell ring_ring = () -> System.out.println("ring ring");
        cellPhone.alarm(ring_ring);

        cellPhone.alarmOuter();
        CellPhone.BellRing bellRing = cellPhone.new BellRing();
        bellRing.ring();

        CellPhone.BellRing bellRing2 = cellPhone.getBellRingInstance();
        bellRing2.ring();
    }
}

class CellPhone {
    public void alarm(Bell bell) {
        bell.ring();
    }

    public BellRing getBellRingInstance() {
        return new BellRing();
    }

    public class BellRing implements Bell {
        public void ring() {
            System.out.println("ring ring");
        }
    }

    public void alarmOuter(){
        BellRing bellRing = new BellRing();
        bellRing.ring();
    }
}
