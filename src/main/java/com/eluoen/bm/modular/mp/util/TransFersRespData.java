package com.eluoen.bm.modular.mp.util;

/**
 * 微信企业付款响应对象
 * 
 * @author eluoen
 * @date 2016-07-12
 */
public class TransFersRespData {

	// 字段名 变量名 必填 示例值 类型 描述
	// 返回状态码 return_code 是 SUCCESS String(16) SUCCESS/FAIL
	// 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
	// 返回信息 return_msg 否 签名失败 String(128) 返回信息，如非空，为错误原因
	// 签名失败
	// 参数格式校验错误
	// 以下字段在return_code为SUCCESS的时候有返回

	// 字段名 变量名 必填 示例值 类型 描述
	// 商户appid mch_appid 是 wx8888888888888888 String
	// 微信分配的公众账号ID（企业号corpid即为此appId）
	// 商户号 mchid 是 1900000109 String(32) 微信支付分配的商户号
	// 设备号 device_info 否 013467007045764 String(32) 微信支付分配的终端设备号，
	// 随机字符串 nonce_str 是 5K8264ILTKCH16CQ2502SI8ZNMTM67VS String(32)
	// 随机字符串，不长于32位
	// 业务结果 result_code 是 SUCCESS String(16) SUCCESS/FAIL
	// 错误代码 err_code 否 SYSTEMERROR String(32) 错误码信息
	// 错误代码描述 err_code_des 否 系统错误 String(128) 结果信息描述
	// 以下字段在return_code 和result_code都为SUCCESS的时候有返回

	// 字段名 变量名 必填 示例值 类型 描述
	// 商户订单号 partner_trade_no 是 1217752501201407033233368018 String(32)
	// 商户订单号，需保持唯一性
	// 微信订单号 payment_no 是 1007752501201407033233368018 String 企业付款成功，返回的微信订单号
	// 微信支付成功时间 payment_time 是 2015-05-19 15：26：59 String 企业付款成功时间

	private String return_code;
	private String return_msg;
	private String mch_appid;
	private String mchid;
	private String device_info;
	private String nonce_str;
	private String result_code;
	private String err_code;
	private String err_code_des;
	private String partner_trade_no;
	private String payment_no;
	private String payment_time;

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}

	public String getReturn_msg() {
		return return_msg;
	}

	public void setReturn_msg(String return_msg) {
		this.return_msg = return_msg;
	}

	public String getMch_appid() {
		return mch_appid;
	}

	public void setMch_appid(String mch_appid) {
		this.mch_appid = mch_appid;
	}

	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public String getErr_code() {
		return err_code;
	}

	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}

	public String getErr_code_des() {
		return err_code_des;
	}

	public void setErr_code_des(String err_code_des) {
		this.err_code_des = err_code_des;
	}

	public String getPartner_trade_no() {
		return partner_trade_no;
	}

	public void setPartner_trade_no(String partner_trade_no) {
		this.partner_trade_no = partner_trade_no;
	}

	public String getPayment_no() {
		return payment_no;
	}

	public void setPayment_no(String payment_no) {
		this.payment_no = payment_no;
	}

	public String getPayment_time() {
		return payment_time;
	}

	public void setPayment_time(String payment_time) {
		this.payment_time = payment_time;
	}

}
