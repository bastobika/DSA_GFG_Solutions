package BitMagic;

public class BinaryToGray {

	public static int greyConverter(int n) {
        return n ^ (n >> 1);
    }
	
	public static void main(String[] args) {
		System.out.println(greyConverter(7));
	}
}
