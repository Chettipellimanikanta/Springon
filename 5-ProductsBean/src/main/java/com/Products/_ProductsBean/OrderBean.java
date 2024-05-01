package com.Products._ProductsBean;

public class OrderBean {
	private int orderId;
	private ProductBean ProductBean;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public ProductBean getProductBean() {
		return ProductBean;
	}
	public void setProductBean(ProductBean productBean) {
		ProductBean = productBean;
	}
	public OrderBean(int orderId, com.Products._ProductsBean.ProductBean productBean) {
		super();
		this.orderId = orderId;
		ProductBean = productBean;
	}
	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void details()
	{
		System.out.println("Ouder Id"+ orderId);
		System.out.println(ProductBean.getProductId());
		System.out.println(ProductBean.getProductName());
		System.out.println(ProductBean.getProductPrice());
		System.out.println(ProductBean.getProductQuantity());
	}
}
