package oak.oak.produtos.services.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandartException {
    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
