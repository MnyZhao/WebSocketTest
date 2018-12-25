package myview.com.websockettest.websocket.javawebsocket;

/**
 * Created by WESHAPE-DEV02 on 2018/3/10.
 */

public interface SocketListener {
    //消息沟通
    void onMessageArrived(String msg);

    //链接中
    void onConnetting();

    //链接成功并打开链接
    void onOpend();

    //关闭
    void onClosed();
}
