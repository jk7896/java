package ch11;
import java.util.*;
public class c03_SwitchCase {

	public static void main(String[] args) {
		//switch = case 를 통한 분기제어
		//입력한 달의 일수를 반환하여 표시하는 프로그램
		System.out.println("일을 보고자하는 월을 입력하세요");
		//int a= new Scanner(System.in).nextInt(); // 한번만 사용가능, Scanner 기능 모음에 있는 특정 기능을 한번만 사용하는 방식
		Scanner sc = new Scanner(System.in); //아래에서 계속해서 사용가능
		
		int month = sc.nextInt();
		int day;
		/*
		switch(month) {
			case(1):
			{
				day=31;
				break;
			}
			
			case(2):
			{
				day=28;
				break;
			}
			case(3):
			{
				
				day=31;
				break;
			}
			case(4):
			{
				day=30;
				break;
			}
			case(5):
			{
				day=31;
				break;
			}
			case(6):
			{
				day=30;
				break;
			}
			case(7):
			{
				day=31;
				break;
			}
			case(8):
			{
				day=31;
				break;
			}
			case(9):
			{
				day=30;
				break;
			}
			case(10):
			{
				day=31;
				break;
			}
			case(11):
			{
				day=30;
				break;
			}
			case(12):
			{
				day=31;
				break;
			}
			default:
			{
				day =0;
				System.out.println("존재하지 않는 달입니다.");
			}	
		 	
		}
		*/
		/*
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:	
			case 12:
				day=31;
				break;
			case 2:
				day=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			default:
				day =0;
				System.out.println("존재하지 않는 달입니다.");
		}
		System.out.println(month + "월은 " + day + "일입니다.");
		*/
		int iDay;
		iDay=switch(month) {
		case 1,3,5,7,8,10,12 -> {
			yield 31;
		}
		case 4,6,9,11-> {
			yield 30;
		}
		case 2-> {
			yield 28;
		}
		default->{
			System.out.println("존재하지 않는 달입니다.");
			yield 0;
			}
		};
	System.out.println(month + "월은 " + iDay + "일입니다.");
	}

}
