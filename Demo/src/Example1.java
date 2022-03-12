class Example1 {

	public static void displayAge() {
		int age = 25;
		System.out.println(age);
		int AGE = 25;
		System.out.println(age);
		int Age = 25;
		System.out.println(age);
	}
	
	public static void incrementDecrementExamples() {
		System.out.println("First");
		int c = 10;
		int d;
		c++;
		d=c;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("Second");
		int e = 10;
		int f;
		++e;
		f=e;
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("Third");
		int a = 10;
		int b;
		b=a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Fourth");
		int g = 10;
		int h;
		h=++g;
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("Next");
		int a1 = 7;
		System.out.println(a1++ + a1--);
		System.out.println(a1);
	}
	
	public static void preDecrementExamples() {
		System.out.println("Pre decrement");
		int a1 = 7;
		System.out.println(--a1 + --a1 + a1++);
		System.out.println(a1);
		
		System.out.println("3)");
		int a2 = 7;
		System.out.println(++a2 + --a2 - ++a2 + --a2 - ++a2 + ++a2 - ++a2 + a2++);
		System.out.println(a2);
		
		System.out.println("4)");
		int a3 = 7;
		System.out.println( ((--a3 + --a3) + (a3-- + --a3) * (++a3 + a3++) - (--a3 + --a3)) );
		System.out.println(a3);
	}
	
	public static void dataTypeExamples() {
		byte a = 115;
		System.out.println(a);
		
		int x = 10;
//		int y = ++(++x); //error Invalid argument to operation ++/--
		System.out.println(x);
//		System.out.println(y);
		
		byte b = 5;
//		b = b + 1; //error Type mismatch: cannot convert from int to byte
		System.out.println(b);
		
		char c = 'a';
		++c;
		System.out.println(c);
		
		double d = 12.4;
		d++;
		System.out.println(d);
		
		boolean e = false;
//		e++; //error Type mismatch: cannot convert from boolean to int
		System.out.println(e);
		
		byte z = 25;
		short f = 22;
		int i = z + f;
		System.out.println(i);
		
		int g = 130;
		byte h;
		h=(byte)g;
		System.out.println(g);
		System.out.println(h);
		
		float f1 = 23.4f;
		int a1 = (int)f1;
		System.out.println(a1);
		System.out.println(f1);
	}
	
	public static void main(String[] args) {
		displayAge();
		System.out.println();
		incrementDecrementExamples();
		System.out.println();
		preDecrementExamples();
		System.out.println();
		dataTypeExamples();
		System.out.println();
		for(int a = 5; a > 0; a--) {
			for (int k = 0; k < a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= 1; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for (int a = 6; a > 1; a--){
		    for (int b = 0; b < a - 1; b++)
		       System.out.print("*");
		    System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 4; i++){ 
			for(int j = 0; j < 5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Print 5 spaces, and 5 rows of asterisks
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Print 5 spaces, right-angle triangle
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Print Pyramid
		for(int x = 1; x <= 5; x++) {
            for(int y = x; y <= 5 - 1; y++) {
                System.out.print(" ");
            }
            for(int z = 1; z <= 2 * x - 1; z++){
                System.out.print("*");
            }
            System.out.println("");
        }
		System.out.println();
		for(int x = 1; x <= 5; x++) {
			for(int y = 5; y >= x; y--) {
				System.out.print(" ");
			}
			for(int z = 1; z <= 2 * x - 1; z++){
                System.out.print("*");
            }
            System.out.println("");
		}
		System.out.println();
		//Print Inverted Pyramid
		for(int x = 5; x >= 0; x--) {
			for(int y = 5; y >= x; y--) {
				System.out.print(" ");
			}
			for(int z = 0; z <= 2 * x; z++) {
				System.out.print("*");
			}
            System.out.println("");
		}
		System.out.println();
		//Print letter B
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 10; j++) {
				if (i == 0 || i == 10) {
					if (j < 9) {
						System.out.print("*");
					}
				} else if (j == 9 && (i != 0 || i != 10)) {
					System.out.print("*");
				} else if (j == 0 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Print letter C
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 10; j++) {
				if (i == 0 || i == 10 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Print letter D
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 10; j++) {
				if (i == 0 || i == 10) {
					if (j < 9) {
						System.out.print("*");
					}
				} else if (j == 9 && (i != 0 || i != 10)) {
					System.out.print("*");
				} else if (j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Print letter E
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 10; j++) {
				if (i == 0 || i == 10) {
					System.out.print("*");
				} else if (j == 0 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}