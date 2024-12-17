package ma.xproce.devoirsurveille.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDto {
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAddress;
}
