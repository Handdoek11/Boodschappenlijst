package com.google.android.gms.internal.ads;

import G2.AbstractC0590g0;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1759Se {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18934a;

    public C1759Se(Context context) {
        Z2.r.m(context, "Context can not be null");
        this.f18934a = context;
    }

    public final boolean a(Intent intent) {
        Z2.r.m(intent, "Intent can not be null");
        return !this.f18934a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) AbstractC0590g0.a(this.f18934a, new Callable() { // from class: com.google.android.gms.internal.ads.Re
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && h3.e.a(this.f18934a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
