package com.example.sbactiviti.modeler.pojo;

/**
 * @author ：wqing
 * @date ：Created in 2019/5/20 0020 15:29
 */
public class Status {
    //状态码
    public final static String SUCCESS = "000";
    public final static String FAIL = "001";
    public final static String NO_LOGIN = "003";
    public final static String NO_PRIVILEGE = "004";

    //资源状态
    public final static int DELETE = 0;
    public final static int ENABLE = 1;
    public final static int DISABLE = 2;
}
