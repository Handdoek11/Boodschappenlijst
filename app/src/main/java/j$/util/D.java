package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    private static final D f37248c = new D();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37249a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37250b;

    private D() {
        this.f37249a = false;
        this.f37250b = 0L;
    }

    public static D a() {
        return f37248c;
    }

    private D(long j8) {
        this.f37249a = true;
        this.f37250b = j8;
    }

    public static D d(long j8) {
        return new D(j8);
    }

    public final long b() {
        if (!this.f37249a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37250b;
    }

    public final boolean c() {
        return this.f37249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        boolean z7 = this.f37249a;
        if (z7 && d8.f37249a) {
            if (this.f37250b == d8.f37250b) {
                return true;
            }
        } else if (z7 == d8.f37249a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f37249a) {
            return 0;
        }
        long j8 = this.f37250b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        if (this.f37249a) {
            return "OptionalLong[" + this.f37250b + "]";
        }
        return "OptionalLong.empty";
    }
}
