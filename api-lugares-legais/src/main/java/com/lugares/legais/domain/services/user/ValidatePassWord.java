package com.lugares.legais.domain.services.user;

import lombok.RequiredArgsConstructor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import com.lugares.legais.domain.exceptions.InvalidPassWordException;

@Service
@RequiredArgsConstructor
public class ValidatePassWord {

    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

    public void validate(String passWord) {
        validateLenghtPassWord(passWord);
        Matcher matcher = convertToMatcher(passWord);
        validateFormat(matcher);
    }

    private void validateLenghtPassWord(String passWord) {
        if (passWord.length() < 7) {
            throw new InvalidPassWordException();
        }
    }

    private Matcher convertToMatcher(String passWord) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(passWord);
        return matcher;
    }

    private void validateFormat(Matcher matcher) {
        if (!matcher.matches()) {
           throw new InvalidPassWordException();
        }
    }

}
