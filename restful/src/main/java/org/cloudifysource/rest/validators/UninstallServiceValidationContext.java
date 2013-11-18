/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.cloudifysource.rest.validators;

import org.cloudifysource.domain.cloud.Cloud;
import org.openspaces.admin.Admin;

/**
 * A POJO for holding uninstall-service validator's parameters.
 * 
 * @author noak
 */
public class UninstallServiceValidationContext {

	private Cloud cloud;
	private Admin admin;
	private String puName;

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(final Cloud cloud) {
		this.cloud = cloud;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(final Admin admin) {
		this.admin = admin;
	}

	public String getPuName() {
		return puName;
	}

	public void setPuName(final String puName) {
		this.puName = puName;
	}

}
