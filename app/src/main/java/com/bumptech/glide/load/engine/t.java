package com.bumptech.glide.load.engine;

import d2.AbstractC5710l;
import d2.C5706h;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class t implements J1.e {

    /* renamed from: j, reason: collision with root package name */
    private static final C5706h f12852j = new C5706h(50);

    /* renamed from: b, reason: collision with root package name */
    private final M1.b f12853b;

    /* renamed from: c, reason: collision with root package name */
    private final J1.e f12854c;

    /* renamed from: d, reason: collision with root package name */
    private final J1.e f12855d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12856e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12857f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f12858g;

    /* renamed from: h, reason: collision with root package name */
    private final J1.h f12859h;

    /* renamed from: i, reason: collision with root package name */
    private final J1.l f12860i;

    t(M1.b bVar, J1.e eVar, J1.e eVar2, int i8, int i9, J1.l lVar, Class cls, J1.h hVar) {
        this.f12853b = bVar;
        this.f12854c = eVar;
        this.f12855d = eVar2;
        this.f12856e = i8;
        this.f12857f = i9;
        this.f12860i = lVar;
        this.f12858g = cls;
        this.f12859h = hVar;
    }

    private byte[] c() {
        C5706h c5706h = f12852j;
        byte[] bArr = (byte[]) c5706h.g(this.f12858g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f12858g.getName().getBytes(J1.e.f3470a);
        c5706h.k(this.f12858g, bytes);
        return bytes;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f12853b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f12856e).putInt(this.f12857f).array();
        this.f12855d.b(messageDigest);
        this.f12854c.b(messageDigest);
        messageDigest.update(bArr);
        J1.l lVar = this.f12860i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f12859h.b(messageDigest);
        messageDigest.update(c());
        this.f12853b.d(bArr);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f12857f == tVar.f12857f && this.f12856e == tVar.f12856e && AbstractC5710l.d(this.f12860i, tVar.f12860i) && this.f12858g.equals(tVar.f12858g) && this.f12854c.equals(tVar.f12854c) && this.f12855d.equals(tVar.f12855d) && this.f12859h.equals(tVar.f12859h);
    }

    @Override // J1.e
    public int hashCode() {
        int hashCode = (((((this.f12854c.hashCode() * 31) + this.f12855d.hashCode()) * 31) + this.f12856e) * 31) + this.f12857f;
        J1.l lVar = this.f12860i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f12858g.hashCode()) * 31) + this.f12859h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f12854c + ", signature=" + this.f12855d + ", width=" + this.f12856e + ", height=" + this.f12857f + ", decodedResourceClass=" + this.f12858g + ", transformation='" + this.f12860i + "', options=" + this.f12859h + '}';
    }
}
