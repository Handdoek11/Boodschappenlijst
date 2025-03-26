package com.google.android.gms.ads.internal.overlay;

import C2.v;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class c implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final long f13104o;

    c(long j8) {
        this.f13104o = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f13069Q.remove(Long.valueOf(this.f13104o)) == null) {
            return null;
        }
        v.s().x(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
