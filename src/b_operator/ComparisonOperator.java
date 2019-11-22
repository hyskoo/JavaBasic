package b_operator;

import java.util.Iterator;

public class ComparisonOperator {
	public static void main(String[] args) {
		/*
		 * << 비교 연산자 >>   //형변환을 통해서 비교를 하게된다. (자동포함)
		 * - < : 작다
		 * - > : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != , <> : 같지 않다.
		 */
		
		boolean b = 10 < 20;
		System.out.println(b);
		
		b = 10 < 20 - 15;
		System.out.println(b);
		
		b = 10 <= 10.0;
		System.out.println(b);
		
		b = 65 >= 'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		b = 10.1f == 10.1; //limit의 형식으로 가깝지만 실제로 값은 다르다.
		System.out.println(b);
		
		System.out.printf("%21.20f %n", 10.1f);  // %n : 줄바꿈
		System.out.printf("%21.20f %n", 10.1);
		//float과 double은 정밀도가 달라 float을 double로 형변환하면 소숫점을 정확하게 비교할수 없다.
		
		System.out.println("----------------- 잘 모르던거 ---------------------");

		b = 10.1f == (float) 10.1;
		System.out.println(b);
		
		b = true != false;
		System.out.println(b);

		b = "abc" == "abc";
		System.out.println(b);
		b = "abc" == new String("abc"); //생성자를 통해 새로운 객체를 생성하였기에 주소가 변하였다. 
		System.out.println(b);
//		참조형 타입은 저장된 메모리 주소를 비교하므로, String은 등가비교 연산자로 내용을 비교할 수 없다.
		b = "abc".equals(new String("abc")); //내부 메소드 equals를 사용.
		System.out.println(b);
		b = !"abc".equals(new String("abc"));
		System.out.println(b);
		//같지 않다는 결과값을 얻기 위해서는 !(NOT)을 사용한다.
		
		
//		대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만,
//		등가 비교는 모든 타입을 비교할 수 있다.
		
		
		System.out.println("---------------------------  2019 - 11 - 21  ---------------------------------");
		/*
		 * 문제1.
		 */
		
		b = 1 > 2;
		System.out.println("1. 1은 2보다 큰가? " + b);
		
		b = 0 <= 100;
		System.out.println("2. 0은 100보다 작거나 같은가? " + b);
		
		b = 3.14f != 3.14;
		System.out.println("3. 3.14f와 3.14는 다른가? " +b);
		
		b = !"남자".equals(new String("여자"));  // ! 를 사용해 부정을 표현
		System.out.println("4. 남자와 여자는 다른가 " +b);
		
		
		
		int a = 50;
		String a2 = "50";
		System.out.println(String.valueOf(a) + String.valueOf(a));
		System.out.println(Integer.valueOf(a2) + Integer.valueOf(a2));
		
		
	}
}
