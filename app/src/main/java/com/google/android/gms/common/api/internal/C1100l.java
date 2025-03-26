package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100l {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13340a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f13341b = DesugarCollections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z7, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f13340a) {
            hashMap = new HashMap(this.f13340a);
        }
        synchronized (this.f13341b) {
            hashMap2 = new HashMap(this.f13341b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0377k) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z7) {
        this.f13340a.put(basePendingResult, Boolean.valueOf(z7));
        basePendingResult.b(new C1098j(this, basePendingResult));
    }

    final void d(C0377k c0377k, boolean z7) {
        this.f13341b.put(c0377k, Boolean.valueOf(z7));
        c0377k.a().c(new C1099k(this, c0377k));
    }

    final void e(int i8, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i8 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i8 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, C1091c.f13290G);
    }

    final boolean g() {
        return (this.f13340a.isEmpty() && this.f13341b.isEmpty()) ? false : true;
    }
}
