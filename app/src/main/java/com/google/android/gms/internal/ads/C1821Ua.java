package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821Ua extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private List f19416y;

    /* renamed from: z, reason: collision with root package name */
    private final Context f19417z;

    public C1821Ua(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, Context context) {
        super(c3610oa, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c2918i8, i8, 31);
        this.f19416y = null;
        this.f19417z = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        this.f21840u.Y(-1L);
        this.f21840u.U(-1L);
        Context context = this.f19417z;
        if (context == null) {
            context = this.f21837o.b();
        }
        if (this.f19416y == null) {
            this.f19416y = (List) this.f21841v.invoke(null, context);
        }
        List list = this.f19416y;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f21840u) {
            this.f21840u.Y(((Long) this.f19416y.get(0)).longValue());
            this.f21840u.U(((Long) this.f19416y.get(1)).longValue());
        }
    }
}
