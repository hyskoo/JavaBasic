package b_operator;

public class LogicalOperator {
	
	public static void main(String[] args) {
		/*
		 * << 논리 연산자 >>
		 * - && ( AND ) : 피연산자가 둘다 true면 true 리턴
		 * - || ( OR ) : 피연사자중 하나가 true면 true 리턴
		 * - ! ( NOT ) : 피연산자가 true이면 false, false이면 true 리턴
		 * - 피연산자로 boolean이면 허용한다.
		 */
		
		boolean b;
		
		int a = 6;
		//1. a가 0초과 10이하
		
		b = a > 0 && a <= 10;
		System.out.println(b);
		
		b = a%2==0 || a%3==0;
		System.out.println(b);
		
		b = (a%2==0 || a%3==0) && a <= 10;
		System.out.println(b);
		
		
		System.out.println("------------- 문자비교 ------------");
		char c = 'l';
		// c는 숫자인가?
		b = '0' <= c && c <= '9';
		System.out.println(b);
		// c는 영문소문자인가?
		b = 'a' <= c && c <= 'z';
		System.out.println(b);
		// c는 영문자인가?
		b = ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
		System.out.println(b);
		
//		논리 연산자는 효율적인 연산을 한다.
//		왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.

		b = true && true;
		b = true && false;
		b = false && true;  // false가 나왔으므로 오른쪽 true를 계산하지않음
		b = false && false;
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		int d = 10;
		b = d <10 && 0 < d++;
		System.out.println(d);  // d++ 실행되지 않으므로 d가 10의 값을 유지한다.
		
		b = !b;
		System.out.println(b);
		b = !(10 < 20);
		System.out.println(b);
		
		int x=1, y=2;
		
		//산술연산 > 비교연산 > 논리연산 순으로 우선순위가 높다.
		
		System.out.println("--------------문제시작2---------------");
//		문제1.
		b = x%2 == 0 && x < 10;
		System.out.println(b);
		
//		문제2.
		b = x%2 == 0 || x%3 == 0 || x%5 == 0;
		System.out.println(b);
	}
}
