package com.hxyac.martian.utils;

public class JsonData {
    /**
     * -3：请求就有错
     * -2：处理过程有错
     * -1：没有权限
     * 0：成功
     * 1：处理了，但是没结果
     */
    private Integer code;

    private Object data;

    private String msg;

    private JsonData(){}

    private JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonData build(Integer code, Object data, String msg){
        return new JsonData(code,data,msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
