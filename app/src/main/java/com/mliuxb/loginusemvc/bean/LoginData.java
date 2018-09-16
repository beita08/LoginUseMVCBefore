package com.mliuxb.loginusemvc.bean;

/**
 * Description:
 * Author     : liuxb
 * Date       : 2018-7-15 14:25:06
 */

public class LoginData {

    public int       code;
    public int       status;
    public String    message;
    public LoginInfo data;

    public static class LoginInfo {

        public String id;
        public String phonenumber;
        public String userpwd;
        public String datetime;

    }
}