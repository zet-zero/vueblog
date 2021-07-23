package com.vueblog.common.lang;

import com.vueblog.common.lang.ResultCode;
import java.io.Serializable;
import lombok.Data;

@Data
public class ResultVO<T> implements Serializable {
    public static final ResultVO<String> SUCCESS;
    public static final ResultVO<String> FAIL;
    public static final ResultVO<String> NULL;
    private static final long serialVersionUID = 8074341366563391943L;
    private String code;
    private String message;
    private transient T data;

    public ResultVO() {
    }

    public ResultVO(ResultCode code) {
        this.setCode(code.code());
        this.setMessage(code.msg());
    }

    public ResultVO(String code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public ResultVO(String code, String message, T data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public ResultVO(T data) {
        ResultVO<String> v = data == null ? NULL : SUCCESS;
        this.setCode(v.getCode());
        this.setMessage(v.getMessage());
        this.setData(data);
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultVO)) {
            return false;
        } else {
            ResultVO<?> other = (ResultVO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResultVO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ResultVO(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    static {
        SUCCESS = new ResultVO(ResultCode.SUCCESS);
        FAIL = new ResultVO(ResultCode.FAIL);
        NULL = new ResultVO("暂无数据");
    }
//    private String code;
//    private String msg;
//    private Object data;
//    public static ResultVO succ(Object data) {
//        ResultVO m = new ResultVO();
//        m.setCode("0");
//        m.setData(data);
//        m.setMsg("操作成功");
//        return m;
//    }
//    public static ResultVO succ(String mess, Object data) {
//        ResultVO m = new ResultVO();
//        m.setCode("0");
//        m.setData(data);
//        m.setMsg(mess);
//        return m;
//    }
//    public static ResultVO fail(String mess) {
//        ResultVO m = new ResultVO();
//        m.setCode("-1");
//        m.setData(null);
//        m.setMsg(mess);
//        return m;
//    }
//    public static ResultVO fail(String mess, Object data) {
//        ResultVO m = new ResultVO();
//        m.setCode("-1");
//        m.setData(data);
//        m.setMsg(mess);
//        return m;
//    }
}
