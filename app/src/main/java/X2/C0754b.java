package X2;

import Z2.AbstractC0777p;
import com.google.android.gms.common.api.a;

/* renamed from: X2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754b {

    /* renamed from: a, reason: collision with root package name */
    private final int f5920a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f5921b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f5922c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5923d;

    private C0754b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f5921b = aVar;
        this.f5922c = dVar;
        this.f5923d = str;
        this.f5920a = AbstractC0777p.b(aVar, dVar, str);
    }

    public static C0754b a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        return new C0754b(aVar, dVar, str);
    }

    public final String b() {
        return this.f5921b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0754b)) {
            return false;
        }
        C0754b c0754b = (C0754b) obj;
        return AbstractC0777p.a(this.f5921b, c0754b.f5921b) && AbstractC0777p.a(this.f5922c, c0754b.f5922c) && AbstractC0777p.a(this.f5923d, c0754b.f5923d);
    }

    public final int hashCode() {
        return this.f5920a;
    }
}
