package String;

public class String_demo {
	public static void main(String[] args) {
		String str = " Welcome to Java";
		stringMethods(str);
		stringBufferMethods();

	}

	public static void stringMethods(String str) {
		System.out.println("method of String Class");
		System.out.println(str);
		// print string length
		System.out.println("Length of String = " + str.length());
		// print string length without count the space from start location
		System.out.println("Length of String with trim function = " + str.trim().length());
		// convert string into Upper case
		System.out.println("String in Upper case = " + str.toUpperCase());
		// convert string into lower case
		System.out.println("String in Upper case = " + str.toLowerCase());
		// find position for that letter
		System.out.println("index of L is =" + str.indexOf('l'));
		// find the character at that position
		System.out.println("find character at index 3 = " + str.charAt(3));
		// used to add string or join 2 string
		System.out.println("use concat fun" + str.concat(" , Student"));
		// its return true or false
		System.out.println(str.contains("to"));
		// its return true or false
		System.out.println(str.contains("hii"));
		// its return true or false
		System.out.println(str.endsWith("komal"));
		// its return true or false
		System.out.println(str.startsWith("Welcome"));
		// is used to replace "to" to "the"
		System.out.println(str.replace("to", "the"));
		// print remaining string after 2 letters
		System.out.println(str.substring(3));
		// print from 2nd index to 8 index
		System.out.println(str.substring(2, 9));

	}

	public static void stringBufferMethods() {
		StringBuffer sb = new StringBuffer("Komal");
		System.out.println("Method Of StringBuferr");
		System.out.println(sb);
		// display capacity of that sb //21
		System.out.println(sb.capacity());
		// to add string
		System.out.println(sb.append("Patil"));
		// formula for that (capacity of previous string *2)+2 eg(21*2)+2=44
		System.out.println(sb.capacity());
		// used to replace
		System.out.println(sb.replace(1, 2, "A"));
		// display hash code of sb
		System.out.println(sb.hashCode());
		// its return true or false
		System.out.println(sb.isEmpty());
		// its used to reverse the String this is most useful method
		System.out.println(sb + " = reverse String = " + sb.reverse());
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.delete(0, 1));
		System.out.println(sb.replace(1, 3, "k"));
		System.out.println(sb.indexOf("k"));

	}

}
