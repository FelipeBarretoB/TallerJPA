package co.com.icesi.demojpa.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IcesiAccount {

    @Id
    private UUID accountId;

    private String accountNumber;

    private long balance;

    private String type;

    private boolean active;

    @ManyToOne
    @JoinColumn(name="icesi_user_user_id", nullable=false)
    private IcesiUser account;

}
