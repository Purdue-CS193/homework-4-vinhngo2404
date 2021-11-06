public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;
 if (operation == Operation.ADD) {
            result = num1 + num2;
        } else if (operation == Operation.SUBTRACT) {
            result = num1 - num2;
        } else if (operation == Operation.MULTIPLY) {
            result = num1 * num2;
        } else if (operation == Operation.DIVIDE) {
            result = ((double) num1) / num2;
        }

        return result;
       }
