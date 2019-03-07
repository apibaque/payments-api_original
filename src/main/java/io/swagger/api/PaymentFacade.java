package io.swagger.api;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.client.ApiException;
import io.swagger.client.api.PaymentControllerApi;
import io.swagger.client.model.PaymentDTO;
import io.swagger.client.model.PaymentDTO.StatusEnum;
import io.swagger.model.PaymentOrderRequest;

public final class PaymentFacade {

	private static final PaymentControllerApi paymentApi = new PaymentControllerApi();

	private static final ObjectMapper objectMapper = new ObjectMapper();

	private PaymentFacade() {
	}

	public static String getPaymentConsent(String orderId) throws ApiException {
		try {
			PaymentDTO paymentDTO = paymentApi.findByIdUsingGET(orderId);
			return objectMapper.writeValueAsString(paymentDTO);
		} catch (JsonProcessingException e) {
			throw new ApiException(e.getMessage());
		}
	}

	public static void updatePaymentOrder(PaymentOrderRequest body) throws ApiException {
		// Business Logic
		Random rand = new Random();
		int number = rand.nextInt(999999);
		String transactionId = String.valueOf(number);
		String jsonInString = null;
		try {
			jsonInString = objectMapper.writeValueAsString(body.getPayment());
			PaymentDTO paymentDTO = objectMapper.readValue(jsonInString, PaymentDTO.class);
			paymentDTO.setId(body.getOrderId());
			paymentDTO.setTransactionId(transactionId);
			paymentDTO.setModificationDate(new Date());
			paymentDTO.setStatus(StatusEnum.APPROVED);
			
			paymentApi.updateUsingPOST(paymentDTO);
		} catch (IOException e) {
			throw new ApiException();
		} 

	}
	
	
	public static void addPaymentOrder(PaymentOrderRequest body) throws ApiException {
		// Business Logic
		String jsonInString = null;
		try {
			jsonInString = objectMapper.writeValueAsString(body.getPayment());
			PaymentDTO paymentDTO = objectMapper.readValue(jsonInString, PaymentDTO.class);
			paymentDTO.setId(body.getOrderId());
			paymentApi.addUserUsingPOST(paymentDTO);
		} catch (IOException e) {
			throw new ApiException();
		} 

	}

}
