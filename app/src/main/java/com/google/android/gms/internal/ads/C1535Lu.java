package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.Lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535Lu implements InterfaceC2462dy0 {
    public C1535Lu(C1179Bu c1179Bu) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
