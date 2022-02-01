
public class StringBufferUse {

	public static void main(String[] args) {
		/*
		 * Key Points:
		 * 
		 * used to created mutable (modifiable) string.
		 * 
		 * Mutable: Which can be changed.
		 * 
		 * is thread-safe i.e. multiple threads cannot access it simultaneously.
		 */

		/*
		 * Methods:
		 * 
		 * public synchronized StringBuffer append(String s)
		 * 
		 * public synchronized StringBuffer insert(int offset, String s)
		 * 
		 * public synchronized StringBuffer replace(int startIndex, int endIndex, String
		 * str)
		 * 
		 * public synchronized StringBuffer delete(int startIndex, int endIndex)
		 * 
		 * public synchronized StringBuffer reverse()
		 * 
		 * public int capacity()
		 * 
		 * public void ensureCapacity(int minimumCapacity)
		 * 
		 * public char charAt(int index)
		 * 
		 * public int length()
		 * 
		 * public String substring(int beginIndex)
		 * 
		 * public String substring(int beginIndex, int endIndex)
		 */

		// Example Showing difference between String and String Buffer implementation

		String str = "Study ";
		str.concat("Tonight");
		System.out.println(str);// Study

		StringBuffer sb = new StringBuffer("Study ");
		sb.append("Tonight");
		System.out.println(sb);// Study Tonight
	}

}
