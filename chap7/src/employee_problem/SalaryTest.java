package employee_problem;
/**
 * 각 배열에 저장된 내용을 아래와 같이 출력하라! 
 * 사번 : 이름 : 본봉 : 총급여 
 * @author Administrator
 *
 */
public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		
		e[0] = new Employee
		(1000,"이사원",10000,5000);
		e[1] = new Manager
		(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer
		(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary
		(4000,"최비서",15000,7000,10000);
		
		for(int i = 0; i < e.length; i++) {
		System.out.println(e[i].id +" : " + e[i].name 
				+ " : " + e[i].salary + " : " +e[i].totalSalry());
		}
	}

}
