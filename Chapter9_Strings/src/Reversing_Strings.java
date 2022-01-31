public class Reversing_Strings {

	public static void main(String[] args) {
		// There are a couple ways you can reverse a string to make it backwards

		// 1. StringBuilder/StringBuffer:
		String str = "code";
		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());// edoc

		// 2. Char array:
		char arr[] = str.toCharArray();
		for (int index = 0, mirroredIndex = arr.length - 1; index < mirroredIndex; index++, mirroredIndex--) {
			char temp = arr[index];
			arr[index] = arr[mirroredIndex];
			arr[mirroredIndex] = temp;
		}

		System.out.println(new String(arr));// edoc
	}

}
