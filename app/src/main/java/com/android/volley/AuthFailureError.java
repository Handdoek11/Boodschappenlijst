package com.android.volley;

import android.content.Intent;

/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: o, reason: collision with root package name */
    private Intent f12496o;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f12496o != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
