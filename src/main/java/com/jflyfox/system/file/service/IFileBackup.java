package com.jflyfox.system.file.service;

import com.jflyfox.system.file.model.FileUploadBean;

public interface IFileBackup {

	/**
	 * 文件备份
	 * 
	 * 2018年4月5日 上午3:04:20
	 * 
	 * @param fileBean
	 * @return
	 */
	boolean backup(FileUploadBean fileBean);

	/**
	 * 文件恢复
	 * 
	 * 2018年4月5日 下午4:30:15
	 * 
	 * @return
	 */
	boolean restore(String projectPath);
}
