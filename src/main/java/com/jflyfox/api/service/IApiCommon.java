package com.jflyfox.api.service;

import com.jflyfox.api.form.ApiResp;
import com.jflyfox.api.form.ApiForm;

/**
 * API通用接口
 * 
 * 2018年11月15日 下午9:43:49
 */
public interface IApiCommon {

	/**
	 * 登陆接口
	 * 
	 * 2018年10月1日 下午9:20:12
	 * 
	 * @param form
	 * @return
	 */
	public ApiResp login(ApiForm form);

	/**
	 * 登陆后，验证接口
	 * 
	 * 2018年10月1日 下午9:20:12
	 * 
	 * @param form
	 * @return
	 */
	public ApiResp valid(ApiForm form);

	/**
	 * 登出接口
	 * 
	 * 2018年10月1日 下午9:20:12
	 * 
	 * @param form
	 * @return
	 */
	public ApiResp logout(ApiForm form);

	/**
	 * 获取配置信息
	 * 
	 * 2018年10月1日 下午9:20:12
	 * 
	 * @param form
	 * @return
	 */
	public ApiResp config(ApiForm form);

}
