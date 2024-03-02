class ControlStatementIfElse {
    public static void main(String[] args) {
        char expectedCaptcha = 'h';
        char userInput = 'r';
        if (expectedCaptcha == userInput) {
            System.out.println("matched");
        } else {
            System.out.println("not matched");
        }

    }
}