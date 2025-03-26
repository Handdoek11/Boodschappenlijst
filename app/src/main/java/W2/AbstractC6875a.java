package w2;

import D2.C0498e1;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6875a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0498e1 f44252a;

    protected AbstractC6875a() {
        C0498e1 c0498e1 = new C0498e1();
        this.f44252a = c0498e1;
        c0498e1.s("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public AbstractC6875a a(String str) {
        this.f44252a.q(str);
        return c();
    }

    public AbstractC6875a b(Class cls, Bundle bundle) {
        this.f44252a.r(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f44252a.t("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return c();
    }

    protected abstract AbstractC6875a c();

    public final AbstractC6875a d(String str) {
        this.f44252a.s(str);
        return c();
    }

    public final AbstractC6875a e(boolean z7) {
        this.f44252a.u(z7);
        return c();
    }

    public final AbstractC6875a f(boolean z7) {
        this.f44252a.a(z7);
        return c();
    }
}
