package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.o d8 = pVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d8.f(aVar) ? Long.valueOf(pVar.d().s(aVar)) : null;
        int i8 = 0;
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        int w7 = aVar.w(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j8 = longValue - 253402300800L;
            long i9 = j$.com.android.tools.r8.a.i(j8, 315569520000L) + 1;
            LocalDateTime L7 = LocalDateTime.L(j$.com.android.tools.r8.a.h(j8, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (i9 > 0) {
                sb.append('+');
                sb.append(i9);
            }
            sb.append(L7);
            if (L7.F() == 0) {
                sb.append(":00");
            }
        } else {
            long j9 = longValue + 62167219200L;
            long j10 = j9 / 315569520000L;
            long j11 = j9 % 315569520000L;
            LocalDateTime L8 = LocalDateTime.L(j11 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(L8);
            if (L8.F() == 0) {
                sb.append(":00");
            }
            if (j10 < 0) {
                if (L8.G() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j10 - 1));
                } else if (j11 == 0) {
                    sb.insert(length, j10);
                } else {
                    sb.insert(length + 1, Math.abs(j10));
                }
            }
        }
        if (w7 > 0) {
            sb.append('.');
            int i10 = 100000000;
            while (true) {
                if (w7 <= 0 && i8 % 3 == 0 && i8 >= -2) {
                    break;
                }
                int i11 = w7 / i10;
                sb.append((char) (i11 + 48));
                w7 -= i11 * i10;
                i10 /= 10;
                i8++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
