package v4;

import java.util.Stack;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6840e {

    /* renamed from: a, reason: collision with root package name */
    public final String f44090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44091b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f44092c;

    /* renamed from: d, reason: collision with root package name */
    public final C6840e f44093d;

    private C6840e(String str, String str2, StackTraceElement[] stackTraceElementArr, C6840e c6840e) {
        this.f44090a = str;
        this.f44091b = str2;
        this.f44092c = stackTraceElementArr;
        this.f44093d = c6840e;
    }

    public static C6840e a(Throwable th, InterfaceC6839d interfaceC6839d) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        C6840e c6840e = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c6840e = new C6840e(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC6839d.a(th2.getStackTrace()), c6840e);
        }
        return c6840e;
    }
}
