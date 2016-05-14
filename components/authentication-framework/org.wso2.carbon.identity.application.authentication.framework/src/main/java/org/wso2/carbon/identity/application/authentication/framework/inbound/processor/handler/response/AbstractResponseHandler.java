package org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.response;


import org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkHandlerResponse;
import org.wso2.carbon.identity.application.authentication.framework.inbound.context.IdentityMessageContext;
import org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.FrameworkHandler;

public abstract class AbstractResponseHandler extends FrameworkHandler {

    public abstract FrameworkHandlerResponse buildErrorResponse(IdentityMessageContext identityMessageContext)
            throws ResponseException;

    public abstract FrameworkHandlerResponse buildResponse(IdentityMessageContext identityMessageContext)
            throws ResponseException;

}