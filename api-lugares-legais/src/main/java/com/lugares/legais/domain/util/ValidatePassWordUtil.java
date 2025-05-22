package com.lugares.legais.domain.util;

import com.lugares.legais.domain.exceptions.InvalidPassWordException;
import lombok.experimental.UtilityClass;
import java.util.regex.Pattern;

@UtilityClass
public class ValidatePassWordUtil {

    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static void validatePassWord(String passWord) {
        if (!pattern.matcher(passWord).matches()) {
            throw new InvalidPassWordException();
        }
    }

}
