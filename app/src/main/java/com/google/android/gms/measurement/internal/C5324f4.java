package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5324f4 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ F3 f30946a;

    C5324f4(F3 f32) {
        this.f30946a = f32;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f30946a.R0("auto", str2, bundle);
        } else {
            this.f30946a.e0("auto", str2, bundle, str);
        }
    }
}
