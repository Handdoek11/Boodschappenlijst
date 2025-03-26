package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class S5 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H5 f30714a;

    S5(H5 h52) {
        this.f30714a = h52;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f30714a.j().B(new U5(this, str, str2, bundle));
        } else if (this.f30714a.f30514l != null) {
            this.f30714a.f30514l.h().E().b("AppId not known when logging event", str2);
        }
    }
}
