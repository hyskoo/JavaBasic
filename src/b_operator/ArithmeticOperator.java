package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * << 산술 연산자>>
		 *  - + : 덧셈
		 *  - - : 뺄셈
		 *  - * : 곱셈
		 *  - / : 나눗셈
		 *  - % : 나머지
		 *  - 이항연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
//		a = 10 + 20 - ( ( (10 * 5) / 10) % 2);
		
		System.out.println(a);
		
		a = (int) (10 + 20.3);
		System.out.println(a);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short s = 20;
		short d = (short) (s - b);
		System.out.println(d);
		// int형보다 작은 데이터타입을 가지고 있을경우 int타입으로 형변환후 연산을 한다.
		// 따라서 연산의 결과를 대입할 변수의 타입에 맞게 형변환을 해야 한다.
		
		long l = 100000 * 100000;
		System.out.println(l);
		// 접미사 L 이 없으면 100000이 int형이므로 연산이 되기때문에 오버플로우로 인한 에러 발생
		
		long lL = 100000 * 100000L;
		System.out.println(lL);
		// 접미사 L 이 있으면  int * long형이 되는데. 이 경우 int가 상위 데이터 타입 long으로 변환되기에
		// int * long --> long * long 으로 변환되어 연산을 한다.
		
		float f1 = 10 / 4;
		System.out.println(f1);
		float f2 = 10 / 4f;
		System.out.println(f2);
		//리터럴이 int형이므로 표현범위가 넓고 소숫점을 포함하는 상위 데이터 타입인 float형으로 만들어 연산

		int f3 = 10 % 4;
		System.out.println(f3);
		
//		int zero = 10 / 0; // 런타임 에러		
		//정수는 0으로 나눌 수 없다.

		float g2 = 10.0f / 0;
		System.out.println(g2);
		//실수는 0으로 나눌때 무한대의 값이 나온다.
		
		float g3 = 0.0f / 0;
		System.out.println(g3);
		// NaN : Not a Number. 
		
		char h1 = 'A';
		char h2 = (char) (h1 + 1);
		// Char은 아스키 코드값을 가지고 있으므로 h1 + 1은 int형끼리의 덧셈이 되므로 char로 형변환이 필요
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
		
		int h4 = '5' - '0';
		System.out.println(h4);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		
		int i = 0;
		
		i = i + 1;
		i += 1;
		i += 2; //복합 연산자
		System.out.println("i = " + i);
		
		++i;	// 전위형 : 변수가 참조되기 전 수행
		i++;	// 후위형 : 변수가 참조된 후 수행
		//더하는 값이 1인 경우.
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		i = i -1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		double round = 50.6;
		System.out.println( (int) (round + 0.5));
		System.out.println( Math.round(round) );
//		반올림을 위한 방식 2개.  0.5을 더하여 int형변환. math함수 사용 (java 1.5이후)

		
		System.out.println("------------");
		double round2 = 3.14;
		System.out.println( (int) ((round2 * 10) + 0.5) / 10f );
		
		
		//코드 치기
		System.out.println("1. 다음을 계산한 결과값");
		
		int it = 123456;
		long lt = it + 654321L;
		System.out.println("1. " + lt);
		
		lt *= 123456;
		System.out.println("2. " + lt);
		
		lt /= 123456;
		System.out.println("3. " + lt);		
		
		lt -= 654321;
		System.out.println("4. " + lt);		
		
		lt %= 123456;
		System.out.println("5. " + lt);		
		
	
		System.out.println("2. 합계와 평균을 구하라 (평균은 소숫점 2자리에서 반올림)");
		
		int a1 = 30;
		int a2 = 30; 
		int a3 = 44;
		int sum = a1 + a2 + a3;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum + " / 평균 : " + (int) ((avg * 10) + 0.5) / 10.0);
		
		System.out.println(Math.ceil(avg*10)/10.0); // 소숫점 2번째에서 올림
		System.out.println(Math.floor(avg*100)/100.0); //소숫점 3번째에서 내림
		System.out.println(Math.round(avg * 1000) / 1000.0); // 소숫점 4번째에서 반올림
		
		
		
		
		
		
		
		
	}

}
