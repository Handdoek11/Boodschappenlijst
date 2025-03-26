package j$.time.format;

import j$.time.temporal.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class g extends i {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f37093g;

    g(j$.time.temporal.r rVar, int i8, int i9, boolean z7, int i10) {
        super(rVar, i8, i9, u.NOT_NEGATIVE, i10);
        this.f37093g = z7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i b() {
        if (this.f37099e == -1) {
            return this;
        }
        return new g(this.f37095a, this.f37096b, this.f37097c, this.f37093g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c(int i8) {
        return new g(this.f37095a, this.f37096b, this.f37097c, this.f37093g, this.f37099e + i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        ?? r02 = this.f37095a;
        Long e8 = pVar.e(r02);
        if (e8 == null) {
            return false;
        }
        s b8 = pVar.b();
        long longValue = e8.longValue();
        w j8 = r02.j();
        j8.b(longValue, r02);
        BigDecimal valueOf = BigDecimal.valueOf(j8.e());
        BigDecimal add = BigDecimal.valueOf(j8.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z7 = this.f37093g;
        int i8 = this.f37096b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i8), this.f37097c), roundingMode).toPlainString().substring(2);
            b8.getClass();
            if (z7) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i8 <= 0) {
            return true;
        }
        if (z7) {
            b8.getClass();
            sb.append('.');
        }
        for (int i9 = 0; i9 < i8; i9++) {
            b8.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f37095a + "," + this.f37096b + "," + this.f37097c + (this.f37093g ? ",DecimalPoint" : "") + ")";
    }
}
