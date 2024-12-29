package ss3_java_static.local_date_util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate fromString_ddMMyyyy(String date) {
        // Sử dụng DateTimeFormatter để phân tích chuỗi thành LocalDate
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    public static LocalDate fromString_yyyyMMdd(String date) {
        // Sử dụng DateTimeFormatter để phân tích chuỗi thành LocalDate
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    public static String toString_ddMMyyyy(LocalDate date) {
        // Sử dụng DateTimeFormatter để định dạng LocalDate thành chuỗi
        return date.format(formatter_ddMMyyyy);
    }

    public static String toString_yyyyMMdd(LocalDate date) {
        // Sử dụng DateTimeFormatter để định dạng LocalDate thành chuỗi
        return date.format(formatter_yyyyMMdd);
    }
}

