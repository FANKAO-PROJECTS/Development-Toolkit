// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$14 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$14() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "fabs",
        constants$10.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ldexp",
        constants$14.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_DOUBLE,
        JAVA_DOUBLE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "frexp",
        constants$14.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "modf",
        constants$14.const$3
    );
}


