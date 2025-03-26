package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3012j10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final L60 f23162a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f23163b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0611r0 f23164c;

    public C3012j10(L60 l60, PackageInfo packageInfo, InterfaceC0611r0 interfaceC0611r0) {
        this.f23162a = l60;
        this.f23163b = packageInfo;
        this.f23164c = interfaceC0611r0;
    }

    private final void b(Bundle bundle) {
        C1553Mg c1553Mg = this.f23162a.f16771i;
        if (c1553Mg == null || c1553Mg.f17395z == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", c1553Mg.f17385A);
        bundle.putInt("sccg_dir", this.f23162a.f16771i.f17395z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList = this.f23162a.f16769g;
        KB kb = (KB) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        b(kb.f16552b);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3012j10.c(java.lang.Object):void");
    }
}
