package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.wS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4473wS extends BS {

    /* renamed from: a, reason: collision with root package name */
    private final String f27491a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27492b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f27493c;

    C4473wS(String str, String str2, Drawable drawable) {
        this.f27491a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f27492b = str2;
        this.f27493c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.BS
    final Drawable a() {
        return this.f27493c;
    }

    @Override // com.google.android.gms.internal.ads.BS
    final String b() {
        return this.f27491a;
    }

    @Override // com.google.android.gms.internal.ads.BS
    final String c() {
        return this.f27492b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BS) {
            BS bs = (BS) obj;
            String str = this.f27491a;
            if (str != null ? str.equals(bs.b()) : bs.b() == null) {
                if (this.f27492b.equals(bs.c()) && ((drawable = this.f27493c) != null ? drawable.equals(bs.a()) : bs.a() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27491a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27492b.hashCode();
        Drawable drawable = this.f27493c;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f27491a + ", imageUrl=" + this.f27492b + ", icon=" + String.valueOf(this.f27493c) + "}";
    }
}
