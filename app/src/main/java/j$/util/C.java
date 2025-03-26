package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f37245c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37246a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37247b;

    private C() {
        this.f37246a = false;
        this.f37247b = 0;
    }

    public static C a() {
        return f37245c;
    }

    private C(int i8) {
        this.f37246a = true;
        this.f37247b = i8;
    }

    public static C d(int i8) {
        return new C(i8);
    }

    public final int b() {
        if (!this.f37246a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37247b;
    }

    public final boolean c() {
        return this.f37246a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        boolean z7 = this.f37246a;
        if (z7 && c8.f37246a) {
            if (this.f37247b == c8.f37247b) {
                return true;
            }
        } else if (z7 == c8.f37246a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f37246a) {
            return this.f37247b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f37246a) {
            return "OptionalInt[" + this.f37247b + "]";
        }
        return "OptionalInt.empty";
    }
}
