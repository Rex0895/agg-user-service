package homework.user.service.controller;

import homework.user.service.service.UserProfileService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-profile")
@Slf4j
public class UserProfileRestController extends AbstractController {

    @Autowired
    UserProfileService userProfileService;

    @PostMapping(path = "/test")
    @Operation(summary = "Test")
    public ResponseEntity<String> test() {
        return successResponse(userProfileService.test());
    }
}
