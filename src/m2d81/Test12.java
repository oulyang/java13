package m2d81;

import java.util.ArrayList;
import java.util.Collection;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c=new ArrayList();

		User1 u1=new User1("Ja");
		c.add(u1);
		User1 u2=new User1("Ja");
		

		System.out.println(c.contains(u2));
		c.remove(u2);
		System.out.println(c.size());
	}

}
class User1{
	private String name;
	
	public User1() {
		super();
	}
	public User1(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User1 other = (User1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

