package cn.msw.demo.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author moshuowen
 */
@Data
public class R<T> implements Serializable {

    private static final long serialVersionUID = 11554323987L;

    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private String code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    /**
     * 构造方法私有化
     */
    private R(){}

    /**
     * @return  成功时返回的静态方法
     */
    public static <T> R<T> ok(){
        R<T> result = new R<>();
        result.setSuccess(true);
        result.setCode(ResponseCodeEnum.SUCCESS.getCode());
        result.setMessage(ResponseCodeEnum.SUCCESS.getMsg());
        return result;
    }

    /**
     * @return 失败时返回的静态方法
     */
    public static <T> R<T> error(){
        R<T> result = new R<>();
        result.setSuccess(false);
        result.setCode(ResponseCodeEnum.ERROR.getCode());
        result.setMessage(ResponseCodeEnum.ERROR.getMsg());
        return result;
    }

    public R<T> success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public R<T> message(String message){
        this.setMessage(message);
        return this;
    }

    public R<T> code(String  code){
        this.setCode(code);
        return this;
    }

    public R<T> data(T data){
        this.setData(data);
        return this;
    }

}
