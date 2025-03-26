package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class PF extends AbstractC2714gF implements RF {
    public PF(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void C(final String str) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.LF
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).C(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void Z(final String str) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.NF
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).Z(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void b() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.OF
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void c() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.KF
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void m(final String str, final String str2) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.MF
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).m(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void n(String str) {
        final String str2 = "MalformedJson";
        l1(new InterfaceC2605fF(str2) { // from class: com.google.android.gms.internal.ads.JF

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f16152a = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((RF) obj).n(this.f16152a);
            }
        });
    }
}
