package com.gc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@Slf4j
@MapperScan("com.gc.mapper")
public class HospitalSpringbootApplication {

    public static void main(String[] args) {
//        把游览器提起来
        SpringApplication.run(HospitalSpringbootApplication.class, args);
        String cmd = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe http://localhost:8023/toLogin";
        Runtime run = Runtime.getRuntime();
        try{
            run.exec(cmd);
//            logger.debug("启动浏览器打开项目成功");
        }catch (Exception e){
            e.printStackTrace();
//            logger.error(e.getMessage());
        }

    }

}
