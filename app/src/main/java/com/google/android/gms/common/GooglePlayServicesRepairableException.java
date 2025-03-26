package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: s, reason: collision with root package name */
    private final int f13200s;

    public GooglePlayServicesRepairableException(int i8, String str, Intent intent) {
        super(str, intent);
        this.f13200s = i8;
    }
}
