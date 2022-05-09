package org.spring.security.login.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.spring.security.login.exception.GlobalException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Operation(description = "Welcome GET API")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Request Success"),
            @ApiResponse(responseCode = "400", description = "Invalid information Provided"),
            @ApiResponse(responseCode = "404", description = "Not found")})
    @GetMapping(path = "/welcome",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity <String> welcome() throws Exception {
        String s = null;
        if (s==null){
            throw new GlobalException("Welcome Exception");
        }
        return ResponseEntity.ok("Welcome");
    }
}
