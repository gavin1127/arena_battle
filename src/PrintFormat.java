/**
 * Created by josh on 3/10/17.
 */
public class PrintFormat {

	public static void print(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println();
	}
}
