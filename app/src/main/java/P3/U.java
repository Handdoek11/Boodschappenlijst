package p3;

import android.os.Handler;
import android.webkit.WebView;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class U extends WebView {

    /* renamed from: o, reason: collision with root package name */
    private final Handler f40207o;

    /* renamed from: s, reason: collision with root package name */
    private final C6329a0 f40208s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f40209t;

    public U(W w7, Handler handler, C6329a0 c6329a0) {
        super(w7);
        this.f40209t = false;
        this.f40207o = handler;
        this.f40208s = c6329a0;
    }

    static /* bridge */ /* synthetic */ boolean f(U u7, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c() {
        final C6329a0 c6329a0 = this.f40208s;
        Objects.requireNonNull(c6329a0);
        this.f40207o.post(new Runnable() { // from class: p3.Q
            @Override // java.lang.Runnable
            public final void run() {
                c6329a0.b();
            }
        });
    }

    public final void d(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.f40207o.post(new Runnable() { // from class: p3.P
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6366t0.a(this.f40202o, str3);
            }
        });
    }
}
