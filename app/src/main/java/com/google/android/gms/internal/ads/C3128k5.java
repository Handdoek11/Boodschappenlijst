package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3128k5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f23502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23503b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23504c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23505d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC4169th0 f23506e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23507f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23508g;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ C3128k5(Uri uri, String str, I3 i32, AbstractC2577f1 abstractC2577f1, List list, String str2, AbstractC4169th0 abstractC4169th0, Object obj, long j8, AbstractC2372d7 abstractC2372d7) {
        this.f23502a = uri;
        int i8 = AbstractC1650Pc.f18228c;
        this.f23503b = null;
        this.f23504c = list;
        this.f23505d = null;
        this.f23506e = abstractC4169th0;
        C3843qh0 c3843qh0 = new C3843qh0();
        if (abstractC4169th0.size() > 0) {
            androidx.appcompat.app.E.a(abstractC4169th0.get(0));
            throw null;
        }
        c3843qh0.j();
        this.f23507f = null;
        this.f23508g = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3128k5)) {
            return false;
        }
        C3128k5 c3128k5 = (C3128k5) obj;
        if (this.f23502a.equals(c3128k5.f23502a) && this.f23504c.equals(c3128k5.f23504c) && this.f23506e.equals(c3128k5.f23506e)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.f23502a.hashCode() * 923521) + this.f23504c.hashCode()) * 961) + this.f23506e.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
