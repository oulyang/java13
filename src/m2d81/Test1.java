package m2d81;

import java.util.ArrayList;
import java.util.Collection;

/**
 *û��ʹ�á����͡�֮ǰ�� Collection���ܴ��Object������������
 *
 *Collection����
 *boolean add(Objject e)�����������Ԫ��
 *int size()��ȡ������Ԫ�ظ���
 *void clear()��ռ���
 *boolean contains(Object e)�жϵ�ǰԪ�ؼ������Ƿ����Ԫ��e����������true
 *void remove(Object e)��������е�Ԫ��e
 *boolean isEmpty()�жϼ����Ƿ�Ϊ�գ��շ���true
 *Object[] toArray()���ø÷������Խ�����ת��������
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1200);//�Զ�װ��
		c.add(3.14);
		
		System.out.println(c.size());
		
		System.out.println(c.contains(1200));
		
		c.remove(1200);
		
		c.clear();
		System.out.println(c.size());
		
		System.out.println(c.isEmpty());
		
		c.add(123);
		c.add(1);
		c.add(12);
		Object[] obj=c.toArray();
		for(int i=0;i<obj.length;i++) {
			Object o=obj[i];
			System.out.println(o);
		}
		
		
		
		
	}

}
