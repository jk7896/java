package part14_TEST;
import java.util.ArrayList;
import java.util.List;
public class CallCenter {
	 private List<Agent> agents;
	    private DistributionPolicy distributionPolicy;

	    public CallCenter() {
	        agents = new ArrayList<>();
	        // 상담원 추가
	        agents.add(new Agent("상담원1"));
	        agents.add(new Agent("상담원2"));
	        agents.add(new Agent("상담원3"));
	        // 기본 배분 정책 설정
	        distributionPolicy = new EqualCountPolicy();
	    }

	    public void setDistributionPolicy(DistributionPolicy policy) {
	        this.distributionPolicy = policy;
	    }

	    public Agent receiveCall(Customer customer) {
	        return distributionPolicy.distributeCall(agents, customer);
	    }
	}

