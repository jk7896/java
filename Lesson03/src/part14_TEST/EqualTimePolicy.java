package part14_TEST;
import java.util.ArrayList;
import java.util.List;
public class EqualTimePolicy implements DistributionPolicy {
	 @Override
	    public Agent distributeCall(List<Agent> agents, Customer customer) {
	        Agent selectedAgent = null;
	        int minCallCount = Integer.MAX_VALUE;
	        for (Agent agent : agents) {
	            if (agent.getCallCount() < minCallCount) {
	                minCallCount = agent.getCallCount();
	                selectedAgent = agent;
	            }
	        }
	        if (selectedAgent != null) {
	            selectedAgent.incrementCallCount();
	        }
	        return selectedAgent;
	    }
	}