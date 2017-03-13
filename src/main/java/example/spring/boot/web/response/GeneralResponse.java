package example.spring.boot.web.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by liuluming on 2017/2/13.
 */
public class GeneralResponse<T> {

    @ApiModelProperty(value = "消息")
    protected String message = "操作成功";

    @ApiModelProperty(value = "是否成功")
    protected boolean successful = true;

    @ApiModelProperty(value = "数据对象")
    protected T data;

    @ApiModelProperty(value = "服务器时间")
    protected String timeStamp = System.currentTimeMillis() + "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean success) {
        this.successful = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
