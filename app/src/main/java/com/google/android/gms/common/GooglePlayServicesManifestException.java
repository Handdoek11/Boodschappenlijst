package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    private final int f13198o;

    public GooglePlayServicesManifestException(int i8, String str) {
        super(str);
        this.f13198o = i8;
    }
}
