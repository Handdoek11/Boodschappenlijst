package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.ge0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2749ge0 {

    /* renamed from: h, reason: collision with root package name */
    static final String f22404h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f22405a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22406b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22407c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22408d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22409e;

    /* renamed from: f, reason: collision with root package name */
    final C2640fe0 f22410f;

    /* renamed from: g, reason: collision with root package name */
    final C2531ee0 f22411g;

    AbstractC2749ge0(Context context, String str, String str2, String str3) {
        this.f22410f = C2640fe0.b(context);
        this.f22411g = C2531ee0.a(context);
        this.f22405a = str;
        this.f22406b = str.concat("_3p");
        this.f22407c = str2;
        this.f22408d = str2.concat("_3p");
        this.f22409e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f22409e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }

    final long a(boolean z7) {
        return this.f22410f.a(z7 ? this.f22408d : this.f22407c, -1L);
    }

    final C2423de0 b(String str, String str2, long j8, boolean z7) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f22404h)) {
                    String e8 = e(true);
                    String c8 = this.f22410f.c("paid_3p_hash_key", null);
                    if (e8 != null && c8 != null && !e8.equals(h(str, str2, c8))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C2423de0();
        }
        boolean z8 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f22409e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long a8 = a(z8);
        if (a8 != -1) {
            if (currentTimeMillis < a8) {
                this.f22410f.d(z8 ? this.f22408d : this.f22407c, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= a8 + j8) {
                return c(str, str2);
            }
        }
        String e9 = e(z8);
        return (e9 != null || z7) ? new C2423de0(e9, a(z8)) : c(str, str2);
    }

    final C2423de0 c(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f22410f.d("paid_3p_hash_key", uuid);
        return d(h(str, str2, uuid), true);
    }

    final C2423de0 d(String str, boolean z7) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f22409e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f22410f.d(z7 ? this.f22408d : this.f22407c, Long.valueOf(currentTimeMillis));
        this.f22410f.d(z7 ? this.f22406b : this.f22405a, str);
        return new C2423de0(str, currentTimeMillis);
    }

    final String e(boolean z7) {
        return this.f22410f.c(z7 ? this.f22406b : this.f22405a, null);
    }

    final void f(boolean z7) {
        this.f22410f.e(z7 ? this.f22408d : this.f22407c);
        this.f22410f.e(z7 ? this.f22406b : this.f22405a);
    }

    final boolean g(boolean z7) {
        return this.f22410f.g(this.f22405a);
    }
}
