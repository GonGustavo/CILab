package org.example;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {

        return myString;
    }

    @Override
    public void setString(String string) {

        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {

        if (myString == null || myString.isEmpty()){
            return true;
        }
        boolean allUppercase = myString.equals(myString.toUpperCase());
        boolean allLowercase = myString.equals(myString.toLowerCase());
        if (allUppercase || allLowercase) {
            return true;
        }

        char firstChar = myString.charAt(0);
        String remainingChars = myString.substring(1);

        return Character.isUpperCase(firstChar) && remainingChars.equals(remainingChars.toLowerCase());

    }
}

