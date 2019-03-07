package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Payment;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The payment initiation object can be used for three types of payments, which should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property: * &#x60;&#x60;&#x60;ORDERID&#x60;&#x60;&#x60;: The Go Socket identification number specified by the receiving end, often described in the invoice.  * &#x60;&#x60;&#x60;MESSAGE&#x60;&#x60;&#x60;: A payment just having a text message attached with it. * &#x60;&#x60;&#x60;TRANSFER&#x60;&#x60;&#x60;: A payment going between two DNB accounts having the same owner.   Not including the \&quot;straksbetaling\&quot; (imediate payment) flag, as this will be the default.  Payment initiator: Part of the context object, but kept here too for reference. 
 */
@ApiModel(description = "The payment initiation object can be used for three types of payments, which should be specified in the ```type``` property: * ```ORDERID```: The Go Socket identification number specified by the receiving end, often described in the invoice.  * ```MESSAGE```: A payment just having a text message attached with it. * ```TRANSFER```: A payment going between two DNB accounts having the same owner.   Not including the \"straksbetaling\" (imediate payment) flag, as this will be the default.  Payment initiator: Part of the context object, but kept here too for reference. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-05T19:08:49.617Z")

public class PaymentOrderResponse   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("payment")
  private Payment payment = null;

  public PaymentOrderResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentOrderResponse transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(example = "000012345", required = true, value = "")
  @NotNull

@Size(min=9,max=9) 
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentOrderResponse payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOrderResponse paymentOrderResponse = (PaymentOrderResponse) o;
    return Objects.equals(this.orderId, paymentOrderResponse.orderId) &&
        Objects.equals(this.transactionId, paymentOrderResponse.transactionId) &&
        Objects.equals(this.payment, paymentOrderResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, transactionId, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOrderResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

