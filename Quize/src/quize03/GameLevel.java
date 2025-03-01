package quize03;

abstract class GameLevel {
	    // 추상 메서드 run(), jump(), turn() 선언
	    abstract void run();
	    abstract void jump();
	    abstract void turn();

	    // 템플릿 메서드 play() 정의
	    final void play(int count) {
	        run();
	        for (int i = 0; i < count; i++) {
	            jump();
	        }
	        turn();
	    }
	}
