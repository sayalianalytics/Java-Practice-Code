interface Camera{
	void takephoto();
	}
interface Music{
	void playmusic();
}

class Mobile implements Camera, Music{
	public void takephoto() {
	System.out.println("Photo Captured");
  }
	public void playmusic() {
		System.out.println("Music Playing");
	}
}
public class Interface_eg {
	public static void main(String[] args) {
		Mobile mo = new Mobile();                                // object of class
		mo.takephoto();
		mo.playmusic();
	}

}
