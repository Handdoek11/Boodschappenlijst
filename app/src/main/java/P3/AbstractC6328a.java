package p3;

import android.app.Application;
import android.content.Context;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6328a {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC6328a f40230a;

    public static AbstractC6328a a(Context context) {
        AbstractC6328a abstractC6328a;
        synchronized (AbstractC6328a.class) {
            try {
                if (f40230a == null) {
                    C6342h c6342h = new C6342h(null);
                    c6342h.b((Application) context.getApplicationContext());
                    f40230a = c6342h.a();
                }
                abstractC6328a = f40230a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC6328a;
    }

    public abstract Y0 b();

    public abstract M c();
}
