class Addition{
//	int add(int x, int y) {
//		return x+y;
//	}
	float add(int x, float y) {
		return x+y;
	}
//	float add(float x, float y) {
//		return x+y;
//	}
//	int add(int x, int y, int z) {
//		return x+y+z;
//	}
//	float add(int x, int y, float z) {
//		return x+y+z;
//	}
}
public class LaunchAddition {

	public static void main(String[] args) {
		Addition ad = new Addition();
		int a = 10, b = 20, c = 30;
		float m = 10.5f, n = 20.5f;
		
//		System.out.println(ad.add(a, b));
//		System.out.println(ad.add(a, m));
		System.out.println(ad.add(10, 20));
	}

}
