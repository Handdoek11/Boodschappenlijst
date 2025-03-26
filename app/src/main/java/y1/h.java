package y1;

import android.content.Context;

/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    private static h f44550e;

    /* renamed from: a, reason: collision with root package name */
    private C6937a f44551a;

    /* renamed from: b, reason: collision with root package name */
    private C6938b f44552b;

    /* renamed from: c, reason: collision with root package name */
    private C6942f f44553c;

    /* renamed from: d, reason: collision with root package name */
    private g f44554d;

    private h(Context context, C1.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f44551a = new C6937a(applicationContext, aVar);
        this.f44552b = new C6938b(applicationContext, aVar);
        this.f44553c = new C6942f(applicationContext, aVar);
        this.f44554d = new g(applicationContext, aVar);
    }

    public static synchronized h c(Context context, C1.a aVar) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f44550e == null) {
                    f44550e = new h(context, aVar);
                }
                hVar = f44550e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public C6937a a() {
        return this.f44551a;
    }

    public C6938b b() {
        return this.f44552b;
    }

    public C6942f d() {
        return this.f44553c;
    }

    public g e() {
        return this.f44554d;
    }
}
