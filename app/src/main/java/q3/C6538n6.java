package q3;

import A3.AbstractC0376j;
import Z2.C0775n;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: q3.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6538n6 {

    /* renamed from: k, reason: collision with root package name */
    private static P6 f42157k;

    /* renamed from: l, reason: collision with root package name */
    private static final d7 f42158l = d7.d("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f42159a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42160b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6482g6 f42161c;

    /* renamed from: d, reason: collision with root package name */
    private final Y4.j f42162d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC0376j f42163e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC0376j f42164f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42165g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42166h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f42167i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f42168j = new HashMap();

    public C6538n6(Context context, final Y4.j jVar, InterfaceC6482g6 interfaceC6482g6, String str) {
        this.f42159a = context.getPackageName();
        this.f42160b = Y4.c.a(context);
        this.f42162d = jVar;
        this.f42161c = interfaceC6482g6;
        A6.a();
        this.f42165g = str;
        this.f42163e = Y4.f.a().b(new Callable() { // from class: q3.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41791o.a();
            }
        });
        Y4.f a8 = Y4.f.a();
        jVar.getClass();
        this.f42164f = a8.b(new Callable() { // from class: q3.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jVar.a();
            }
        });
        d7 d7Var = f42158l;
        this.f42166h = d7Var.containsKey(str) ? DynamiteModule.c(context, (String) d7Var.get(str)) : -1;
    }

    private static synchronized P6 d() {
        synchronized (C6538n6.class) {
            try {
                P6 p62 = f42157k;
                if (p62 != null) {
                    return p62;
                }
                v0.i a8 = v0.f.a(Resources.getSystem().getConfiguration());
                C6537n5 c6537n5 = new C6537n5();
                for (int i8 = 0; i8 < a8.g(); i8++) {
                    c6537n5.a(Y4.c.b(a8.d(i8)));
                }
                P6 b8 = c6537n5.b();
                f42157k = b8;
                return b8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ String a() {
        return C0775n.a().b(this.f42165g);
    }

    final /* synthetic */ void b(InterfaceC6474f6 interfaceC6474f6, EnumC6536n4 enumC6536n4, String str) {
        interfaceC6474f6.c(enumC6536n4);
        String a8 = interfaceC6474f6.a();
        E5 e52 = new E5();
        e52.b(this.f42159a);
        e52.c(this.f42160b);
        e52.h(d());
        e52.g(Boolean.TRUE);
        e52.l(a8);
        e52.j(str);
        e52.i(this.f42164f.s() ? (String) this.f42164f.o() : this.f42162d.a());
        e52.d(10);
        e52.k(Integer.valueOf(this.f42166h));
        interfaceC6474f6.b(e52);
        this.f42161c.a(interfaceC6474f6);
    }

    public final void c(final InterfaceC6474f6 interfaceC6474f6, final EnumC6536n4 enumC6536n4) {
        final String b8 = this.f42163e.s() ? (String) this.f42163e.o() : C0775n.a().b(this.f42165g);
        Y4.f.d().execute(new Runnable() { // from class: q3.m6
            @Override // java.lang.Runnable
            public final void run() {
                this.f41888o.b(interfaceC6474f6, enumC6536n4, b8);
            }
        });
    }
}
