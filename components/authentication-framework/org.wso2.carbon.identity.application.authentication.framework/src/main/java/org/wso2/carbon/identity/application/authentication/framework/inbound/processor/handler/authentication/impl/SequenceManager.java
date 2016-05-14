package org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.authentication.impl;

import org.wso2.carbon.identity.application.authentication.framework.inbound.context.AuthenticationContext;
import org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.FrameworkHandler;
import org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.authentication.impl
        .model.Sequence;

public class SequenceManager extends FrameworkHandler {
    @Override
    public String getName() {
        return null;
    }

    public AuthenticationResponse handleSequence(AuthenticationContext authenticationContext) {
        AuthenticationResponse authenticationResponse = handleRequestPathAuthentication(authenticationContext);
        //should check condition
        authenticationResponse = handleStepAuthentication(authenticationContext);

        return authenticationResponse;
    }

    protected AuthenticationResponse handleRequestPathAuthentication(AuthenticationContext authenticationContext) {
        Sequence sequence = authenticationContext.getSequence();

        return null;
    }

    protected AuthenticationResponse handleStepAuthentication(AuthenticationContext authenticationContext) {

        return null;
    }
}