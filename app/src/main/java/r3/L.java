package r3;

import A3.AbstractC0376j;
import Z2.C0775n;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC6698p f42550k = AbstractC6698p.d("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f42551a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42552b;

    /* renamed from: c, reason: collision with root package name */
    private final F f42553c;

    /* renamed from: d, reason: collision with root package name */
    private final Y4.j f42554d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC0376j f42555e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC0376j f42556f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42557g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42558h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f42559i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f42560j = new HashMap();

    public L(Context context, final Y4.j jVar, F f8, String str) {
        this.f42551a = context.getPackageName();
        this.f42552b = Y4.c.a(context);
        this.f42554d = jVar;
        this.f42553c = f8;
        V.a();
        this.f42557g = str;
        this.f42555e = Y4.f.a().b(new Callable() { // from class: r3.J
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42548o.a();
            }
        });
        Y4.f a8 = Y4.f.a();
        jVar.getClass();
        this.f42556f = a8.b(new Callable() { // from class: r3.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jVar.a();
            }
        });
        AbstractC6698p abstractC6698p = f42550k;
        this.f42558h = abstractC6698p.containsKey(str) ? DynamiteModule.c(context, (String) abstractC6698p.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C0775n.a().b(this.f42557g);
    }
}
