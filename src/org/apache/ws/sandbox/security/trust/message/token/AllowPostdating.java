/*
 * Copyright  2003-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.ws.security.trust.message.token;

import javax.xml.namespace.QName;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.trust.TrustConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author Malinda Kaushalye 
 * @author Ruchith Fernando
 * 
 * AllowPostdating element <p/>This element indicates
 * that returned tokens should allow requests for postdated tokens.
 */
public class AllowPostdating extends AbstractToken {
	
    public static final QName TOKEN = new QName(TrustConstants.WST_NS, TrustConstants.ALLOWPOSTDATING_LN, TrustConstants.WST_PREFIX);

    /**
     * Constructor for AllowPostdating
     *
     * @param elem
     * @throws WSSecurityException
     */
    public AllowPostdating(Element elem) throws WSSecurityException {
    	super(elem);
    }

    /**
     * Constructor for AllowPostdating
     *
     * @param doc
     */
    public AllowPostdating(Document doc) {
        super(doc);
    }

	/**
	 * Returns the QName of this type
	 * @see org.apache.ws.security.trust.message.token.AbstractToken#getToken()
	 */
	protected QName getToken() {
		return TOKEN;
	}

}
