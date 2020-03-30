#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.exception;

import com.google.common.collect.ImmutableMap;
import org.ddd.shared.web.exception.AppException;
import org.ddd.shared.web.exception.CommonErrorCode;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-27 13:49
 */
public class OrderNotFoundException extends AppException {
    private static final long serialVersionUID = 1L;

    public OrderNotFoundException(String orderId) {
        super(CommonErrorCode.NOT_FOUND, ImmutableMap.of("orderId",orderId));
    }
}
