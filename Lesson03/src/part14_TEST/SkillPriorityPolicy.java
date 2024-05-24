package part14_TEST;
import java.util.ArrayList;
import java.util.List;
public class SkillPriorityPolicy implements DistributionPolicy {
	 @Override
	    public Agent distributeCall(List<Agent> agents, Customer customer) {
	        Agent selectedAgent = null;
	        int maxGrade = Integer.MIN_VALUE;
	        for (Agent agent : agents) {
	            if (agent.getCallCount() == 0) {
	                if (customer.getGrade() > maxGrade) {
	                    maxGrade = customer.getGrade();
	                    selectedAgent = agent;
	                }
	            }
	        }
	        if (selectedAgent != null) {
	            selectedAgent.incrementCallCount();
	        }
	        return selectedAgent;
	    }
	}