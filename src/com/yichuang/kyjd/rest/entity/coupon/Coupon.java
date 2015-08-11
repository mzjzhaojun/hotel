package com.yichuang.kyjd.rest.entity.coupon;

/**
 * @author zj default
 * 
 * @version 1.1
 */
public class Coupon implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	Integer rowid;
	String name;
	String create_time;
	String detail;
	String instructions;
	Integer count;
	Integer surplus;
	float price;
	float sellprice;
	String coupontype;
	String coupontype_name;
	String status;
	String status_name;
	String couponimg;
	String remark;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}

	public String getCouponimg() {
		return couponimg;
	}

	public void setCouponimg(String couponimg) {
		this.couponimg = couponimg;
	}

	public String getCoupontype_name() {
		return coupontype_name;
	}

	public void setCoupontype_name(String coupontype_name) {
		this.coupontype_name = coupontype_name;
	}

	public String getCoupontype() {
		return coupontype;
	}

	public void setCoupontype(String coupontype) {
		this.coupontype = coupontype;
	}

	public Integer getRowid() {
		return rowid;
	}

	public void setRowid(Integer rowid) {
		this.rowid = rowid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getSurplus() {
		return surplus;
	}

	public void setSurplus(Integer surplus) {
		this.surplus = surplus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Coupon() {
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSellprice() {
		return sellprice;
	}

	public void setSellprice(float sellprice) {
		this.sellprice = sellprice;
	}

	public Coupon(Integer rowid, String name, String create_time,
			String detail, String instructions, Integer count, Integer surplus,
			float price, float sellprice, String coupontype,
			String coupontype_name, String remark) {
		super();
		this.rowid = rowid;
		this.name = name;
		this.create_time = create_time;
		this.detail = detail;
		this.instructions = instructions;
		this.count = count;
		this.surplus = surplus;
		this.price = price;
		this.sellprice = sellprice;
		this.coupontype = coupontype;
		this.coupontype_name = coupontype_name;
		this.remark = remark;
	}

}