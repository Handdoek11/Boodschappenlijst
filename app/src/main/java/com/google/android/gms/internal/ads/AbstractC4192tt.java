package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* renamed from: com.google.android.gms.internal.ads.tt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract /* synthetic */ class AbstractC4192tt {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f26945a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f26945a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26945a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26945a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26945a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26945a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
