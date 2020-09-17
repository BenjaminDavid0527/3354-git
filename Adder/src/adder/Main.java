package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
		} catch (IllegalArgumentException e) {
			System.err.println("Please only enter integers.");
        } catch (Exception e) {
            System.err.println("Please enter 1 or more arguments.");
        }
    }

    private static int addArguments(String[] args) throws Exception {
		if (args.length == 0) throw new Exception();
		int sum = 0;
		for (String arg : args) sum += Integer.valueOf(arg);
        return sum;
    }
}
