package hust.soict.globalict.garbage;


public class GarbageCreator {

	public static void main(String[] args) {
		for (int i = 0; i < 1000000000; i++) {
            String str = new String("garbage");
            int[] arr = new int[100000];
            System.out.print(str);
        }
	}

}
