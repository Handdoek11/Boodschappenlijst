package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4600xf {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27892a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C4818zf f27893b;

    public C4600xf(C4818zf c4818zf) {
        this.f27893b = c4818zf;
    }

    public final C4818zf a() {
        return this.f27893b;
    }

    public final void b(String str, C4491wf c4491wf) {
        this.f27892a.put(str, c4491wf);
    }

    public final void c(String str, String str2, long j8) {
        C4491wf c4491wf = (C4491wf) this.f27892a.get(str2);
        String[] strArr = {str};
        if (c4491wf != null) {
            this.f27893b.e(c4491wf, j8, strArr);
        }
        this.f27892a.put(str, new C4491wf(j8, null, null));
    }
}
