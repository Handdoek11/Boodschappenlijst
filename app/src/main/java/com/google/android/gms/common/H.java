package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class H extends J {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f13201f;

    /* synthetic */ H(Callable callable, G g8) {
        super();
        this.f13201f = callable;
    }

    @Override // com.google.android.gms.common.J
    final String a() {
        try {
            return (String) this.f13201f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
