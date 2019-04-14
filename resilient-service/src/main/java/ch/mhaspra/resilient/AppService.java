package ch.mhaspra.resilient;

import org.springframework.stereotype.Service;

@Service
public class AppService {

  public String getInfo() {
    return "<br/> Node MY_NODE_NAME: " + System.getenv().get("MY_NODE_NAME") +
        "<br/> Node MY_POD_NAME: " + System.getenv().get("MY_POD_NAME") +
        "<br/> Node MY_POD_NAMESPACE: " + System.getenv().get("MY_POD_NAMESPACE") +
        "<br/> Node MY_POD_IP: " + System.getenv().get("MY_POD_IP") +
        "<br/> Node MY_POD_SERVICE_ACCOUNT: " + System.getenv().get("MY_POD_SERVICE_ACCOUNT");
  }

}
