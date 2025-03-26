package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
abstract class X0 {
    static String a(Q q8) {
        StringBuilder sb = new StringBuilder(q8.d());
        for (int i8 = 0; i8 < q8.d(); i8++) {
            byte b8 = q8.b(i8);
            if (b8 == 34) {
                sb.append("\\\"");
            } else if (b8 == 39) {
                sb.append("\\'");
            } else if (b8 != 92) {
                switch (b8) {
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
                        if (b8 < 32 || b8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b8 >>> 6) & 3) + 48));
                            sb.append((char) (((b8 >>> 3) & 7) + 48));
                            sb.append((char) ((b8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b8);
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
