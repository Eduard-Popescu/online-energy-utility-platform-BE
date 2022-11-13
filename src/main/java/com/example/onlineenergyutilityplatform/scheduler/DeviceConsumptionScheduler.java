package com.example.onlineenergyutilityplatform.scheduler;

import com.example.onlineenergyutilityplatform.service.DeviceConsumptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Component
@Slf4j
public class DeviceConsumptionScheduler {

  private final DeviceConsumptionService deviceConsumptionService;
  private LocalDateTime localDateTime;

  public DeviceConsumptionScheduler(DeviceConsumptionService deviceConsumptionService) {
    this.deviceConsumptionService = deviceConsumptionService;
    this.localDateTime = LocalDateTime.now();
  }

  @Scheduled(cron = "*/59 * 1 * * *")
  public void execute(){
    localDateTime = localDateTime.plusHours(1L);
    log.info("Scheduler executed at {}", LocalDateTime.now());
    deviceConsumptionService.addDeviceConsumption(localDateTime);
  }
}
