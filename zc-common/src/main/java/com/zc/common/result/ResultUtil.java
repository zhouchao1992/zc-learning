package com.zc.common.result;

public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("操作成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    /**
     * 自定义返回编码和信息
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    /**
     * 默认返回信息
     * @param code
     * @return
     */
    public static Result error(Integer code) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage("操作失败！");
        return result;
    }
}
