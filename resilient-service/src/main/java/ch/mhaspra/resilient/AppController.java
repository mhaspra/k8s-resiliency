package ch.mhaspra.resilient;


import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;


@RestController
public class AppController {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private final AppService appService;

  public AppController(AppService appService) {
    this.appService = appService;

  }

  @Timed(value = "api.info")
  @GetMapping("api/info")
  public String info() {
    log.debug("called 'info'");
    return appService.getInfo();
  }
}
