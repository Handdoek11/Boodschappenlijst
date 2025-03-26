package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.google.android.gms.internal.ads.jI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3046jI0 implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4789zI0 f23235a;

    C3046jI0(C3917rI0 c3917rI0, C4789zI0 c4789zI0) {
        this.f23235a = c4789zI0;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
        this.f23235a.u();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
        this.f23235a.u();
    }
}
