public class Calculate {
    public static void main(String[] args) throws Exception {
	
            System.out.println("Calculate...");	
	
            double result = calculate(args);       
        
            System.out.println("Result : " + result);
        
    }

    private static double calculate(String[] args) throws Exception {
	double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[2]);
        double result = 0.0;        
	switch (args[1]) {
            case "+" :
                result = first + second;
                break;
            case "-" :
                result = first - second;
                break;
            case "/" :
                result = first / second;
                break;
            case "*" :
                result = first * second;
                break;
            case "^" :
                result = first;
                for (int i = 0; i < second - 1; i++) {
                    result *= first;
                }
                break;
            default:
                throw new Exception("Wrong operator");
        }
	return result;
    }

    
}