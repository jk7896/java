package part14_TEST;

public class Main {
	public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        // 테스트: 동일 건수 정책
        callCenter.setDistributionPolicy(new EqualCountPolicy());
        Customer customer1 = new Customer(1);
        callCenter.receiveCall(customer1);

        // 테스트: 동일 시간 정책
        callCenter.setDistributionPolicy(new EqualTimePolicy());
        Customer customer2 = new Customer(2);
        callCenter.receiveCall(customer2);

        // 테스트: 업무 능력우선 정책
        callCenter.setDistributionPolicy(new SkillPriorityPolicy());
        Customer customer3 = new Customer(3);
        callCenter.receiveCall(customer3);
    }
}