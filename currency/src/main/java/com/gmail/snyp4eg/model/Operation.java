package com.gmail.snyp4eg.model;

import java.util.Date;

public class Operation {
    private Integer operationId;
    private Integer bankId;
    private Integer currencyId;
    private Date operationTime;
    private Integer buyPrice;
    private Integer sellPrice;

    public Operation() {
    }

    public Operation(Integer operationId, Integer bankId, Integer currencyId, Date operationTime, Integer buyPrice,
	    Integer sellPrice) {
	this.setBankId(bankId);
	this.setOperationId(operationId);
	this.setCurrencyId(currencyId);
	this.setOperationTime(operationTime);
	this.setBuyPrice(buyPrice);
	this.setSellPrice(sellPrice);
    }

    public Integer getOperationId() {
	return operationId;
    }

    public void setOperationId(Integer operationId) {
	this.operationId = operationId;
    }

    public Integer getBankId() {
	return bankId;
    }

    public void setBankId(Integer bankId) {
	this.bankId = bankId;
    }

    public Integer getCurrencyId() {
	return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
	this.currencyId = currencyId;
    }

    public Date getOperationTime() {
	return operationTime;
    }

    public void setOperationTime(Date operationTime) {
	this.operationTime = operationTime;
    }

    public Integer getBuyPrice() {
	return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
	this.buyPrice = buyPrice;
    }

    public Integer getSellPrice() {
	return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
	this.sellPrice = sellPrice;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (o == null || getClass() != o.getClass())
	    return false;
	Operation operation = (Operation) o;
	return (this.operationId.equals(operation.operationId) && this.bankId.equals(operation.bankId)
		&& this.currencyId.equals(operation.currencyId) && this.operationTime.equals(operation.operationTime)
		&& this.buyPrice.equals(operation.buyPrice) && this.sellPrice.equals(operation.sellPrice));
    }

    @Override
    public int hashCode() {
	int result = 17;
	result = 31 * result + operationId.hashCode();
	result = 31 * result + bankId.hashCode();
	result = 31 * result + currencyId.hashCode();
	result = 31 * result + operationTime.hashCode();
	result = 31 * result + buyPrice.hashCode();
	result = 31 * result + sellPrice.hashCode();
	return result;
    }

    @Override
    public String toString() {
	return ("Operation { Operation ID = " + operationId + ", Bank ID = " + bankId + ", Currency ID = " + currencyId
		+ ", Operation time = " + operationTime + ", Buy price = " + buyPrice + ", Sell price = " + sellPrice
		+ "}");
    }
}
