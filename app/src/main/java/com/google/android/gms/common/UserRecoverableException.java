package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final Intent f13207o;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f13207o = intent;
    }
}
