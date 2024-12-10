package com.wayapaychat.temporalwallet.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminUserTransferDto {
	
	private Long customerWalletId;
    private String paymentReference;
    private String description;
    private Double amount;
    private Long userId;

}
