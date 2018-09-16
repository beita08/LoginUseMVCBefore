package com.mliuxb.loginusemvc.global;

/**
 * Description:
 * Author     : liuxb
 * Date       : 2018/7/15 12:31
 */
public class Constants {

    //手机号码的正则表达式
    public static final String STR_PHONE_REGEX1 = "^1[3-8]\\d{9}$";
    public static final String STR_PHONE_REGEX2 = "^1(3|4|5|7|8)[0-9]\\d{8}$";
    public static final String STR_PHONE_REGEX3 = "^1(3[0-9]|4[57]|5[0-35-9]|7[0135678]|8[0-9])\\d{8}$";

    public static final String URL_LOGIN = "http://testapp.xasfemr.com/index.php?m=Home&c=User&a=login";
}
