package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final B f37242c = new B();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37243a;

    /* renamed from: b, reason: collision with root package name */
    private final double f37244b;

    private B() {
        this.f37243a = false;
        this.f37244b = Double.NaN;
    }

    public static B a() {
        return f37242c;
    }

    private B(double d8) {
        this.f37243a = true;
        this.f37244b = d8;
    }

    public static B d(double d8) {
        return new B(d8);
    }

    public final double b() {
        if (!this.f37243a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37244b;
    }

    public final boolean c() {
        return this.f37243a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        boolean z7 = this.f37243a;
        if (z7 && b8.f37243a) {
            if (Double.compare(this.f37244b, b8.f37244b) == 0) {
                return true;
            }
        } else if (z7 == b8.f37243a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f37243a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f37244b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f37243a) {
            return "OptionalDouble[" + this.f37244b + "]";
        }
        return "OptionalDouble.empty";
    }
}
