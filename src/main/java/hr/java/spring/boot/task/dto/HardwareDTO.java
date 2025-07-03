package hr.java.spring.boot.task.dto;

import lombok.Getter;

@Getter
public class HardwareDTO {

    private final String name;
    private final String code;
    private final double price;

    public HardwareDTO(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

}
