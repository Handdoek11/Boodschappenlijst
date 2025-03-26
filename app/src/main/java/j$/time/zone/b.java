package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5889i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37211a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalDateTime f37212b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneOffset f37213c;

    /* renamed from: d, reason: collision with root package name */
    private final ZoneOffset f37214d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f37211a, ((b) obj).f37211a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f37211a = AbstractC5889i.n(localDateTime, zoneOffset);
        this.f37212b = localDateTime;
        this.f37213c = zoneOffset;
        this.f37214d = zoneOffset2;
    }

    b(long j8, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f37211a = j8;
        this.f37212b = LocalDateTime.L(j8, 0, zoneOffset);
        this.f37213c = zoneOffset;
        this.f37214d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f37211a, objectOutput);
        a.d(this.f37213c, objectOutput);
        a.d(this.f37214d, objectOutput);
    }

    public final long B() {
        return this.f37211a;
    }

    public final LocalDateTime k() {
        return this.f37212b;
    }

    public final ZoneOffset s() {
        return this.f37213c;
    }

    public final ZoneOffset n() {
        return this.f37214d;
    }

    public final LocalDateTime j() {
        return this.f37212b.N(this.f37214d.I() - this.f37213c.I());
    }

    public final Duration m() {
        return Duration.m(this.f37214d.I() - this.f37213c.I());
    }

    public final boolean w() {
        return this.f37214d.I() > this.f37213c.I();
    }

    final List v() {
        return w() ? Collections.emptyList() : j$.com.android.tools.r8.a.f(new Object[]{this.f37213c, this.f37214d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37211a == bVar.f37211a && this.f37213c.equals(bVar.f37213c) && this.f37214d.equals(bVar.f37214d);
    }

    public final int hashCode() {
        return (this.f37212b.hashCode() ^ this.f37213c.hashCode()) ^ Integer.rotateLeft(this.f37214d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(w() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f37212b);
        sb.append(this.f37213c);
        sb.append(" to ");
        sb.append(this.f37214d);
        sb.append(']');
        return sb.toString();
    }
}
