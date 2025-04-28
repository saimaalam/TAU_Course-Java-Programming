package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    String username;
    String password;
    String oldPassword;
    String errorMessage = "";

    public PasswordValidator(String username, String password, String oldPassword) {
        this.username = username;
        this.password = password;
        this.oldPassword = oldPassword;
    }

    public static void main(String[] args) {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        System.out.println("Enter your old password: ");
        String oldPassword = sc.nextLine();
        PasswordValidator passwordValidator = new PasswordValidator(username, password, oldPassword);
        String enteredPassword = passwordValidator.getPassword();
        String valid = passwordValidator.isPasswordValid(enteredPassword);
        if (valid.equals("true")) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Your password is incorrect. " + passwordValidator.getErrorMessage());
        }


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String validateLength(String password) {
        String valid = "false";
        if (password.length() >= 8) {
            valid = "true";
        } else errorMessage += "\n Your password must be at least 8 characters.";
        return valid;
    }

    public String isContainUppercase(String password) {
        String valid = "false";
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                valid = "true";
        }
        if (valid.equals("false")) {
            errorMessage += "\n Your password must include an uppercase letter.";
        }
        return valid;
    }

    public String isContainSpecialCharacter(String password) {
        String valid = "false";
        if (!password.matches("[a-zA-Z0-9]*")) {
            valid = "true";
        } else errorMessage += "\n Your password must include a special character (e.g. %,$[:)";
        return valid;
    }

    public String isContainUsername(String password) {
        String valid = "false";
        if (!password.toLowerCase().contains(username.toLowerCase())) {
            valid = "true";
        } else errorMessage += "\n Your password cannot contain your username.";
        return valid;
    }

    public String isMatchesOldPassword(String password) {
        String valid = "false";
        if (!password.equals(oldPassword)) {
            valid = "true";
        } else errorMessage += "\n Your password must be different from your current password.";
        return valid;
    }

    public String isPasswordValid(String password) {
        String valid = "true";
        String validLength = validateLength(password);
        String uppercase = isContainUppercase(password);
        String specialCharacter = isContainSpecialCharacter(password);
        String containUsername = isContainUsername(password);
        String matchesOldPassword = isMatchesOldPassword(password);
        if (validLength.equals("false")) {
            valid = "false";
        }
        if (uppercase.equals("false")) {
            valid = "false";
        }
        if (specialCharacter.equals("false")) {
            valid = "false";
        }
        if (containUsername.equals("false")) {
            valid = "false";
        }
        if (matchesOldPassword.equals("false")) {
            valid = "false";
        }
        return valid;
    }
}
