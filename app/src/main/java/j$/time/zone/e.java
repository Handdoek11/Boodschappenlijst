package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.p;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    private final m f37217a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f37218b;

    /* renamed from: c, reason: collision with root package name */
    private final j$.time.e f37219c;

    /* renamed from: d, reason: collision with root package name */
    private final k f37220d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37221e;

    /* renamed from: f, reason: collision with root package name */
    private final d f37222f;

    /* renamed from: g, reason: collision with root package name */
    private final ZoneOffset f37223g;

    /* renamed from: h, reason: collision with root package name */
    private final ZoneOffset f37224h;

    /* renamed from: i, reason: collision with root package name */
    private final ZoneOffset f37225i;

    e(m mVar, int i8, j$.time.e eVar, k kVar, boolean z7, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f37217a = mVar;
        this.f37218b = (byte) i8;
        this.f37219c = eVar;
        this.f37220d = kVar;
        this.f37221e = z7;
        this.f37222f = dVar;
        this.f37223g = zoneOffset;
        this.f37224h = zoneOffset2;
        this.f37225i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        k kVar = this.f37220d;
        boolean z7 = this.f37221e;
        int T7 = z7 ? 86400 : kVar.T();
        int I7 = this.f37223g.I();
        ZoneOffset zoneOffset = this.f37224h;
        int I8 = zoneOffset.I() - I7;
        ZoneOffset zoneOffset2 = this.f37225i;
        int I9 = zoneOffset2.I() - I7;
        int G7 = T7 % 3600 == 0 ? z7 ? 24 : kVar.G() : 31;
        int i8 = I7 % 900 == 0 ? (I7 / 900) + 128 : 255;
        int i9 = (I8 == 0 || I8 == 1800 || I8 == 3600) ? I8 / 1800 : 3;
        int i10 = (I9 == 0 || I9 == 1800 || I9 == 3600) ? I9 / 1800 : 3;
        j$.time.e eVar = this.f37219c;
        objectOutput.writeInt((this.f37217a.getValue() << 28) + ((this.f37218b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (G7 << 14) + (this.f37222f.ordinal() << 12) + (i8 << 4) + (i9 << 2) + i10);
        if (G7 == 31) {
            objectOutput.writeInt(T7);
        }
        if (i8 == 255) {
            objectOutput.writeInt(I7);
        }
        if (i9 == 3) {
            objectOutput.writeInt(zoneOffset.I());
        }
        if (i10 == 3) {
            objectOutput.writeInt(zoneOffset2.I());
        }
    }

    static e b(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        m F7 = m.F(readInt >>> 28);
        int i8 = ((264241152 & readInt) >>> 22) - 32;
        int i9 = (3670016 & readInt) >>> 19;
        j$.time.e C7 = i9 == 0 ? null : j$.time.e.C(i9);
        int i10 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i11 = (readInt & 4080) >>> 4;
        int i12 = (readInt & 12) >>> 2;
        int i13 = readInt & 3;
        k L7 = i10 == 31 ? k.L(objectInput.readInt()) : k.J(i10 % 24);
        ZoneOffset L8 = ZoneOffset.L(i11 == 255 ? objectInput.readInt() : (i11 - 128) * 900);
        ZoneOffset L9 = i12 == 3 ? ZoneOffset.L(objectInput.readInt()) : ZoneOffset.L((i12 * 1800) + L8.I());
        ZoneOffset L10 = i13 == 3 ? ZoneOffset.L(objectInput.readInt()) : ZoneOffset.L((i13 * 1800) + L8.I());
        boolean z7 = i10 == 24;
        Objects.requireNonNull(F7, "month");
        Objects.requireNonNull(L7, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(L8, "standardOffset");
        Objects.requireNonNull(L9, "offsetBefore");
        Objects.requireNonNull(L10, "offsetAfter");
        if (i8 < -28 || i8 > 31 || i8 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z7 && !L7.equals(k.f37142g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (L7.H() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(F7, i8, C7, L7, z7, dVar, L8, L9, L10);
    }

    public final b a(int i8) {
        j$.time.h O7;
        j$.time.e eVar = this.f37219c;
        m mVar = this.f37217a;
        byte b8 = this.f37218b;
        if (b8 < 0) {
            u.f37068d.getClass();
            O7 = j$.time.h.O(i8, mVar, mVar.D(u.m(i8)) + 1 + b8);
            if (eVar != null) {
                final int value = eVar.getValue();
                final int i9 = 1;
                O7 = O7.m(new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m w(m mVar2) {
                        switch (i9) {
                            case 0:
                                int k8 = mVar2.k(a.DAY_OF_WEEK);
                                int i10 = value;
                                if (k8 == i10) {
                                    return mVar2;
                                }
                                return mVar2.e(k8 - i10 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int k9 = mVar2.k(a.DAY_OF_WEEK);
                                int i11 = value;
                                if (k9 == i11) {
                                    return mVar2;
                                }
                                return mVar2.j(i11 - k9 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                });
            }
        } else {
            O7 = j$.time.h.O(i8, mVar, b8);
            if (eVar != null) {
                final int value2 = eVar.getValue();
                final int i10 = 0;
                O7 = O7.m(new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m w(m mVar2) {
                        switch (i10) {
                            case 0:
                                int k8 = mVar2.k(a.DAY_OF_WEEK);
                                int i102 = value2;
                                if (k8 == i102) {
                                    return mVar2;
                                }
                                return mVar2.e(k8 - i102 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int k9 = mVar2.k(a.DAY_OF_WEEK);
                                int i11 = value2;
                                if (k9 == i11) {
                                    return mVar2;
                                }
                                return mVar2.j(i11 - k9 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                });
            }
        }
        if (this.f37221e) {
            O7 = O7.R(1L);
        }
        LocalDateTime K7 = LocalDateTime.K(O7, this.f37220d);
        d dVar = this.f37222f;
        dVar.getClass();
        int i11 = c.f37215a[dVar.ordinal()];
        ZoneOffset zoneOffset = this.f37224h;
        if (i11 == 1) {
            K7 = K7.N(zoneOffset.I() - ZoneOffset.UTC.I());
        } else if (i11 == 2) {
            K7 = K7.N(zoneOffset.I() - this.f37223g.I());
        }
        return new b(K7, zoneOffset, this.f37225i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37217a == eVar.f37217a && this.f37218b == eVar.f37218b && this.f37219c == eVar.f37219c && this.f37222f == eVar.f37222f && this.f37220d.equals(eVar.f37220d) && this.f37221e == eVar.f37221e && this.f37223g.equals(eVar.f37223g) && this.f37224h.equals(eVar.f37224h) && this.f37225i.equals(eVar.f37225i);
    }

    public final int hashCode() {
        int T7 = ((this.f37220d.T() + (this.f37221e ? 1 : 0)) << 15) + (this.f37217a.ordinal() << 11) + ((this.f37218b + 32) << 5);
        j$.time.e eVar = this.f37219c;
        return ((this.f37223g.hashCode() ^ (this.f37222f.ordinal() + (T7 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f37224h.hashCode()) ^ this.f37225i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f37224h;
        ZoneOffset zoneOffset2 = this.f37225i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        m mVar = this.f37217a;
        byte b8 = this.f37218b;
        j$.time.e eVar = this.f37219c;
        if (eVar == null) {
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b8);
        } else if (b8 == -1) {
            sb.append(eVar.name());
            sb.append(" on or before last day of ");
            sb.append(mVar.name());
        } else if (b8 < 0) {
            sb.append(eVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b8) - 1);
            sb.append(" of ");
            sb.append(mVar.name());
        } else {
            sb.append(eVar.name());
            sb.append(" on or after ");
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b8);
        }
        sb.append(" at ");
        sb.append(this.f37221e ? "24:00" : this.f37220d.toString());
        sb.append(" ");
        sb.append(this.f37222f);
        sb.append(", standard offset ");
        sb.append(this.f37223g);
        sb.append(']');
        return sb.toString();
    }
}
