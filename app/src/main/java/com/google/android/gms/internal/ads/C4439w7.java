package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4439w7 implements InterfaceC3241l7 {

    /* renamed from: a, reason: collision with root package name */
    private File f27460a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f27461b;

    C4439w7(Context context) {
        this.f27461b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3241l7
    public final File zza() {
        if (this.f27460a == null) {
            this.f27460a = new File(this.f27461b.getCacheDir(), "volley");
        }
        return this.f27460a;
    }
}
