package quize03;

class BeginnerLevel extends GameLevel {
    @Override
    void run() {
        System.out.println("****초급자 레벨입니다. ****");
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump를 할 수 없습니다.");
    }

    @Override
    void turn() {
        System.out.println("turn을 할 수 없습니다.");
    }
}
