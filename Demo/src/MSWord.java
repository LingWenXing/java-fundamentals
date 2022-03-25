
class Word extends Thread{
	public void run() {
		if(getName().equals("TYPE")) {
			type();
		}else if(getName().equals("AUTOSAVE")) {
			autoSave();
		}else if(getName().equals("SPELLCHECK")) {
			spellCheck();
		}
	}
	
	void type() {
		for(;;) {
			System.out.println("Typing");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void autoSave() {
		for(;;) {
			System.out.println("Auto saving");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void spellCheck() {
		for(;;) {
			System.out.println("Spell checking");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MSWord {

	public static void main(String[] args) {
		Word ms1 = new Word();
		Word ms2 = new Word();
		Word ms3 = new Word();
		
		ms1.setName("TYPE");
		ms2.setName("AUTOSAVE");
		ms3.setName("SPELLCHECK");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
