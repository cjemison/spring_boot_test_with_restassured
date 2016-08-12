package example.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import example.controller.HelloWorldController;
import example.domain.HelloVO;

/**
 * Created by cjemison on 8/12/16.
 */
@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

  @Override
  @RequestMapping(value = "/v1/hello", method = RequestMethod.POST)
  public ResponseEntity<?> post(@RequestBody final HelloVO helloVO) {
    return ResponseEntity.ok(helloVO);
  }
}
