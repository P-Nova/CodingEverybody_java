
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // �ս��� ����. �ڵ� ĳ����
		double b2 = (double) 1;
		int b3 = 1;
				
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // �ս��� ���ܼ� ���������� ���������� �������� �Ѵ�.
		System.out.println(e);

		//1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
// ������ ������ Ÿ���� �����ϰ� ����. ������ �� ���� �ٸ� ������ Ÿ������ ������ �ؾ��� ���, casting a to b
	
		int g = (int) 1.5;
		System.out.println(g);
		int aa = (int) 1.9;
		System.out.println(aa);
	}

}
