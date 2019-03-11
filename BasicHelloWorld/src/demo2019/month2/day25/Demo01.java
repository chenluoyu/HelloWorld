package demo2019.month2.day25;

import org.apache.commons.lang.StringUtils;

import java.time.LocalDate;

public class Demo01 {


    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        String s = now.getMonth().toString();
        int monthValue = now.getMonthValue();
        System.out.println(monthValue);

//        String monthValue = "7";
//        String str1 = "1,2,9";
//        System.out.println(encapsulateCloseMonth(monthValue,str1));
//        String str2 = "2,7";
//        System.out.println(encapsulateCloseMonth(monthValue,str2));
//        String str3 = "7";
//        System.out.println(encapsulateCloseMonth(monthValue,str3));

        String num = "78867430381.51";
        System.out.println(num.length());
        String num1 = "867430381.51";
        System.out.println(num1.length());

    }


    private static String encapsulateCloseMonth(String monthValue, String closeMonth) {
        if (StringUtils.isNotBlank(closeMonth)){
            if (closeMonth.contains(monthValue)) {

            } else {
                closeMonth += ","+monthValue;
            }
        } else {
            closeMonth = monthValue;
        }
        return  closeMonth;
    }
}
