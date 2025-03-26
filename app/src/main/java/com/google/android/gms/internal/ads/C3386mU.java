package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3386mU implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24517a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4241uH f24518b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f24519c;

    /* renamed from: d, reason: collision with root package name */
    private final C3676p60 f24520d;

    /* renamed from: e, reason: collision with root package name */
    private final HN f24521e;

    public C3386mU(Context context, Executor executor, AbstractC4241uH abstractC4241uH, C3676p60 c3676p60, HN hn) {
        this.f24517a = context;
        this.f24518b = abstractC4241uH;
        this.f24519c = executor;
        this.f24520d = c3676p60;
        this.f24521e = hn;
    }

    private static String e(C3785q60 c3785q60) {
        try {
            return c3785q60.f25820v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        Context context = this.f24517a;
        return (context instanceof Activity) && C1517Lf.g(context) && !TextUtils.isEmpty(e(c3785q60));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Uc)).booleanValue()) {
            GN a8 = this.f24521e.a();
            a8.b("action", "cstm_tbs_rndr");
            a8.g();
        }
        String e8 = e(c3785q60);
        final Uri parse = e8 != null ? Uri.parse(e8) : null;
        final C4111t60 c4111t60 = c60.f14101b.f13520b;
        return AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.kU
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f23598a.c(parse, c60, c3785q60, c4111t60, obj);
            }
        }, this.f24519c);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(Uri uri, C60 c60, C3785q60 c3785q60, C4111t60 c4111t60, Object obj) {
        try {
            androidx.browser.customtabs.d a8 = new d.C0141d().a();
            a8.f7999a.setData(uri);
            F2.l lVar = new F2.l(a8.f7999a, null);
            final C1811Tq c1811Tq = new C1811Tq();
            QG c8 = this.f24518b.c(new C2161bA(c60, c3785q60, null), new TG(new CH() { // from class: com.google.android.gms.internal.ads.lU
                @Override // com.google.android.gms.internal.ads.CH
                public final void a(boolean z7, Context context, C4558xC c4558xC) {
                    this.f24323a.d(c1811Tq, z7, context, c4558xC);
                }
            }, null));
            c1811Tq.c(new AdOverlayInfoParcel(lVar, null, c8.h(), null, new H2.a(0, 0, false), null, null, c4111t60.f26832b));
            this.f24520d.a();
            return AbstractC2326ck0.h(c8.i());
        } catch (Throwable th) {
            H2.p.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ void d(C1811Tq c1811Tq, boolean z7, Context context, C4558xC c4558xC) {
        try {
            C2.v.m();
            F2.y.a(context, (AdOverlayInfoParcel) c1811Tq.get(), true, this.f24521e);
        } catch (Exception unused) {
        }
    }
}
