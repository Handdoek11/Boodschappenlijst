package r1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import q1.AbstractC6417d;
import q1.C6416c;

/* loaded from: classes.dex */
public abstract class t implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f42395a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static AbstractC6417d[] a(InvocationHandler[] invocationHandlerArr) {
        AbstractC6417d[] abstractC6417dArr = new AbstractC6417d[invocationHandlerArr.length];
        for (int i8 = 0; i8 < invocationHandlerArr.length; i8++) {
            abstractC6417dArr[i8] = new v(invocationHandlerArr[i8]);
        }
        return abstractC6417dArr;
    }

    public static C6416c b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        AbstractC6417d[] a8 = a(webMessageBoundaryInterface.getPorts());
        if (!w.f42400C.d()) {
            return new C6416c(webMessageBoundaryInterface.getData(), a8);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) o7.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new C6416c(webMessagePayloadBoundaryInterface.getAsString(), a8);
        }
        if (type != 1) {
            return null;
        }
        return new C6416c(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a8);
    }
}
