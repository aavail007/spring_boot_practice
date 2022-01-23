package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentController {
    @PostMapping("/students")
    // 方法二: @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String creat(@RequestBody Student student) {
        return  "執行資料庫 Create 操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId) {
        return  "執行資料庫 read " + studentId;
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        return  "執行資料庫 update " + studentId;
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        return  "執行資料庫 delete " + studentId;
    }
}
