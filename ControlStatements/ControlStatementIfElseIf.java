class ControlStatementIfElseIf {
    public static void main(String[] args) {
        char userInput = 'd';
        if (userInput == 'a') {
            System.out.println("move left");
        } else if(userInput == 'd') {
            System.out.println("move right");
        } else if(userInput == 'w') {
            System.out.println("move up");
        } else if(userInput == 's') {
            System.out.println("move down");
        }
    }
}