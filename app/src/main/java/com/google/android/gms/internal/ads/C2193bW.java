package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2193bW implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20884a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20885b;

    /* renamed from: c, reason: collision with root package name */
    private final NL f20886c;

    public C2193bW(Context context, Executor executor, NL nl) {
        this.f20884a = context;
        this.f20885b = executor;
        this.f20886c = nl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            ((C3024j70) c4801zT.f28627b).p(c60.f14100a.f28044a.f16766d, c3785q60.f25820v.toString());
        } catch (Exception e8) {
            H2.p.h("Fail to load ad from adapter ".concat(String.valueOf(c4801zT.f28626a)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        if (((C3024j70) c4801zT.f28627b).c()) {
            e(c60, c3785q60, c4801zT);
            return;
        }
        ((BinderC4257uU) c4801zT.f28628c).v7(new ZV(this, c60, c3785q60, c4801zT));
        Object obj = c4801zT.f28627b;
        Context context = this.f20884a;
        L60 l60 = c60.f14100a.f28044a;
        ((C3024j70) obj).m(context, l60.f16766d, null, (InterfaceC1879Vo) c4801zT.f28628c, c3785q60.f25820v.toString());
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, final C4801zT c4801zT) {
        JL d8 = this.f20886c.d(new C2161bA(c60, c3785q60, c4801zT.f28626a), new KL(new CH() { // from class: com.google.android.gms.internal.ads.XV
            @Override // com.google.android.gms.internal.ads.CH
            public final void a(boolean z7, Context context, C4558xC c4558xC) {
                C4801zT c4801zT2 = c4801zT;
                try {
                    ((C3024j70) c4801zT2.f28627b).A(z7);
                    ((C3024j70) c4801zT2.f28627b).a();
                } catch (zzfcq e8) {
                    H2.p.h("Cannot show rewarded video.", e8);
                    throw new zzdgb(e8.getCause());
                }
            }
        }));
        d8.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f20885b);
        SC d9 = d8.d();
        C2817hC a8 = d8.a();
        ((BinderC4257uU) c4801zT.f28628c).u7(new BinderC2084aW(this, d8.h(), a8, d9, d8.i()));
        return d8.k();
    }
}
