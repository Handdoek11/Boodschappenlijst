package com.google.android.gms.common.api;

import X2.C0754b;
import Z2.r;
import android.text.TextUtils;
import com.google.android.gms.common.C1103b;
import java.util.ArrayList;
import q.C6397a;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final C6397a f13211o;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z7 = true;
        for (C0754b c0754b : this.f13211o.keySet()) {
            C1103b c1103b = (C1103b) r.l((C1103b) this.f13211o.get(c0754b));
            z7 &= !c1103b.E0();
            arrayList.add(c0754b.b() + ": " + String.valueOf(c1103b));
        }
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
