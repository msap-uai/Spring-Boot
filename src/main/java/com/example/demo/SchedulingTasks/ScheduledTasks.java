package com.example.demo.SchedulingTasks;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 60000) // 5000 = 5 segundos
    //intervalo entre invocaciones de métodos. Hay otras opciones , como fixedDelay
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        //imprime la hora
    }
}

