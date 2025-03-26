package p3;

import android.app.Application;

/* renamed from: p3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6342h {

    /* renamed from: a, reason: collision with root package name */
    private Application f40293a;

    /* synthetic */ C6342h(AbstractC6348k abstractC6348k) {
    }

    public final AbstractC6328a a() {
        R0.b(this.f40293a, Application.class);
        return new C6340g(this.f40293a, null);
    }

    public final C6342h b(Application application) {
        application.getClass();
        this.f40293a = application;
        return this;
    }
}
