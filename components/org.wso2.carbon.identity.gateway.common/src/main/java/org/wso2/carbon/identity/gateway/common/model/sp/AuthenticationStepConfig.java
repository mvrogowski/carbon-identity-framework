/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.gateway.common.model.sp;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationStepConfig {

    private int step ;
    private String useLocalSubjectIdentifier;
    private String useDomainInLocalSubjectIdentifier;
    private String authStrategy;
    private List<IdentityProvider> identityProviders = new ArrayList<>();

    public String getAuthStrategy() {
        return authStrategy;
    }

    public void setAuthStrategy(String authStrategy) {
        this.authStrategy = authStrategy;
    }

    public List<IdentityProvider> getIdentityProviders() {
        return identityProviders;
    }

    public void setIdentityProviders(List<IdentityProvider> identityProviders) {
        this.identityProviders = identityProviders;
    }

    public String getUseDomainInLocalSubjectIdentifier() {
        return useDomainInLocalSubjectIdentifier;
    }

    public void setUseDomainInLocalSubjectIdentifier(String useDomainInLocalSubjectIdentifier) {
        this.useDomainInLocalSubjectIdentifier = useDomainInLocalSubjectIdentifier;
    }

    public String getUseLocalSubjectIdentifier() {
        return useLocalSubjectIdentifier;
    }

    public void setUseLocalSubjectIdentifier(String useLocalSubjectIdentifier) {
        this.useLocalSubjectIdentifier = useLocalSubjectIdentifier;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}