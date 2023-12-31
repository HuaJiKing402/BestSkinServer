package top.bianstudio.backend;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

public class MyWebSocketClient extends WebSocketClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyWebSocketClient.class);

    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        // TODO Auto-generated method stub
        LOGGER.info("------ MyWebSocket onOpen ------");
        super.send("{'client': 'BestSkinServer', 'action': 'Connection', 'value': 'Connected'}");
    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        // TODO Auto-generated method stub
        LOGGER.info("------ MyWebSocket onClose ------{}",arg1);
    }

    @Override
    public void onError(Exception arg0) {
        // TODO Auto-generated method stub
        LOGGER.info("------ MyWebSocket onError ------{}",arg0);
    }

    @Override
    public void onMessage(String arg0) {
        // TODO Auto-generated method stub
        LOGGER.info("-------- 接收到服务端数据： " + arg0 + "--------");
        super.send("{'client': 'BestSkinServer', 'action': 'Message', 'value': '测试'}");
    }
}
