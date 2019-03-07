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
 * The payment initiation object can be used for three types of payments, which should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property: * &#x60;&#x60;&#x60;orderId&#x60;&#x60;&#x60;: The Go Socket identification number specified by the receiving end, often described in the invoice.  Not including the \&quot;straksbetaling\&quot; (imediate payment) flag, as this will be the default.  Payment initiator: Part of the context object, but kept here too for reference. 
 */
@ApiModel(description = "The payment initiation object can be used for three types of payments, which should be specified in the ```type``` property: * ```orderId```: The Go Socket identification number specified by the receiving end, often described in the invoice.  Not including the \"straksbetaling\" (imediate payment) flag, as this will be the default.  Payment initiator: Part of the context object, but kept here too for reference. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-05T19:08:49.617Z")

public class PaymentOrderRequest   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("payment")
  private Payment payment = null;

  public PaymentOrderRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * The payment type: orderId, message or order. A transfer is a payment order between two accounts with the same owner, a message is an outgoing payment with just a descriptive message and orderId is a payment order with a ID (order identification) number.
   * @return orderId
  **/
  @ApiModelProperty(example = "3F2504E0-4F89-11D3-9A0C-0305E82C3301", required = true, value = "The payment type: orderId, message or order. A transfer is a payment order between two accounts with the same owner, a message is an outgoing payment with just a descriptive message and orderId is a payment order with a ID (order identification) number.")
  @NotNull

@Pattern(regexp="^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$") @Size(min=36,max=36) 
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentOrderRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The pasword of account: pasword account.
   * @return password
  **/
  @ApiModelProperty(example = "1234", value = "The pasword of account: pasword account.")

@Size(min=4,max=15) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PaymentOrderRequest payment(Payment payment) {
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
    PaymentOrderRequest paymentOrderRequest = (PaymentOrderRequest) o;
    return Objects.equals(this.orderId, paymentOrderRequest.orderId) &&
        Objects.equals(this.password, paymentOrderRequest.password) &&
        Objects.equals(this.payment, paymentOrderRequest.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, password, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOrderRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

