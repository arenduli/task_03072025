package hr.java.spring.boot.task.service;

import hr.java.spring.boot.task.dto.HardwareDTO;
import hr.java.spring.boot.task.repository.HardwareRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService {

    private final HardwareRepository hardwareRepository;

    public HardwareServiceImpl(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @Override
    public List<HardwareDTO> getAllHardware() {
        return hardwareRepository.findAll().stream()
                .map(hardware -> new HardwareDTO(hardware.getName(), hardware.getCode(), hardware.getPrice()))
                .collect(Collectors.toList());
    }

    @Override
    public HardwareDTO getHardwareByCode(String code) {
        return hardwareRepository.findByCode(code)
                .map(hardware -> new HardwareDTO(hardware.getName(), hardware.getCode(), hardware.getPrice()))
                .orElseThrow(() -> new RuntimeException("Hardware not found with code: " + code));
    }
}
