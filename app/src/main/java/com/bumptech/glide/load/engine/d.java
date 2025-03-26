package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements J1.e {

    /* renamed from: b, reason: collision with root package name */
    private final J1.e f12674b;

    /* renamed from: c, reason: collision with root package name */
    private final J1.e f12675c;

    d(J1.e eVar, J1.e eVar2) {
        this.f12674b = eVar;
        this.f12675c = eVar2;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        this.f12674b.b(messageDigest);
        this.f12675c.b(messageDigest);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12674b.equals(dVar.f12674b) && this.f12675c.equals(dVar.f12675c);
    }

    @Override // J1.e
    public int hashCode() {
        return (this.f12674b.hashCode() * 31) + this.f12675c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f12674b + ", signature=" + this.f12675c + '}';
    }
}
