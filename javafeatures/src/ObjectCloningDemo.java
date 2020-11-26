

public class ObjectCloningDemo implements Cloneable{
	
	int en_no;
	String name;
	public ObjectCloningDemo(int en_no , String name) {
	this.en_no = en_no;
	this.name = name;
	}
	public Object clone()throws java.lang.CloneNotSupportedException  {
		return super.clone();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectCloningDemo oc = new ObjectCloningDemo(02,"deep");
			ObjectCloningDemo oc1 = (ObjectCloningDemo)oc.clone();
			
			System.out.println(oc.en_no+" "+oc.name);
			System.out.println(oc1.en_no+" "+oc1.name);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
