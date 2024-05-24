package part14_TEST;
import java.util.ArrayList;
import java.util.List;

public interface DistributionPolicy {
	   Agent distributeCall(List<Agent> agents, Customer customer);
	}
