package Y4;

import A3.AbstractC0378l;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import g4.C5807c;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6079b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static g f6080c;

    /* renamed from: a, reason: collision with root package name */
    private g4.o f6081a;

    private g() {
    }

    public static g c() {
        g gVar;
        synchronized (f6079b) {
            Z2.r.q(f6080c != null, "MlKitContext has not been initialized");
            gVar = (g) Z2.r.l(f6080c);
        }
        return gVar;
    }

    public static g d(Context context) {
        g gVar;
        synchronized (f6079b) {
            Z2.r.q(f6080c == null, "MlKitContext is already initialized");
            g gVar2 = new g();
            f6080c = gVar2;
            Context e8 = e(context);
            g4.o e9 = g4.o.m(AbstractC0378l.f204a).d(g4.g.c(e8, MlKitComponentDiscoveryService.class).b()).b(C5807c.s(e8, Context.class, new Class[0])).b(C5807c.s(gVar2, g.class, new Class[0])).e();
            gVar2.f6081a = e9;
            e9.p(true);
            gVar = f6080c;
        }
        return gVar;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        Z2.r.q(f6080c == this, "MlKitContext has been deleted");
        Z2.r.l(this.f6081a);
        return this.f6081a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
