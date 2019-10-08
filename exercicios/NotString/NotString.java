class NotString {
	public static void main(String [ ] args) {

		//notString("semicolon");
		//notString("not in this position");

		if (args.length > 0) {
	  		notString(args[0]);

		}
	}

	private static void notString(String str) {

		String initial = str.substring(0,3);

		if (initial.equals("not")) {
			System.out.println(str);
		}
		else {
			System.out.println("not ".concat(str));

		}

	}
}
