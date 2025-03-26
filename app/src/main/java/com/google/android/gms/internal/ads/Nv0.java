package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class Nv0 {
    static String a(AbstractC3542nu0 abstractC3542nu0) {
        StringBuilder sb = new StringBuilder(abstractC3542nu0.j());
        for (int i8 = 0; i8 < abstractC3542nu0.j(); i8++) {
            byte c8 = abstractC3542nu0.c(i8);
            if (c8 == 34) {
                sb.append("\\\"");
            } else if (c8 == 39) {
                sb.append("\\'");
            } else if (c8 != 92) {
                switch (c8) {
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
                        if (c8 < 32 || c8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c8 >>> 6) & 3) + 48));
                            sb.append((char) (((c8 >>> 3) & 7) + 48));
                            sb.append((char) ((c8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c8);
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
