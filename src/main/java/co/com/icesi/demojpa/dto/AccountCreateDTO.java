package co.com.icesi.demojpa.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountCreateDTO {

    private String accountNumber;

    private long balance;

    private String type;

    private boolean active;

    private String userId;
}
