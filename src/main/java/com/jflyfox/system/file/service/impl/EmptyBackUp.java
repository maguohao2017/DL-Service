package com.jflyfox.system.file.service.impl;

import com.jflyfox.system.file.model.FileUploadBean;
import com.jflyfox.system.file.service.IFileBackup;

/**
 * 不进行任何备份,即关闭备份
 * 
 * 2018年4月5日 上午4:53:34
 */
public class EmptyBackUp implements IFileBackup {

	public boolean backup(FileUploadBean fileBean) {
		return true;
	}

	public boolean restore(String projectPath) {
		return true;
	}

}
