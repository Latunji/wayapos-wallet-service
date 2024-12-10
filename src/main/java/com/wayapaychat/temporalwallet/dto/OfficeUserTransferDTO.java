package com.wayapaychat.temporalwallet.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class OfficeUserTransferDTO {
	
	// @NotNull
		@NotBlank(message = "Office Account must not Null or Blank")
		@Size(min = 12, max = 16, message = "Account must be 15 digit")
		private String officeDebitAccount;

		// @NotNull(message = "Account must be 10 digit")
		@NotBlank(message = "Customer Account must not Null or Blank")
		@Size(min = 10, max = 10, message = "Account must be 10 digit")
		private String customerCreditAccount;

		@NotNull
		@Min(value = 1, message ="Amount must be greater than zero")
		private BigDecimal amount;

		// @NotNull
		@NotBlank(message = "tranType must not Null or Blank")
		private String tranType;

		// @NotNull
		@NotBlank(message = "tranCrncy must not Null or Blank")
		@Size(min = 3, max = 5, message = "tranCrncy must be 3 alphanumeric (NGN)")
		private String tranCrncy;

		// @NotNull
		@NotBlank(message = "tranNarration must not Null or Blank")
		@Size(min = 5, max = 50, message = "tranNarration must be aleast 5 alphanumeric")
		private String tranNarration;

		// @NotNull
		@NotBlank(message = "tranNarration must not Null or Blank")
		@Size(min = 3, max = 50, message = "paymentReference must be aleast 3 alphanumeric")
		private String paymentReference;

	public OfficeUserTransferDTO(String officeDebitAccount, String customerCreditAccount, BigDecimal amount, String tranType,  String tranCrncy,  String tranNarration,  String paymentReference) {
		super();
		this.officeDebitAccount = officeDebitAccount;
		this.customerCreditAccount = customerCreditAccount;
		this.amount = amount;
		this.tranType = tranType;
		this.tranCrncy = tranCrncy;
		this.tranNarration = tranNarration;
		this.paymentReference = paymentReference;
	}

	public OfficeUserTransferDTO() {

	}
}