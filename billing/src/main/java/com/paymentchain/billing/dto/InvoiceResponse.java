/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *
 * @author sotobotero
 */
@Data
@Schema(description = "This model represent a Invoice data that user should send on a request on post method" )
public class InvoiceResponse {
    @Schema(name = "invoiceId", required = true,example = "2548975",defaultValue = "Unique Id of invoice after it's created")
   private long invoiceId;
     @Schema(name = "customer", required = true,example = "1", defaultValue = "Unique Id of customer taht represent the owner of invoice")
   private long customer;
      @Schema(name = "number", required = true,example = "TFS2548975",defaultValue = "Bussines number that identified a invoice")
   private String number;
       @Schema(name = "detail", required = false,example = "Professional services")
   private String detail;
        @Schema(name = "amount", required = true,example = "3659.23")
   private double amount; 
}
