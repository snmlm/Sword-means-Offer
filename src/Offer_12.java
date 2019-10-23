
/**
 * ��ֵ�������η�
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * ��֤base��exponent��ͬʱΪ0
 * @author xxxxx
 * 
 * ˼·��
 * ����exponent�������������
 * 10^1011=10^1000*10^0010*10^0001;
 * ָ��>>1������^2�������һ���ģ�exponent&1==1ֻ��λֵΪ1�Ĳż��㣬�����������ˡ�
 *
 */
public class Offer_12 {
	public double Power(double base, int exponent) {
		double result = 1;
		int a = exponent;
		if(base == 0){
			return 0;
		}
		if(exponent == 0){
			return 1;
		}
		if(exponent < 0){
			exponent = -exponent;
		}
		while (exponent!=0) {
			if((exponent&1)==1){
				result*=base;
			}
			base*=base;
			exponent >>= 1;
		}
		return a > 0?result:1/result;
	}
}
