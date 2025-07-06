package in.bushansirgur.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.yashNayan.Bilingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
