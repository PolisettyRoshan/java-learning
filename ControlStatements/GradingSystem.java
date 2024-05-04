
class GradingSystem {
    public static void main(String[] args) {
        int percentage = 66;
        // 90 above is A+
        // 80 to 90 is A
        // 70 to 80 is B
        // 60 to 70 is C
        // 60 below is fail

        if (percentage  >= 90){
            System.out.println("A+");
        }else if (percentage >= 80 && percentage < 90){
            System.out.println("A");
        }else if (percentage >= 70 && percentage < 80){
            System.out.println("B");
        }else if (percentage >=60 && percentage < 70){
            System.out.println("C");
        }else if (percentage < 60){
            System.out.println("fail");
        }


    }
}