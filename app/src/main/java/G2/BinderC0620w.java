package G2;

import android.content.Context;

/* renamed from: G2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC0620w extends D2.G0 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Context f2720o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C0624z f2721s;

    BinderC0620w(C0624z c0624z, Context context) {
        this.f2720o = context;
        this.f2721s = c0624z;
    }

    @Override // D2.H0
    public final void A5(D2.W0 w02) {
        if (w02 == null) {
            return;
        }
        this.f2721s.i(this.f2720o, w02.f1163s, true, true);
    }
}
