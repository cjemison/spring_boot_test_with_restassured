package example.controller;

import org.springframework.http.ResponseEntity;

import example.domain.HelloVO;

/**
 * Created by cjemison on 8/12/16.
 */
public interface HelloWorldController {

  ResponseEntity<?> post(final HelloVO helloVO);
}
