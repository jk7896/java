package quize03;

class AdvancedLevel extends GameLevel {
    @Override
    void run() {
        System.out.println("****중급자 레벨입니다.****");
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 jump를 합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn을 할 수 없습니다.");
    }
}