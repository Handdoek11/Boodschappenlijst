package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5059x5 {
    static String a(K3 k32) {
        C5051w5 c5051w5 = new C5051w5(k32);
        StringBuilder sb = new StringBuilder(c5051w5.zza());
        for (int i8 = 0; i8 < c5051w5.zza(); i8++) {
            byte m8 = c5051w5.m(i8);
            if (m8 == 34) {
                sb.append("\\\"");
            } else if (m8 == 39) {
                sb.append("\\'");
            } else if (m8 != 92) {
                switch (m8) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (m8 < 32 || m8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((m8 >>> 6) & 3) + 48));
                            sb.append((char) (((m8 >>> 3) & 7) + 48));
                            sb.append((char) ((m8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) m8);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
