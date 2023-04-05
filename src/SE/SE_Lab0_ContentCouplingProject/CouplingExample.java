package SE.SE_Lab0_ContentCouplingProject;

public class CouplingExample {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.setAge("20") ;
        System.out.println("age:"+Integer.valueOf(contentCoupling.getAge()));
    }
}
class ContentCoupling {
    public String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}   
    
}