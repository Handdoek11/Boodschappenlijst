package com.google.android.gms.common.api;

import com.google.android.gms.common.C1105d;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: o, reason: collision with root package name */
    private final C1105d f13227o;

    public UnsupportedApiCallException(C1105d c1105d) {
        this.f13227o = c1105d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f13227o));
    }
}
