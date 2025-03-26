package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9185a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f9186b;

    public q(boolean z7) {
        this.f9185a = z7;
    }

    public final boolean a() {
        return this.f9185a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(boolean z7, Configuration configuration) {
        this(z7);
        J6.r.e(configuration, "newConfig");
        this.f9186b = configuration;
    }
}
