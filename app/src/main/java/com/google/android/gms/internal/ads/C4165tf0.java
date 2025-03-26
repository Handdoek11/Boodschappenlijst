package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.tf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4165tf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f26910a;

    public C4165tf0(String str) {
        this.f26910a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e8) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e8);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.f26910a, str, objArr));
        }
        return 0;
    }

    public final int b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.f26910a, str, objArr), th);
        }
        return 0;
    }

    public final int c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", e(this.f26910a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", e(this.f26910a, str, objArr));
        }
        return 0;
    }
}
