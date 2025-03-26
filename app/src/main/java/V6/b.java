package V6;

import A6.g;
import U6.J;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public final class b extends A6.a implements J {
    private volatile Object _preHandler;

    public b() {
        super(J.f5406c);
        this._preHandler = this;
    }

    private final Method q0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // U6.J
    public void N(g gVar, Throwable th) {
        int i8 = Build.VERSION.SDK_INT;
        if (26 > i8 || i8 >= 28) {
            return;
        }
        Method q02 = q0();
        Object invoke = q02 != null ? q02.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
