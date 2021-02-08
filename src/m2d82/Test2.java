package m2d82;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
/**
 * 以下遍历/迭代方式是所有Collection通用的。
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
		//获取迭代器对象
		Iterator it=c.iterator();
		//遍历集合
		/*迭代器的方法
		 * boolean hasNext()如果仍有元素可迭代，返回true
		 * Object next()返回迭代的下一个元素
		 */
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
	}

}
