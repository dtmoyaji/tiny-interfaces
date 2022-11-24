package org.gear

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@Configuration
@SpringBootApplication
class App {

    public App(){
        ScriptExecuter se = new ScriptExecuter();
        se.setScriptCode('println "HeyHoi"');
        println se.exec();
    }

    static void main(String[] args) {
        SpringApplication.run(App);
    }
}
