package cloud.stepintoiot.stepintoiot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class sayHi {
  @GetMapping("/")
  public String sayHi() {
      return "Hi From Step-into-iot!";
  }
}