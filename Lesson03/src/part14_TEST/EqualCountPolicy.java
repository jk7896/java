package part14_TEST;
import java.util.ArrayList;
import java.util.List;
public class EqualCountPolicy implements DistributionPolicy {
	 @Override
	    public Agent distributeCall(List<Agent> agents, Customer customer) {
	        for (Agent agent : agents) {
	            if (agent.getCallCount() == 0) {
	                agent.incrementCallCount();
	                return agent;
	            }
	        }
	        return null; // 모든 상담원이 이미 통화 중인 경우
	    }
	}
