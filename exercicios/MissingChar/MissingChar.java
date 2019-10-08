class MissingChar {
	public static void main(String[ ]  args) {

	missingChar("Robocop", 3);

		if (args.length >=2) {
		missingChar(args[0], Integer.parseInt(args[1]));
		}
	}


	private static void missingChar(String str, int n) {

		String firstHalf = str.substring(0,n);

		String lastHalf = str.substring(n + 1, str.length());

		String missing = (firstHalf + lastHalf);


		System.out.println(missing);

	}	 
}
