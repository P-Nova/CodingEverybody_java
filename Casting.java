
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 손실이 없다. 자동 캐스팅
		double b2 = (double) 1;
		int b3 = 1;
				
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // 손실이 생겨서 수동적으로 강제적으로 만들어줘야 한다.
		System.out.println(e);

		//1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
// 변수의 데이터 타입을 엄격하게 통제. 변수에 들어갈 값을 다른 데이터 타입으로 컨버팅 해야할 경우, casting a to b
	
		int g = (int) 1.5;
		System.out.println(g);
		int aa = (int) 1.9;
		System.out.println(aa);
	}

}
