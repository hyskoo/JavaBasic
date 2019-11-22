package b_operator;

public class Etc {
	public static void main(String[] args) {
		/*
		 * << 비트 연산자 >>
		 * - & ( OR ) : 피연산자 중 한쪽이라도 값이 1이면, 1을 그외는 0을 반환
		 * - | ( AND ) : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^ ( XOR ) : 피연산자 값이 서로 다를때만 1을 같일때는 0을 결과값으로
		 * - ~ ( 비트전환 ) : 피연산자를 0 은 1로 1은 0으로
		 * - << ( 좌측 쉬프트 ) : 피연산자 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다
		 * - >> ( 우측 쉬프트 ) : 피연산자 각 자리를 오른쪽으로 이동싴민다. 빈칸은 앞자리와 동일한 값으로 채운다(1이면 음수)
		 * 
		 * << 기타 연산자 >>
		 * - . ( 참조연산자 ) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - ( type ) : 형변환( casting )
		 * - 조건식 ? ture결과 : false결과 ==> 조건식의 결과에 따라 true 또는 false의 결과를 실행 
		 * - instanceof : 참조형 타입 확인
		 */
		
		// 1byte = 8bit. 1bit는 0 과 1 로 이루어짐.
		
		/*
		 * - 10진수 -> 2진수 : 10진수 값을 1이 될때까지 2로 나눈다.
		 */
		
		int a = 121245874;
		int nam;
		do {
			nam = a % 2;
			a = a /2;
			System.out.print("[ "+nam+" ]");
		} while (a != 0);
		System.out.println("\n");
		
			
		// ~ : 11110101  -- [ -11 ]
		System.out.println(~10);
		// << : 00010100
		System.out.println(10 << 1);
		// >> : 00000101
		System.out.println(10 >> 1);
		
		//삼항연산자

		int score = 60;
		String res = score >= 60 ? "합격" : "불합격";
		System.out.println(score + "점은 " + res + "입니다." );

		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 \""+ gender + "\" 입니다");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "자웅동체");
		System.out.println("당신의 성별은 \""+ gender + "\" 입니다");
		
		
		int num1, num2, result;
		
		num1 = 500;
		num2 = 55;
		
		result = num1 > num2 ? num1 : num2;
		System.out.println(result);
		
		//절대값 출력
		int num3 = -5;
		result = num3 <= -1 ? num3 * (-1) : num3;
		System.out.println(result);
		
		
		
		
		regNo = 5;
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : (regNo == 3 ? "남자" : (regNo == 4 ? "여자" : "자웅동체")));
		//위는 하드코딩
		gender = regNo == 1 || regNo == 3 ? "남자" : regNo == 2 || regNo == 4 ? "여자" : "확인불가";
		System.out.println("당신의 성별은 \""+ gender + "\" 입니다");
		
		
	}
}
