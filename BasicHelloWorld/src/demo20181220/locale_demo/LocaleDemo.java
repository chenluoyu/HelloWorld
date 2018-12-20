package demo20181220.locale_demo;

import java.util.Locale;
import java.util.Set;

/**
 * Locale对象的了解
 */
public class LocaleDemo {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println("Country Begin：");
        System.out.println(locale.getCountry());// CN
        System.out.println(locale.getDisplayCountry());// 中国; display:展示、陈列
        System.out.println(locale.getISO3Country());// CHN
        System.out.println("Language Begin：");
        System.out.println(locale.getLanguage());// zh
        System.out.println(locale.getDisplayLanguage());// 中文
        System.out.println(locale.getISO3Language());// zho; ISO3:一种国际标准，从输出来看是定义国家代号的标准
        System.out.println("toLanguageTag Begin：");
        System.out.println(locale.toLanguageTag());// zh-CN
        System.out.println("DisplayName Begin：");
        System.out.println(locale.getDisplayName());// 中文（中国）
        System.out.println("Script Begin：");
        System.out.println(locale.getScript());// " "; script:脚本
        System.out.println(locale.getDisplayScript());// " "
        System.out.println("Variant Begin：");
        System.out.println(locale.getVariant());// " "; variant:变体、变量
        System.out.println(locale.getDisplayVariant());// " "

        System.out.println("UnicodeLocaleKeys Begin：");
        Set<String> unicodeLocaleKeys = locale.getUnicodeLocaleKeys();
        System.out.println("unicodeLocaleKeys.size : " + unicodeLocaleKeys.size());// default 为0
        for (String key : unicodeLocaleKeys){
            System.out.println(key + ", ");
        }

        System.out.println("UnicodeLocaleAttributes Begin：");
        Set<String> unicodeLocaleAttributes = locale.getUnicodeLocaleAttributes();
        System.out.println("unicodeLocaleAttributes.size : " + unicodeLocaleAttributes.size());// default 为0
        for (String key : unicodeLocaleAttributes){
            System.out.println(key + ", ");
        }
        System.out.println("ExtensionKeys Begin：");
        Set<Character> extensionKeys = locale.getExtensionKeys();
        System.out.println("extensionKeys.size : " + extensionKeys.size());// default 为0
        for (Character key : extensionKeys){
            System.out.println(key + ", ");
        }

        System.out.println("End。");
    }

}
