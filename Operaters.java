class Operaters {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 4;
        // Arithmetic Operaters(+, -, *, /, %)
        int addition = number1 + number2 ;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double division = (double)number1 / number2;
        int modulus = number1 % number2;
        System.out.println("addtion - "+addition);
        System.out.println("subtraction -"+subtraction);
        System.out.println("multiplication-"+multiplication);
        System.out.println("division-"+division);
        System.out.println("modulus-"+modulus);

        // Unary Operaters

        // Negating an expression
        int negativeNumber = -number1;
        System.out.println("number= "+number1);
        System.out.println("negativeNumber= "+negativeNumber);

        // postIncrement 
        number1++;

        // preIncreament
        ++number2;

        // postDecrement
        number1--;

        // preDecreament
        --number2;

        // System.out.println(preIncreamentOperater);
        //number1++;
        //++number2;
        //System.out.println(number1);
        //System.out.println(number2);
        int result = number1++ + ++number1;
        System.out.println(result);
        System.out.println(number1++ + ++number1);

        // Relation Operaters (<, >, <=, >=, ==, !=)
        int number3 = 5;
        int number4 = 6;
        boolean lessThan = number3 < number4;
        System.out.println("lessThan= "+lessThan);
        boolean greaterThan = number3 > number4;
        boolean lessThanOrEquals = number3 <= number4;
        boolean greaterThanOrEquals = number3 >= number4;
        boolean equalTo = number3 == number4;
        boolean notEqual = number3 != number4;
        System.out.println("greaterThan= "+greaterThan);
        System.out.println("lessThanOrEquals="+lessThanOrEquals);
        System.out.println("greaterThanOrEquals="+greaterThanOrEquals);
        System.out.println("equalTo="+equalTo);
        System.out.println("notEqual="+notEqual);

        // BItwise Operaters (&, ^, |)

        double bitWiseAnd = number3 & number4;
        System.out.println("bitWiseAnd="+bitWiseAnd);
        double bitWiseOr = number3 | number4;
        System.out.println("bitWiseOr="+bitWiseOr);
        double bitWiseExor = number3 ^ number4;
        System.out.println("bitWiseExor="+bitWiseExor);

        // logical Operaters (&&, ||)

        boolean x = true;
        boolean y = false;
        boolean logicalAnd = x && y;
        System.out.println("logicalAnd="+logicalAnd);
        boolean logicalOr = x || y;
        System.out.println("logicalOr="+logicalOr);

        // assignment Operaters (=, +=, -=, *=, /=, %=, &=, ^=, |=)
        int number5 = 8;
        //  number5++;
        //number5 = number5 + 1;
        number5 += 2;
        System.out.println(number5);


    






        
    

        

        

    }
}