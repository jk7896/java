package quize03;

class SuperLevel extends GameLevel {
    @Override
    void run() {
        System.out.println("****고급자 레벨입니다.****");
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높이 jump를 합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn을 합니다.");
    }
}