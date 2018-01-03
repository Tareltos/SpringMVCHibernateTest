package org.tareltos.partsmall.dao;

import java.util.List;

import org.tareltos.partsmall.model.CartInfo;
import org.tareltos.partsmall.model.OrderDetailInfo;
import org.tareltos.partsmall.model.OrderInfo;
import org.tareltos.partsmall.model.PaginationResult;

public interface OrderDAO {
	 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
