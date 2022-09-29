package io.github.rovingsea.utilityframework.core.exception.handler;

import io.github.rovingsea.utilityframework.core.response.ControllerExceptionResponse;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *
 * @author Haixin Wu
 * @since 1.0.0
 */
public class UtilityExceptionHandler extends AbstractExceptionHandler {

    public UtilityExceptionHandler(ApplicationContext context) {
        super(context.getBean(ControllerExceptionResponse.class));
    }

    @Override
    public Object doHandle(Map<String, Object> responseBody, Map<String, String> responseHeader,
                               HttpServletRequest request, HttpServletResponse response,
                               Throwable throwable) {
        this.controllerExceptionResponse.setResponseBody(responseBody, throwable, request, response);
        this.controllerExceptionResponse.setResponseHeader(responseHeader, throwable, request, response);
        return responseBody;
    }
}
