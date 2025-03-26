package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    protected final Status f13210o;

    public ApiException(Status status) {
        super(status.B0() + ": " + (status.C0() != null ? status.C0() : ""));
        this.f13210o = status;
    }

    public Status a() {
        return this.f13210o;
    }

    public int b() {
        return this.f13210o.B0();
    }
}
