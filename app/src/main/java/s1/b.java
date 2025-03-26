package S1;

import L1.c;
import d2.AbstractC5709k;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f5075o;

    public b(byte[] bArr) {
        this.f5075o = (byte[]) AbstractC5709k.d(bArr);
    }

    @Override // L1.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f5075o;
    }

    @Override // L1.c
    public int c() {
        return this.f5075o.length;
    }

    @Override // L1.c
    public Class d() {
        return byte[].class;
    }

    @Override // L1.c
    public void b() {
    }
}
