//Encapsulation
class Book{
	private int pagenumber;

	public int getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		if(pagenumber>0) {
			this.pagenumber = pagenumber;
		}else {
			System.out.println("Invalid page number");
		}
		
	}
	
}
public class LaunchBook {

	public static void main(String[] args) {
		Book b = new Book();
		b.setPagenumber(-100);
		System.out.println(b.getPagenumber());

	}

}
