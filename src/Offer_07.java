
/**
 * 쳲���������
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
 * n<=39
 * @author xxxxx
 * 
 * ˼·
 * �����쳲��������У�0,1,1,2,3,5,8....
 * n=0ʱ��an=-1;
 * n=1ʱ��an=a1=0;
 * n=2ʱ��an=a2=1;
 * n>2ʱ��an=an-2+an-1;
 *
 */
public class Offer_07 {
	public int Fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		if(n == 0){
			return a;
		}else if(n == 1){
			return b;
		}else if(n > 1){
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}else{
			return -1;
		}
    }
}
