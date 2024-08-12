package t1.ismailov.timetracking.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import t1.ismailov.timetracking.example.service.TestService;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
@Tag(name = "Test", description = "Populating the database with test data")
@Slf4j
public class TestController {
    private final TestService testService;

    @Operation(summary = "Running test methods for verification")
    @GetMapping("/execute")
    public ResponseEntity<Void> test() throws InterruptedException {
        testService.testTime();
        testService.testAsyncTime();
        return ResponseEntity.ok().build();
    }
}
