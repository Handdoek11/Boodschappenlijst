package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5212w3 {
    static String a(AbstractC5176q2 abstractC5176q2) {
        StringBuilder sb = new StringBuilder(abstractC5176q2.d());
        for (int i8 = 0; i8 < abstractC5176q2.d(); i8++) {
            byte b8 = abstractC5176q2.b(i8);
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
