package com.marketwinks.symbolsfeeder.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Symbols {

	@Id
	public ObjectId _id;

	private String symbol;
	private String type;
	private String exchange;
	private String name;
	private String profile;
	private String fundamentals;
	private String publicsentiment;

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange
	 *            the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @param profile
	 *            the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @return the fundamentals
	 */
	public String getFundamentals() {
		return fundamentals;
	}

	/**
	 * @param fundamentals
	 *            the fundamentals to set
	 */
	public void setFundamentals(String fundamentals) {
		this.fundamentals = fundamentals;
	}

	/**
	 * @return the publicsentiment
	 */
	public String getPublicsentiment() {
		return publicsentiment;
	}

	/**
	 * @param publicsentiment
	 *            the publicsentiment to set
	 */
	public void setPublicsentiment(String publicsentiment) {
		this.publicsentiment = publicsentiment;
	}

}
