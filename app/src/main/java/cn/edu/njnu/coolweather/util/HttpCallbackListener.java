package cn.edu.njnu.coolweather.util;

/**
 * Created by Administrator on 2017/4/8.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
