package m2d82;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
/**
 * ���±���/������ʽ������Collectionͨ�õġ�
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c=new HashSet();
		c.add(123);
		c.add(12);
		c.add(1);
		//��ȡ����������
		Iterator it=c.iterator();
		//��������
		/*�������ķ���
		 * boolean hasNext()�������Ԫ�ؿɵ���������true
		 * Object next()���ص�������һ��Ԫ��
		 */
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
	}

}
