package T6;

import J6.r;

/* loaded from: classes2.dex */
abstract class f extends e {
    public static final d d(char c8, boolean z7) {
        if (!z7) {
            if (c8 == 'D') {
                return d.f5310y;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 == 'H') {
            return d.f5309x;
        }
        if (c8 == 'M') {
            return d.f5308w;
        }
        if (c8 == 'S') {
            return d.f5307v;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
    }

    public static final d e(String str) {
        r.e(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return d.f5305t;
                                }
                            } else if (str.equals("ns")) {
                                return d.f5304s;
                            }
                        } else if (str.equals("ms")) {
                            return d.f5306u;
                        }
                    } else if (str.equals("s")) {
                        return d.f5307v;
                    }
                } else if (str.equals("m")) {
                    return d.f5308w;
                }
            } else if (str.equals("h")) {
                return d.f5309x;
            }
        } else if (str.equals("d")) {
            return d.f5310y;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
