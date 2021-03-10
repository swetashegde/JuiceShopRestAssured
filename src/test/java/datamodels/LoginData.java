package datamodels;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginData{
    private String email;
    private String password;
}
