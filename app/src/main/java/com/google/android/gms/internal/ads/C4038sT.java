package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4038sT {

    /* renamed from: a, reason: collision with root package name */
    private X0.a f26665a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26666b;

    C4038sT(Context context) {
        this.f26666b = context;
    }

    public final com.google.common.util.concurrent.d a() {
        try {
            X0.a a8 = X0.a.a(this.f26666b);
            this.f26665a = a8;
            return a8 == null ? AbstractC2326ck0.g(new IllegalStateException("MeasurementManagerFutures is null")) : a8.b();
        } catch (Exception e8) {
            return AbstractC2326ck0.g(e8);
        }
    }

    public final com.google.common.util.concurrent.d b(Uri uri, InputEvent inputEvent) {
        try {
            X0.a aVar = this.f26665a;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e8) {
            return AbstractC2326ck0.g(e8);
        }
    }
}
