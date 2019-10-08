class FrontBack {

	public static void main (String[ ] args) {

		frontBack("heisenberg");

		if(args.length > 0) {
			frontBack(args[0]);
		}

	}	

	private static void frontBack(String str) {
	
		char start = str.charAt(0);
		int end = str.length() - 1;
		char fim = str.charAt(end);


		System.out.println(fim + str.substring(1,end) + start);
	}	
}
