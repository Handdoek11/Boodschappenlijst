package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class P2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ N2 f28980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2(N2 n22, Handler handler) {
        super(null);
        this.f28980a = n22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        this.f28980a.f28948a.set(true);
    }
}
