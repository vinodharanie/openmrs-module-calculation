/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation;

import org.openmrs.api.APIException;

/**
 * Represents an error that is thrown when a {@link Calculation} is requested with 
 * an invalid configuration string
 */
public class InvalidConfigurationException extends APIException {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidConfigurationException(Class<? extends Calculation> calculationType, String configuration) {
		super("An invalid configuration of '" + configuration + "' was passed into a " + calculationType.getSimpleName());
	}
}
