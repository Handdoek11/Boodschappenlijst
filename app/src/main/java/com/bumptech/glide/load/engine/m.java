package com.bumptech.glide.load.engine;

import d2.AbstractC5709k;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class m implements J1.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f12815b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12816c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12817d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f12818e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f12819f;

    /* renamed from: g, reason: collision with root package name */
    private final J1.e f12820g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f12821h;

    /* renamed from: i, reason: collision with root package name */
    private final J1.h f12822i;

    /* renamed from: j, reason: collision with root package name */
    private int f12823j;

    m(Object obj, J1.e eVar, int i8, int i9, Map map, Class cls, Class cls2, J1.h hVar) {
        this.f12815b = AbstractC5709k.d(obj);
        this.f12820g = (J1.e) AbstractC5709k.e(eVar, "Signature must not be null");
        this.f12816c = i8;
        this.f12817d = i9;
        this.f12821h = (Map) AbstractC5709k.d(map);
        this.f12818e = (Class) AbstractC5709k.e(cls, "Resource class must not be null");
        this.f12819f = (Class) AbstractC5709k.e(cls2, "Transcode class must not be null");
        this.f12822i = (J1.h) AbstractC5709k.d(hVar);
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12815b.equals(mVar.f12815b) && this.f12820g.equals(mVar.f12820g) && this.f12817d == mVar.f12817d && this.f12816c == mVar.f12816c && this.f12821h.equals(mVar.f12821h) && this.f12818e.equals(mVar.f12818e) && this.f12819f.equals(mVar.f12819f) && this.f12822i.equals(mVar.f12822i);
    }

    @Override // J1.e
    public int hashCode() {
        if (this.f12823j == 0) {
            int hashCode = this.f12815b.hashCode();
            this.f12823j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f12820g.hashCode()) * 31) + this.f12816c) * 31) + this.f12817d;
            this.f12823j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f12821h.hashCode();
            this.f12823j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f12818e.hashCode();
            this.f12823j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f12819f.hashCode();
            this.f12823j = hashCode5;
            this.f12823j = (hashCode5 * 31) + this.f12822i.hashCode();
        }
        return this.f12823j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f12815b + ", width=" + this.f12816c + ", height=" + this.f12817d + ", resourceClass=" + this.f12818e + ", transcodeClass=" + this.f12819f + ", signature=" + this.f12820g + ", hashCode=" + this.f12823j + ", transformations=" + this.f12821h + ", options=" + this.f12822i + '}';
    }
}
