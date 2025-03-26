package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9098a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f9099b;

    public h(boolean z7) {
        this.f9098a = z7;
    }

    public final boolean a() {
        return this.f9098a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(boolean z7, Configuration configuration) {
        this(z7);
        J6.r.e(configuration, "newConfig");
        this.f9099b = configuration;
    }
}
