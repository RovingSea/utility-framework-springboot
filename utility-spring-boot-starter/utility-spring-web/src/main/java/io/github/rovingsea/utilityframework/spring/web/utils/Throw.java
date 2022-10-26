package io.github.rovingsea.utilityframework.spring.web.utils;

import io.github.rovingsea.utilityframework.spring.web.exception.ExceptionEnum;
import io.github.rovingsea.utilityframework.spring.web.exception.ExceptionDispatcher;
import io.github.rovingsea.utilityframework.spring.web.exception.ExpectedException;
import org.springframework.http.HttpStatus;

/**
 * <p>
 * Throw the exception information conveniently and concretely,
 * including the response code and the information in the response body.
 * </p>
 * <p>
 * As there are too many methods involved, here is an example to summarize:
 * <pre>{@code
 *     public static void badRequest(Enum<? extends BaseEnum> en) {
 *         BaseEnum baseEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
 *         badRequest(baseEnum.getCode(), baseEnum.getMessage());
 *     }
 * }</pre>
 * The above code is obtained by passing the implementation class of {@link ExceptionEnum}
 * to obtain its {@link ExceptionEnum#getCode()} and {@link ExceptionEnum#getMessage()},
 * and then passed to the following code:
 * <pre>{@code
 *     public static void badRequest(int code, String message) {
 *         throw new ExpectedException(code, message, HttpStatus.BAD_REQUEST);
 *     }
 * }</pre>
 * The above code will throw an exception containing {@link HttpStatus}
 * through {@link ExceptionEnum#getCode()} and {@link ExceptionEnum#getMessage()}.
 * </p>
 * <p>
 * Finally, the thrown exception will be handled in {@link ExceptionDispatcher}
 * </p>
 *
 * @author Haixin Wu
 * @since 1.0.1
 */
public abstract class Throw {

    /**
     * Throw an exception, and the response code carries {@link HttpStatus#INTERNAL_SERVER_ERROR}
     * by default.
     *
     * @param en implementation enumeration of BaseEnum.
     */
    public static void exception(Enum<? extends ExceptionEnum> en) {
        exception(en, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Throw an exception, and the response code determined by parameter <i>httpStatus</i>.
     *
     * @param en         implementation enumeration of BaseEnum.
     * @param httpStatus the response code.
     */
    public static void exception(Enum<? extends ExceptionEnum> en, HttpStatus httpStatus) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        exception(exceptionEnum.getCode(), exceptionEnum.getMessage(), httpStatus);
    }

    /**
     * Throw an exception, and the response code determined by parameter httpStatus.
     *
     * @param code       exception code in the response body
     * @param message    exception message in the response body
     * @param httpStatus the response code
     */
    public static void exception(int code, String message, HttpStatus httpStatus) {
        throw new ExpectedException(code, message, httpStatus);
    }

    // 1xx Informational

    /**
     * {@code 100 Continue}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.2.1">HTTP/1.1: Semantics and Content, section 6.2.1</a>
     */
    public static void Continue(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        Continue(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void Continue(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.CONTINUE);
    }

    /**
     * {@code 101 Switching Protocols}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.2.2">HTTP/1.1: Semantics and Content, section 6.2.2</a>
     */
    public static void switchingProtocols(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        switchingProtocols(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void switchingProtocols(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.SWITCHING_PROTOCOLS);
    }

    /**
     * {@code 102 Processing}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc2518#section-10.1">WebDAV</a>
     */
    public static void processing(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        processing(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void processing(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PROCESSING);
    }

    /**
     * {@code 103 Checkpoint}.
     *
     * @see <a href="https://code.google.com/p/gears/wiki/ResumableHttpRequestsProposal">A proposal for supporting
     * resumable POST/PUT HTTP requests in HTTP/1.0</a>
     */
    public static void checkpoint(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        checkpoint(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void checkpoint(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.CHECKPOINT);
    }

    // 2xx Success

    /**
     * {@code 200 OK}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.1">HTTP/1.1: Semantics and Content, section 6.3.1</a>
     */
    public static void ok(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        ok(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void ok(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.OK);
    }

    /**
     * {@code 201 Created}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
     */
    public static void created(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        created(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void created(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.CREATED);
    }

    /**
     * {@code 202 Accepted}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.3">HTTP/1.1: Semantics and Content, section 6.3.3</a>
     */
    public static void accepted(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        accepted(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void accepted(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.ACCEPTED);
    }

    /**
     * {@code 203 Non-Authoritative Information}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.4">HTTP/1.1: Semantics and Content, section 6.3.4</a>
     */
    public static void nonAuthoritativeInformation(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        nonAuthoritativeInformation(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void nonAuthoritativeInformation(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    /**
     * {@code 204 No Content}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.5">HTTP/1.1: Semantics and Content, section 6.3.5</a>
     */
    public static void noContent(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        noContent(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void noContent(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NO_CONTENT);
    }

    /**
     * {@code 205 Reset Content}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.3.6">HTTP/1.1: Semantics and Content, section 6.3.6</a>
     */
    public static void resetContent(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        resetContent(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void resetContent(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.RESET_CONTENT);
    }

    /**
     * {@code 206 Partial Content}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7233#section-4.1">HTTP/1.1: Range Requests, section 4.1</a>
     */
    public static void partialContent(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        partialContent(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void partialContent(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PARTIAL_CONTENT);
    }

    /**
     * {@code 207 Multi-Status}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-13">WebDAV</a>
     */
    public static void multiStatus(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        multiStatus(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void multiStatus(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.MULTI_STATUS);
    }

    /**
     * {@code 208 Already Reported}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc5842#section-7.1">WebDAV Binding Extensions</a>
     */
    public static void alreadyReported(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        alreadyReported(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void alreadyReported(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.ALREADY_REPORTED);
    }

    /**
     * {@code 226 IM Used}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc3229#section-10.4.1">Delta encoding in HTTP</a>
     */
    public static void imUsed(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        imUsed(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void imUsed(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.IM_USED);
    }

    // 3xx Redirection

    /**
     * {@code 300 Multiple Choices}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.1">HTTP/1.1: Semantics and Content, section 6.4.1</a>
     */
    public static void multipleChoices(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        multipleChoices(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void multipleChoices(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.MULTIPLE_CHOICES);
    }

    /**
     * {@code 301 Moved Permanently}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.2">HTTP/1.1: Semantics and Content, section 6.4.2</a>
     */
    public static void movedPermanently(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        movedPermanently(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void movedPermanently(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.MOVED_PERMANENTLY);
    }

    /**
     * {@code 302 Found}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.3">HTTP/1.1: Semantics and Content, section 6.4.3</a>
     */
    public static void found(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        found(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void found(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.FOUND);
    }

    /**
     * {@code 302 Moved Temporarily}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc1945#section-9.3">HTTP/1.0, section 9.3</a>
     * @deprecated in favor of {@link #found(int, String)} which will be returned from {@code HttpStatus.valueOf(302)}
     */
    @Deprecated
    public static void movedTemporarily(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        movedTemporarily(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void movedTemporarily(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.MOVED_TEMPORARILY);
    }

    /**
     * {@code 303 See Other}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.4">HTTP/1.1: Semantics and Content, section 6.4.4</a>
     */
    public static void seeOther(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        seeOther(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void seeOther(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.SEE_OTHER);
    }

    /**
     * {@code 304 Not Modified}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7232#section-4.1">HTTP/1.1: Conditional Requests, section 4.1</a>
     */
    public static void notModified(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        notModified(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void notModified(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NOT_MODIFIED);
    }

    /**
     * {@code 305 Use Proxy}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.5">HTTP/1.1: Semantics and Content, section 6.4.5</a>
     * @deprecated due to security concerns regarding in-band configuration of a proxy
     */
    @Deprecated
    public static void useProxy(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        useProxy(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void useProxy(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.USE_PROXY);
    }

    /**
     * {@code 307 Temporary Redirect}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.4.7">HTTP/1.1: Semantics and Content, section 6.4.7</a>
     */
    public static void temporaryRedirect(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        temporaryRedirect(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void temporaryRedirect(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.TEMPORARY_REDIRECT);
    }

    /**
     * {@code 308 Permanent Redirect}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7238">RFC 7238</a>
     */
    public static void permanentRedirect(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        permanentRedirect(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void permanentRedirect(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PERMANENT_REDIRECT);
    }

    // --- 4xx Client Error ---

    /**
     * {@code 400 Bad Request}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.1">HTTP/1.1: Semantics and Content, section 6.5.1</a>
     */
    public static void badRequest(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        badRequest(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void badRequest(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.BAD_REQUEST);
    }

    /**
     * {@code 401 Unauthorized}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7235#section-3.1">HTTP/1.1: Authentication, section 3.1</a>
     */
    public static void unauthorized(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        unauthorized(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void unauthorized(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.UNAUTHORIZED);
    }

    /**
     * {@code 402 Payment Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.2">HTTP/1.1: Semantics and Content, section 6.5.2</a>
     */
    public static void paymentRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        paymentRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void paymentRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PAYMENT_REQUIRED);
    }

    /**
     * {@code 403 Forbidden}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.3">HTTP/1.1: Semantics and Content, section 6.5.3</a>
     */
    public static void forbidden(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        forbidden(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void forbidden(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.FORBIDDEN);
    }

    /**
     * {@code 404 Not Found}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.4">HTTP/1.1: Semantics and Content, section 6.5.4</a>
     */
    public static void notFound(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        notFound(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void notFound(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NOT_FOUND);
    }

    /**
     * {@code 405 Method Not Allowed}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.5">HTTP/1.1: Semantics and Content, section 6.5.5</a>
     */
    public static void methodNotAllowed(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        methodNotAllowed(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void methodNotAllowed(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.METHOD_NOT_ALLOWED);
    }

    /**
     * {@code 406 Not Acceptable}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.6">HTTP/1.1: Semantics and Content, section 6.5.6</a>
     */
    public static void notAcceptable(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        notAcceptable(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void notAcceptable(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * {@code 407 Proxy Authentication Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7235#section-3.2">HTTP/1.1: Authentication, section 3.2</a>
     */
    public static void proxyAuthenticationRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        proxyAuthenticationRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void proxyAuthenticationRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    /**
     * {@code 408 Request Timeout}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.7">HTTP/1.1: Semantics and Content, section 6.5.7</a>
     */
    public static void requestTimeout(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        requestTimeout(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void requestTimeout(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.REQUEST_TIMEOUT);
    }

    /**
     * {@code 409 Conflict}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.8">HTTP/1.1: Semantics and Content, section 6.5.8</a>
     */
    public static void conflict(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        conflict(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void conflict(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.CONFLICT);
    }

    /**
     * {@code 410 Gone}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.9">
     * HTTP/1.1: Semantics and Content, section 6.5.9</a>
     */
    public static void gone(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        gone(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void gone(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.GONE);
    }

    /**
     * {@code 411 Length Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.10">
     * HTTP/1.1: Semantics and Content, section 6.5.10</a>
     */
    public static void lengthRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        lengthRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void lengthRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.LENGTH_REQUIRED);
    }

    /**
     * {@code 412 Precondition failed}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7232#section-4.2">
     * HTTP/1.1: Conditional Requests, section 4.2</a>
     */
    public static void preconditionFailed(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        preconditionFailed(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void preconditionFailed(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PRECONDITION_FAILED);
    }

    /**
     * {@code 413 Payload Too Large}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.11">
     * HTTP/1.1: Semantics and Content, section 6.5.11</a>
     * @since 4.1
     */
    public static void payloadTooLarge(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        payloadTooLarge(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void payloadTooLarge(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    /**
     * {@code 413 Request Entity Too Large}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.14">HTTP/1.1, section 10.4.14</a>
     * @deprecated in favor of {@link #payloadTooLarge(int, String)} which will be
     * returned from {@code HttpStatus.valueOf(413)}
     */
    @Deprecated
    public static void requestEntityTooLarge(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        requestEntityTooLarge(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void requestEntityTooLarge(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.REQUEST_ENTITY_TOO_LARGE);
    }

    /**
     * {@code 414 URI Too Long}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.12">
     * HTTP/1.1: Semantics and Content, section 6.5.12</a>
     * @since 4.1
     */
    public static void URITooLong(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        URITooLong(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void URITooLong(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.URI_TOO_LONG);
    }

    /**
     * {@code 414 Request-URI Too Long}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.15">HTTP/1.1, section 10.4.15</a>
     * @deprecated in favor of {@link #URITooLong(int, String)} which will be returned from {@code HttpStatus.valueOf(414)}
     */
    @Deprecated
    public static void RequestURITooLong(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        RequestURITooLong(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void RequestURITooLong(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.REQUEST_URI_TOO_LONG);
    }

    /**
     * {@code 415 Unsupported Media Type}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.13">
     * HTTP/1.1: Semantics and Content, section 6.5.13</a>
     */
    public static void unsupportedMediaType(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        unsupportedMediaType(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void unsupportedMediaType(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * {@code 416 Requested Range Not Satisfiable}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7233#section-4.4">HTTP/1.1: Range Requests, section 4.4</a>
     */
    public static void requestedRangeNotSatisfiable(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        requestedRangeNotSatisfiable(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void requestedRangeNotSatisfiable(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    /**
     * {@code 417 Expectation Failed}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.14">
     * HTTP/1.1: Semantics and Content, section 6.5.14</a>
     */
    public static void expectationFailed(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        expectationFailed(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void expectationFailed(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.EXPECTATION_FAILED);
    }

    /**
     * {@code 418 I'm a teapot}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc2324#section-2.3.2">HTCPCP/1.0</a>
     */
    public static void iamATeapot(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        iamATeapot(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void iamATeapot(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.I_AM_A_TEAPOT);
    }

    /**
     * @deprecated See
     * <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     * WebDAV Draft Changes</a>
     */
    @Deprecated
    public static void insufficientSpaceOnResource(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        insufficientSpaceOnResource(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void insufficientSpaceOnResource(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.INSUFFICIENT_SPACE_ON_RESOURCE);
    }

    /**
     * @deprecated See
     * <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     * WebDAV Draft Changes</a>
     */
    @Deprecated
    public static void methodFailure(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        methodFailure(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void methodFailure(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.METHOD_FAILURE);
    }

    /**
     * @deprecated See <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     * WebDAV Draft Changes</a>
     */
    @Deprecated
    public static void destinationLocked(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        destinationLocked(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    @Deprecated
    public static void destinationLocked(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.DESTINATION_LOCKED);
    }

    /**
     * {@code 422 Unprocessable Entity}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.2">WebDAV</a>
     */
    public static void unprocessableEntity(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        unprocessableEntity(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void unprocessableEntity(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    /**
     * {@code 423 Locked}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.3">WebDAV</a>
     */
    public static void locked(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        locked(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void locked(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.LOCKED);
    }

    /**
     * {@code 424 Failed Dependency}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.4">WebDAV</a>
     */
    public static void failedDependency(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        failedDependency(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void failedDependency(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.FAILED_DEPENDENCY);
    }

    /**
     * {@code 425 Too Early}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc8470">RFC 8470</a>
     * @since 5.2
     */
    public static void tooEarly(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        tooEarly(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void tooEarly(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.TOO_EARLY);
    }

    /**
     * {@code 426 Upgrade Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc2817#section-6">Upgrading to TLS Within HTTP/1.1</a>
     */
    public static void upgradeRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        upgradeRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void upgradeRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.UPGRADE_REQUIRED);
    }

    /**
     * {@code 428 Precondition Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-3">Additional HTTP Status Codes</a>
     */
    public static void preconditionRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        preconditionRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void preconditionRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.PRECONDITION_REQUIRED);
    }

    /**
     * {@code 429 Too Many Requests}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-4">Additional HTTP Status Codes</a>
     */
    public static void tooManyRequests(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        tooManyRequests(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void tooManyRequests(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.TOO_MANY_REQUESTS);
    }

    /**
     * {@code 431 Request Header Fields Too Large}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-5">Additional HTTP Status Codes</a>
     */
    public static void requestHeaderFieldsTooLarge(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        requestHeaderFieldsTooLarge(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void requestHeaderFieldsTooLarge(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    /**
     * {@code 451 Unavailable For Legal Reasons}.
     *
     * @see <a href="https://tools.ietf.org/html/draft-ietf-httpbis-legally-restricted-status-04">
     * An HTTP Status Code to Report Legal Obstacles</a>
     * @since 4.3
     */
    public static void unavailableForLegalReasons(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        unavailableForLegalReasons(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void unavailableForLegalReasons(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    // --- 5xx Server Error ---

    /**
     * {@code 500 Internal Server Error}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.1">HTTP/1.1: Semantics and Content, section 6.6.1</a>
     */
    public static void internalServerError(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        internalServerError(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void internalServerError(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * {@code 501 Not Implemented}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.2">HTTP/1.1: Semantics and Content, section 6.6.2</a>
     */
    public static void notImplemented(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        notImplemented(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void notImplemented(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * {@code 502 Bad Gateway}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.3">HTTP/1.1: Semantics and Content, section 6.6.3</a>
     */
    public static void badGateway(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        badGateway(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void badGateway(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.BAD_GATEWAY);
    }

    /**
     * {@code 503 Service Unavailable}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.4">HTTP/1.1: Semantics and Content, section 6.6.4</a>
     */
    public static void serviceUnavailable(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        serviceUnavailable(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void serviceUnavailable(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.SERVICE_UNAVAILABLE);
    }

    /**
     * {@code 504 Gateway Timeout}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.5">HTTP/1.1: Semantics and Content, section 6.6.5</a>
     */
    public static void gatewayTimeout(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        gatewayTimeout(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void gatewayTimeout(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.GATEWAY_TIMEOUT);
    }

    /**
     * {@code 505 HTTP Version Not Supported}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.6">HTTP/1.1: Semantics and Content, section 6.6.6</a>
     */
    public static void HttpVersionNotSupported(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        HttpVersionNotSupported(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void HttpVersionNotSupported(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    /**
     * {@code 506 Variant Also Negotiates}
     *
     * @see <a href="https://tools.ietf.org/html/rfc2295#section-8.1">Transparent Content Negotiation</a>
     */
    public static void variantAlsoNegotiates(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        variantAlsoNegotiates(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void variantAlsoNegotiates(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    /**
     * {@code 507 Insufficient Storage}
     *
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.5">WebDAV</a>
     */
    public static void insufficientStorage(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        insufficientStorage(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void insufficientStorage(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * {@code 508 Loop Detected}
     *
     * @see <a href="https://tools.ietf.org/html/rfc5842#section-7.2">WebDAV Binding Extensions</a>
     */
    public static void loopDetected(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        loopDetected(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void loopDetected(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.LOOP_DETECTED);
    }

    /**
     * {@code 509 Bandwidth Limit Exceeded}
     */
    public static void bandwidthLimitExceeded(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        bandwidthLimitExceeded(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void bandwidthLimitExceeded(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    /**
     * {@code 510 Not Extended}
     *
     * @see <a href="https://tools.ietf.org/html/rfc2774#section-7">HTTP Extension Framework</a>
     */
    public static void notExtended(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        notExtended(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void notExtended(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NOT_EXTENDED);
    }

    /**
     * {@code 511 Network Authentication Required}.
     *
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-6">Additional HTTP Status Codes</a>
     */
    public static void networkAuthenticationRequired(Enum<? extends ExceptionEnum> en) {
        ExceptionEnum exceptionEnum = Enum.valueOf(en.getDeclaringClass(), en.name());
        networkAuthenticationRequired(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public static void networkAuthenticationRequired(int code, String message) {
        throw new ExpectedException(code, message, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

}
