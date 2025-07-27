
public class CompareStrings {

	public static void main(String[] args) {
		String value1 = "newRow = move(app.board[rowIndex])";
		String value2 = "newRow = move(app.board[rowIndex])";
		if (compare(value1, value2)) {
			System.out.println("Similar");
		} else {
			System.out.println("Different!");
		}

	}
	
	private static boolean compare(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		}
		
		return false;
	}

}
