package com.dksanServer.kyuwon.week2;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "study")
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String Hello2(){
        return "Hello World2";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @GetMapping("/sopt")
    public String getPart(
            @RequestParam(value = "part", defaultValue = "") final String part,
            @RequestParam(value = "type", defaultValue = "") final String type
            ) {
        return part + type;
    }

    @PostMapping("/members")
    public String postMember(@RequestBody final Member member){
        return member.getName();
    }

    @PutMapping("/members")
    public String putMember(@RequestBody final Member member) {
        return member.getName();
    }

    @DeleteMapping("/members")
    public String deleteMember(@RequestBody final Member member) {
        return "delete success";
    }



}
