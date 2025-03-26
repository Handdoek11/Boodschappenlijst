package j2;

import h2.C5829c;
import java.util.Arrays;

/* renamed from: j2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6059h {

    /* renamed from: a, reason: collision with root package name */
    private final C5829c f38206a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38207b;

    public C6059h(C5829c c5829c, byte[] bArr) {
        if (c5829c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f38206a = c5829c;
        this.f38207b = bArr;
    }

    public byte[] a() {
        return this.f38207b;
    }

    public C5829c b() {
        return this.f38206a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6059h)) {
            return false;
        }
        C6059h c6059h = (C6059h) obj;
        if (this.f38206a.equals(c6059h.f38206a)) {
            return Arrays.equals(this.f38207b, c6059h.f38207b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38206a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38207b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f38206a + ", bytes=[...]}";
    }
}
