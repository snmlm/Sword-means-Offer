
/**
 * ���θ���
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author xxxxx
 *
 * ˼·��
 * 쳲��������б��Ρ�
 * target=1,f(1)=1;
 * target=2,f(2)=2;
 * target=3,f(3)=f(1)+f(2);
 * ....
 * target=n-1,��ʣ���һ�飺f(n-1)=f(n-2);
 * 			      ��ʣ������飺f(n-1)=2f(n-3);
 * target=n,��ʣ���һ�飺f(n)=f(n-1)(��);
 *          ��ʣ������飺f(n)=f(n-2)(��)+f(n-2)(��);��һ�����������f(n-1)(��),
 *          ��ô������ʽ���Ժϲ�Ϊf(n)=f(n-2)+f(n-1);
 */
public class Offer_10 {
    public int RectCover(int target) {
        int a = 1;
        int b = 2;
        int c = 0;
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else {
            for (int i = 3; i <= target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return c;
    }
}
