package com.google.android.gms.internal.consent_sdk;

import a4.C0821e;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzg extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final int f28787o;

    public zzg(int i8, String str) {
        super(str);
        this.f28787o = i8;
    }

    public final C0821e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new C0821e(this.f28787o, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public zzg(int i8, String str, Throwable th) {
        super(str, th);
        this.f28787o = i8;
    }
}
