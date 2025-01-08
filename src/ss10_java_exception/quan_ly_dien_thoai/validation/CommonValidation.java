package ss10_java_exception.quan_ly_dien_thoai.validation;

import ss10_java_exception.quan_ly_dien_thoai.exception.EmptyFieldException;
import ss10_java_exception.quan_ly_dien_thoai.exception.MinLengthException;
import ss10_java_exception.quan_ly_dien_thoai.exception.NegativeNumberException;
import ss10_java_exception.quan_ly_dien_thoai.exception.NumberOutOfRangeException;

public class CommonValidation {

    public static void validateIsEmpty(String value, String fieldName) throws EmptyFieldException {
        if (value == null || value.isEmpty()) {
            throw new EmptyFieldException(fieldName + " không được để trống");
        }
    }

    public static int parseInt(String value, String fieldName) throws NumberFormatException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phải là một số nguyên hợp lệ");
        }
    }

    public static double parseDouble(String value, String fieldName) throws NumberFormatException {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phải là một số thực hợp lệ");
        }
    }

    public static void validateNumberOutOfRangeException(double value, String fieldName, double minValue, double maxValue) throws NumberOutOfRangeException {
        if (value < minValue || value > maxValue) {
            throw new NumberOutOfRangeException(fieldName + " phải nằm trong khoảng từ " + minValue + " đến " + maxValue);
        }
    }

    public static void validateMinLength(String value, String fieldName, int minLength) throws MinLengthException {
        if (value.length() < minLength) {
            throw new MinLengthException(fieldName + " phải có độ dài tối thiểu " + minLength + " ký tự");
        }
    }

    public static void validateIsNegativeNumber(double value, String fieldName) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(fieldName + " không được là số âm");
        }
    }
}

