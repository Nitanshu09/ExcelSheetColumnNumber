import java.util.HashMap;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String columnTitle) {
		HashMap<Character, Integer> map = new HashMap<>();
		int j = 1;
		for (int a = 65; a <= 90; a++) {
			map.put((char) a, j);
			j++;
		}
		if (columnTitle.length() == 1) {
			return map.get(columnTitle.charAt(0));
		}
		int sum = map.get(columnTitle.charAt(0));
		int l = 1;
		while (columnTitle.length() > l) {
			sum = (sum * 26) + map.get(columnTitle.charAt(l));
			l++;
		}
		return sum;
	}

	public static void main(String[] args) {
		String title = "AAB";
		System.out.println(titleToNumber(title));
	}

}
