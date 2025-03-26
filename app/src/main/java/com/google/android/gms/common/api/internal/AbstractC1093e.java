package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1092d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1093e {
    public static C1092d a(Object obj, Looper looper, String str) {
        Z2.r.m(obj, "Listener must not be null");
        Z2.r.m(looper, "Looper must not be null");
        Z2.r.m(str, "Listener type must not be null");
        return new C1092d(looper, obj, str);
    }

    public static C1092d b(Object obj, Executor executor, String str) {
        Z2.r.m(obj, "Listener must not be null");
        Z2.r.m(executor, "Executor must not be null");
        Z2.r.m(str, "Listener type must not be null");
        return new C1092d(executor, obj, str);
    }

    public static C1092d.a c(Object obj, String str) {
        Z2.r.m(obj, "Listener must not be null");
        Z2.r.m(str, "Listener type must not be null");
        Z2.r.g(str, "Listener type must not be empty");
        return new C1092d.a(obj, str);
    }
}
