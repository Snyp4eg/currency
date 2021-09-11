package com.gmail.snyp4eg.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.gmail.snyp4eg.model.Operation;

public class OperationMapper implements RowMapper<Operation> {
    private static final String OPERATION_ID = "operation_id";
    private static final String BANK_ID = "bank_id";
    private static final String CURRENCY_ID = "currency_id";
    private static final String OPERATION_TIME = "operation_time";
    private static final String BUY_PRICE = "buy_price";
    private static final String SELL_PRICE = "sell_price";

    @Override
    public Operation mapRow(ResultSet rs, int rowNum) throws SQLException {
	Integer operationId = rs.getInt(OPERATION_ID);
	Integer bankId = rs.getInt(BANK_ID);
	Integer currencyId = rs.getInt(CURRENCY_ID);
	Date operationTime = rs.getDate(OPERATION_TIME);
	Integer buyPrice = rs.getInt(BUY_PRICE);
	Integer sellPrice = rs.getInt(SELL_PRICE);
	return new Operation(operationId, bankId, currencyId, operationTime, buyPrice, sellPrice);
    }
}
