package TDD;

public class ArrayPass {

    public boolean check(String Password) {

        //boolean isValid = false;
        boolean enoughCharacters = false;
        boolean hasDigits = false;
        boolean hasSpecialCharacters = false;

        if (Password.length() >= 8) {
            enoughCharacters = true;
        }

        for(int i=0;i<Password.length();i++) {
            char c = (Password.charAt(i));
            if (Character.isDigit(c)) {
                hasDigits = true;
        }
            if(!Character.isLetterOrDigit(c)) {
                hasSpecialCharacters = true;
            }

        }

        return enoughCharacters && hasDigits && hasSpecialCharacters;
    }
}