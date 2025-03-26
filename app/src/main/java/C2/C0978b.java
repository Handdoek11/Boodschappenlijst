package c2;

import J1.e;
import d2.AbstractC5709k;
import java.security.MessageDigest;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978b implements e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f12110b;

    public C0978b(Object obj) {
        this.f12110b = AbstractC5709k.d(obj);
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f12110b.toString().getBytes(e.f3470a));
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (obj instanceof C0978b) {
            return this.f12110b.equals(((C0978b) obj).f12110b);
        }
        return false;
    }

    @Override // J1.e
    public int hashCode() {
        return this.f12110b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f12110b + '}';
    }
}
