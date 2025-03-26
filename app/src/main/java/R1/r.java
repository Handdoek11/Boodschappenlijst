package r1;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import q1.AbstractC6414a;

/* loaded from: classes.dex */
public class r extends AbstractC6414a {

    /* renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f42390a;

    class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f42391o;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f42391o = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new r(this.f42391o);
        }
    }

    public r(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f42390a = jsReplyProxyBoundaryInterface;
    }

    public static r a(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) o7.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (r) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }
}
