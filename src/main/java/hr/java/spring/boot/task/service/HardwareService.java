package hr.java.spring.boot.task.service;

import hr.java.spring.boot.task.dto.HardwareDTO;

import java.util.List;

public interface HardwareService {

    List<HardwareDTO> getAllHardware();

    HardwareDTO getHardwareByCode(String code);
}
