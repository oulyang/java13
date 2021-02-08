package m2d81;

import java.util.ArrayList;
import java.util.Collection;

/**
 *没有使用“泛型”之前， Collection中能存放Object的所有子类型
 *
 *Collection方法
 *boolean add(Objject e)往集合中添加元素
 *int size()获取集合中元素个数
 *void clear()清空集合
 *boolean contains(Object e)判断当前元素集合中是否包含元素e，包含返回true
 *void remove(Object e)清除集合中的元素e
 *boolean isEmpty()判断集合是否为空，空返回true
 *Object[] toArray()调用该方法可以将集合转换成数组
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1200);//自动装箱
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
