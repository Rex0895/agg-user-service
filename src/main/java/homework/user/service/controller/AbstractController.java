package homework.user.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Slf4j
public abstract class AbstractController {
    protected <T> ResponseEntity<T> successResponse(T body) {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(body);
    }
}
