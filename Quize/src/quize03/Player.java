package quize03;

class Player {
    private GameLevel level; // Player가 가지는 GameLevel 변수

    // 생성자에서 기본적으로 초보자 레벨로 설정
    public Player() {
        this.level = new BeginnerLevel();
    }

    // Player의 play() 메서드
    void play(int count) {
        if (level != null) {
            level.play(count); // 현재 레벨의 play() 메서드 호출
        } else {
            System.out.println("레벨이 지정되지 않았습니다.");
        }
    }

    // Player의 level을 직접 설정하는 메서드
    void upgradeLevel(GameLevel level) {
        if (level == null) {
            this.level = new BeginnerLevel(); // 레벨이 null인 경우 초보자 레벨로 설정
        } else {
            this.level = level;
        }
    }
}