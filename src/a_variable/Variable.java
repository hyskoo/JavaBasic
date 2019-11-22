package a_variable;

public class Variable {

	public static void main(String[] args) {
		/*
		  << 변수 >>
		  - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		  
		  << 사용 가능한 기본형 데이터의 종류 >>
		  - 정수 : byte, short, int, long
		  - 실수 : float, double
		  - 문자 : char
		  - 논리 : boolean
		  
		  - byte는 8개의 bit로 이루어져 있다.
		  - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지, 그것의 이름은 무엇인지 알려줘야 한다.
		 */
		
		//변수 선언 방법 : 데이터 타입 : 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 9개의 변수를 선언해주세요.
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(_byte); //컴파일 에러 발생(문법이 틀렸다.)
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		// = (대입연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		_byte = 127; //타입에 맞는 값을 저장해야 한다.
		_short = 30000;
		_int = 20;
		_long = 900L; // long 접미사 : L
		_float = 3.14f; // float 접미사 : f
		_double = 3.14; // double 접미사 : d (생략가능)
		_char = '가';
		_boolean = true; //false 사용가능
		// 값을 처음으로 저장하는것을 "초기화" 라고한다
		
		System.out.println(_int);
		//실행 : Ctrl + F11
		//디버그 : F11
		
		_int = 30;
		System.out.println(_int);
		_int = 30+40;
		System.out.println(_int);
		_int = _short;
		System.out.println(_int);
		
		
		_byte = -128;
		_short = 5000;
		_int = 550;
		_long = 300L; 
		_float = 4.23f; 
		_double = 7.56; 
		_char = '나';
		_boolean = false; 
		 
		
		System.out.println("---------------");
		System.out.println("_byte = " + _byte);
		System.out.println("_short = " + _short);
		System.out.println("_int = " + _int);
		System.out.println("_long = " + _long);
		System.out.println("_float = " + _float);
		System.out.println("_double = " + _double);
		System.out.println("_char = " + _char);
		System.out.println("_boolean = " + _boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : " "로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "abdw";
		System.out.println(_String);

		/*
		 * << 리터럴의 종류 >> 
		 * - 숫자 : 정수, 실수, 0
		 * - 문자 : ''   ex) '가' , 'a' , '0' , ' '
		 * - 문자열 : ""
		 * - 그외 : true, false, null 
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, Class객체
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을대 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0;
		_float = 0.0f;
		_double = 0.0;
		_char = '\u0000'; // ' '
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 129;
		_byte = (byte) _int;
		
		System.out.println(_byte); // 128-> -128 (오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte) _int;
		
		System.out.println(_byte); // 언더플로우
		
		
		_int = 100;
		_double = 3.14159217;
		_int = (int) _double;
		
		System.out.println(_int); // 소수점이 누락
		
		/*
		 * 표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다
		 * 그로므로 형변환을 생략할 수 있다. 
		 */
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * - 상수는 대문자로 변수명을 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생
	}
}

