package part14_TEST;

public class Agent {
	  private String name;
	    private int callCount;

	    public Agent(String name) {
	        this.name = name;
	        this.callCount = 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getCallCount() {
	        return callCount;
	    }

	    public void incrementCallCount() {
	        callCount++;
	    }
	}
